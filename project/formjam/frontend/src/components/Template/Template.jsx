import { Fab } from '@mui/material';
import AddIcon from '@mui/icons-material/Add';
import React, { useEffect, useState } from 'react';
import axios from 'axios';  // Import Axios
import { Link } from 'react-router-dom';
import "./Template.css"
const Template = () => {
    const [file, setFile] = useState(null);
    const [selectedOption, setSelectedOption] = useState('file');
    const [temp_name, setTempName] = useState('')
    const [mcqs, setMcqs] = useState([])
    const handleToggleChange = (e) => {
        setSelectedOption(e.target.value);
    };

    const handleFileChange = (e) => {
        setFile(e.target.files[0]);
    };

    const baseURL = 'http://localhost:8080'
    const handleFileUpload = async (e) => {
        e.preventDefault()
        try {
            if (!file) {
                console.error('No file selected');
                return;
            }
            const formData = new FormData();
            formData.append('csvFile', file);
            const response = await axios.post(`${baseURL}/api/excel`, formData).then((res) => {
                setMcqs(res.data)
                alert(res.data.message)
            })
            // console.log(mcqs)
        } catch (error) {
            console.error('Error uploading file:', error);
        }

    };

    const handleTempSubmit = async (e) => {
        e.preventDefault()
        if (!temp_name || !file) {
            console.log('Template name and file are required.');
            return;
        }
        try {
            const templateData = {
                temp_name: temp_name,
                mcqs: mcqs
            };
            // console.log(templateData)
            const upload = await axios.post(`${baseURL}/api/temp`, templateData).then((res) => [
                console.log(res.data)
            ])
        } catch (error) {
            console.log(error)
        }
        tempApi()
    }


    // Working
    const [totForm, settotForm] = useState(0);
    const [tmplates, settmplates] = useState([])
    const tempApi = async () => {
        const response = await axios
            .get(`${baseURL}/api/templates`)
            .then(function (response) {
                settmplates(response.data)
                settotForm(response.data.length)
            })
            .catch(function (error) {
                console.log(error.message);
            });
    }

    // Working
    const [question, setquestion] = useState()
    const [totalQuestions, setTotalQuestions] = useState('')
    const [open, setOpen] = useState(true)
    const showquestion = async (temp_id) => {
        const response = await axios
            .get(`${baseURL}/api/temp/${temp_id}`)
            .then(function (response) {
                setquestion(response.data)
                setTotalQuestions(response.data.length)
            })
            .catch(function (error) {
                console.log(error);

            });
    }

    const deleteTemplate = async (temp_id) => {
        await axios.get(`${baseURL}/api/deleteTemp/${temp_id}`).catch((error) => {
            console.log(error)
        })
        tempApi()
    }
    useEffect(() => {
        tempApi();
    }, [])


    return (
        <div>
            <Fab color="primary" id="floating-button" aria-label="add" data-bs-toggle="modal" data-bs-target="#exampleModal">
                <AddIcon onClick={() => setOpen(true)} />
            </Fab>
            <div className="container">
                {totForm ? <span >Total Number of templates are : {totForm}</span> : <span>No templates yet to show</span>}

                {tmplates?.map((data, index) => {
                    return (
                        <div key={index} className="card" style={{ margin: '1rem 0' }}>
                            <div className="card-header">{data.temp_name}</div>
                            <div className="card-body">
                                <div className="d-flex justify-content-between">
                                    <button onClick={() => {
                                        showquestion(data._id)
                                        setOpen(!open)
                                    }} className="btn btn-primary" >
                                        View Questions
                                    </button>
                                    <button onClick={() => {
                                        deleteTemplate(data._id)
                                    }} className="btn btn-primary" >
                                        Delete Template
                                    </button>
                                </div>
                            </div>
                        </div>)
                })}
            </div>
            {
                !open &&
                < div >
                    <span className='totalQ'>Total No. of Questions are : {totalQuestions}</span>
                    {question?.map((que, index) => {
                        return (
                            <>
                                <div className='main'>
                                    <div key={index} className='qna'>
                                        <div className='question'>
                                            <strong>
                                                <span>{index + 1}. {que.Question}</span>
                                            </strong>
                                        </div>
                                        <div className='options'>
                                            <span>A. {que.A}</span>
                                            <span>B. {que.B}</span>
                                            <span>C. {que.C}</span>
                                            <span>D. {que.D}</span>
                                            <strong>
                                                <span>Ans. {que.Solution}</span>
                                            </strong>

                                        </div>
                                    </div>
                                </div>
                            </>
                        )
                    })
                    }
                </div>
            }
            <div className="mt-5 modal fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div className="modal-dialog">
                    <div className="modal-content">
                        <div className="modal-header">
                            <h1 className="modal-title fs-5" id="exampleModalLabel">
                                Modal title
                            </h1>
                            <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div className="modal-body">
                            <form action="" onSubmit={handleTempSubmit}>
                                <input type="radio" onChange={handleToggleChange} name="toggle" value="file" checked={selectedOption === 'file'} /> Choose file{" "}
                                <input type="radio" onChange={handleToggleChange} name="toggle" value="manual" checked={selectedOption === 'manual'} /> Add questions
                                <div className={selectedOption === 'file' ? 'file' : 'manual'}>
                                    {selectedOption === 'file' && (
                                        <>
                                            <div className="input-group mb-3">
                                                <input
                                                    type="text"
                                                    className="form-control"
                                                    aria-label="Sizing example input"
                                                    placeholder="Enter Template Name"
                                                    aria-describedby="inputGroup-sizing-default"
                                                    onChange={(e) => {
                                                        setTempName(e.target.value)
                                                    }}
                                                />
                                            </div>

                                            <div className="input-group mb-3">
                                                <input type="file" className="form-control" accept='.csv' name='csvFile' onChange={handleFileChange} id="inputGroupFile02" />
                                                <button onClick={handleFileUpload}>Parse</button>
                                            </div>
                                        </>
                                    )}
                                    {selectedOption === 'manual' && (
                                        <>
                                            <div className="manual">
                                                <p data-bs-dismiss="modal" aria-label="Close"><Link to="/AddQuestions" className="link-info link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">Add Questions </Link></p>
                                            </div>
                                        </>
                                    )}
                                </div>
                                <br />
                                <div className="modal-footer">
                                    <button type="submit" className="btn btn-primary" data-bs-dismiss="modal" aria-label="Close">
                                        Add template
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div >
    );
};

export default Template;