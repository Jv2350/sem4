import React, { useState } from 'react';
import axios from 'axios';
import DeleteIcon from '@mui/icons-material/Delete';
import Sidebar from '../Sidebar';
const AddQuestions = () => {
    const [questions, setQuestions] = useState({
        Question: '',
        A: '',
        B: '',
        C: '',
        D: ''
    });

    const [submittedQuestions, setSubmittedQuestions] = useState([]);
    const [templateName, setTemplateName] = useState('');
    const [error, setError] = useState('');
    const handleQuestions = (e) => {
        e.preventDefault();
        setQuestions((prevState) => ({
            ...prevState,
            [e.target.name]: e.target.value
        }));
    };

    const handleDropdownSelection = (selectedOption) => {
        setQuestions((prevState) => ({
            ...prevState,
            Solution: selectedOption,
        }));
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        if (
            !questions.Question ||
            !questions.A ||
            !questions.B ||
            !questions.C ||
            !questions.D ||
            !questions.Solution
        ) {
            setError('All fields must be filled in.');
            setTimeout(() => {
                setError('');
            }, 3000);
            return;
        }

        setSubmittedQuestions([...submittedQuestions, { ...questions }]);
        setQuestions({
            Question: '',
            A: '',
            B: '',
            C: '',
            D: '',
            Solution: ''
        });
        setError('');
    };

    const token = localStorage.getItem('loggedInUser')
    const sendToApi = async () => {
        const apiEndpoint = 'http://localhost:8080/api/temp';
        const requestData = {
            temp_name: templateName,
            mcqs: submittedQuestions,

        };
        await axios.post(apiEndpoint, requestData, {
            headers: {
                "Authorization": 'Bearer ' + token
            }
        })
            .then((response) => {
                console.log('API Response:', response.data);
                setSubmittedQuestions([]);
            })
            .catch((error) => {
                console.error('Error sending data to API:', error);
            });
    };

    const removeQuestion = (index) => {
        const updatedQuestions = [...submittedQuestions];
        updatedQuestions.splice(index, 1);
        setSubmittedQuestions(updatedQuestions);
    };

    const resetSubmittedQuestions = () => {
        setSubmittedQuestions([]);
        setTemplateName("")
    };

    return (
        <div style={{ display: 'flex' }}>
            <Sidebar />
            <div style={{ width: '75%', paddingTop: '5rem' }} >
                <div className="input-group mb-3">
                    <input
                        type="text"
                        className="form-control"
                        aria-label="Sizing example input"
                        placeholder="Enter Template Name"
                        aria-describedby="inputGroup-sizing-default"
                        onChange={(e) => { setTemplateName(e.target.value) }}
                    />
                </div>
                <form action="" onSubmit={handleSubmit}>
                    <div className="input-group mb-3">
                        <input
                            type="text"
                            onChange={handleQuestions}
                            value={questions.Question}
                            name="Question"
                            className="form-control"
                            aria-label="Sizing example input"
                            placeholder="Enter Question"
                            aria-describedby="inputGroup-sizing-default"
                        />
                    </div>
                    <div className="input-group">
                        <input
                            type="text"
                            onChange={handleQuestions}
                            value={questions.A}
                            name="A"
                            className="form-control mb-2"
                            aria-label="Text input with radio button"
                            placeholder="A"
                        />
                    </div>
                    <div className="input-group">
                        <input
                            type="text"
                            onChange={handleQuestions}
                            value={questions.B}
                            name="B"
                            className="form-control mb-2"
                            aria-label="Text input with radio button"
                            placeholder="B"
                        />
                    </div>
                    <div className="input-group">
                        <input
                            type="text"
                            onChange={handleQuestions}
                            value={questions.C}
                            name="C"
                            className="form-control mb-2"
                            aria-label="Text input with radio button"
                            placeholder="C"
                        />
                    </div>
                    <div className="input-group">
                        <input
                            type="text"
                            onChange={handleQuestions}
                            value={questions.D}
                            name="D"
                            className="form-control"
                            aria-label="Text input with radio button"
                            placeholder="D"
                        />
                    </div>
                    <br />
                    <div className="dropdown">
                        <button className="btn btn-secondary dropdown-toggle mb-2" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Answer
                        </button>
                        <ul className="dropdown-menu">
                            <li className="dropdown-item" onClick={() => handleDropdownSelection('A')}>A</li>
                            <li className="dropdown-item" onClick={() => handleDropdownSelection('B')}>B</li>
                            <li className="dropdown-item" onClick={() => handleDropdownSelection('C')}>C</li>
                            <li className="dropdown-item" onClick={() => handleDropdownSelection('D')}>D</li>
                        </ul>
                    </div>
                    <button type="submit" className="btn btn-primary">
                        Add
                    </button>
                    {" "}
                    {
                        submittedQuestions.length > 0 && (
                            <button type="button" className="btn btn-success" onClick={() => {
                                sendToApi();
                                resetSubmittedQuestions();
                            }}>
                                Send to API
                            </button>
                        )
                    }

                    {error && <p style={{ color: 'red' }}>{error}</p>}
                </form >
                <div>
                    <h2>Submitted Questions for : {templateName}</h2>
                    <ul>
                        {submittedQuestions.map((q, index) => (
                            <>
                                <div className='card mt-2'>
                                    <div className='card-body d-flex justify-content-between align-items-center'>
                                        <div>
                                            <li key={index} style={{ listStyle: "none" }}>
                                                <span>
                                                    <strong>
                                                        {index + 1}{") "}
                                                    </strong>
                                                </span>
                                                <strong>Question:</strong> {q.question} <br />
                                                <strong>Options:</strong> {q.A}, {q.B}, {q.C}, {q.D} <br />
                                                <strong>Answer:</strong>{q.Solution}
                                            </li>

                                        </div>
                                        <div>
                                            <div key={index}>
                                                <button
                                                    type="button"
                                                    className="btn btn-danger"
                                                    onClick={() => removeQuestion(index)}
                                                >
                                                    <DeleteIcon />
                                                </button>
                                            </div>

                                        </div>
                                    </div>

                                </div>
                                <div className='card-footer mt-2'>
                                    Total Questions: {submittedQuestions.length}
                                </div>
                            </>
                        ))}

                    </ul>
                </div>

            </div >
        </div >
    );
};

export default AddQuestions;