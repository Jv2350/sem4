import React, { useState } from 'react';
import axios from 'axios';
import DeleteIcon from '@mui/icons-material/Delete';
const AddQuestions = () => {
    const [questions, setQuestions] = useState({
        question: '',
        opt1: '',
        opt2: '',
        opt3: '',
        opt4: ''
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
            sol: selectedOption,
        }));
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        if (
            !questions.question ||
            !questions.opt1 ||
            !questions.opt2 ||
            !questions.opt3 ||
            !questions.opt4 ||
            !questions.sol
        ) {
            setError('All fields must be filled in.');
            setTimeout(() => {
                setError('');
            }, 3000);
            return;
        }

        setSubmittedQuestions([...submittedQuestions, { ...questions }]);
        setQuestions({
            question: '',
            opt1: '',
            opt2: '',
            opt3: '',
            opt4: '',
            sol: ''
        });
        setError('');
    };

    // const sendToApi = async () => {
    //     const apiEndpoint = 'https://18b8-182-48-224-214.ngrok-free.app/api/temp';
    //     const requestData = {
    //         temp_name: templateName,
    //         mcq: submittedQuestions,
    //     };
    //     const respomse = await axios.post(apiEndpoint, requestData, {
    //         headers: {
    //             'Content-Type': 'multipart/form-data',
    //             'Authorization': 'Bearer ' + localStorage.getItem('token')
    //         },
    //     })
    //         .then((response) => {
    //             console.log('API Response:', response.data);
    //             setSubmittedQuestions([]);
    //         })
    //         .catch((error) => {
    //             console.error('Error sending data to API:', error);
    //         });
    // };

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
        <div className='p-3'>
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
                        value={questions.question}
                        name="question"
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
                        value={questions.opt1}
                        name="opt1"
                        className="form-control mb-2"
                        aria-label="Text input with radio button"
                        placeholder="Option 1"
                    />
                </div>
                <div className="input-group">
                    <input
                        type="text"
                        onChange={handleQuestions}
                        value={questions.opt2}
                        name="opt2"
                        className="form-control mb-2"
                        aria-label="Text input with radio button"
                        placeholder="Option 2"
                    />
                </div>
                <div className="input-group">
                    <input
                        type="text"
                        onChange={handleQuestions}
                        value={questions.opt3}
                        name="opt3"
                        className="form-control mb-2"
                        aria-label="Text input with radio button"
                        placeholder="Option 3"
                    />
                </div>
                <div className="input-group">
                    <input
                        type="text"
                        onChange={handleQuestions}
                        value={questions.opt4}
                        name="opt4"
                        className="form-control"
                        aria-label="Text input with radio button"
                        placeholder="Option 4"
                    />
                </div>
                <br />
                <div className="dropdown">
                    <button className="btn btn-secondary dropdown-toggle mb-2" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Answer
                    </button>
                    <ul className="dropdown-menu">
                        <li className="dropdown-item" onClick={() => handleDropdownSelection('Option 1')}>Option 1</li>
                        <li className="dropdown-item" onClick={() => handleDropdownSelection('Option 2')}>Option 2</li>
                        <li className="dropdown-item" onClick={() => handleDropdownSelection('Option 3')}>Option 3</li>
                        <li className="dropdown-item" onClick={() => handleDropdownSelection('Option 4')}>Option 4</li>
                    </ul>
                </div>
                <button type="submit" className="btn btn-primary">
                    Add
                </button>
                {" "}
                {
                    submittedQuestions.length > 0 && (
                        <button type="button" className="btn btn-success" onClick={() => {
                            // sendToApi();
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
                                            <strong>Options:</strong> {q.opt1}, {q.opt2}, {q.opt3}, {q.opt4} <br />
                                            <strong>Answer:</strong>{q.sol}
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
    );
};

export default AddQuestions;