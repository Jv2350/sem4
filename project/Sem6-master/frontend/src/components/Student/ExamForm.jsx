import axios from 'axios'
import React, { useState } from 'react'
import "./ExamForm.css"

const ExamForm = () => {
    const [examName, setExamName] = useState('')
    const [exam, setExam] = useState("")
    const [subName, setSubName] = useState("")
    const [studentName, setStudentName] = useState("")
    const [examQues, setExamQues] = useState([])
    const [examAns, setExamAns] = useState([])
    const [errorMessage, setErrorMessage] = useState('')
    const [submitting, setSubmitting] = useState(false)

    const baseURL = "http://localhost:8080"

    const handleExamForm = (e) => {
        e.preventDefault()
        axios.post(`${baseURL}/form/examForm`, { examName })
            .then((res) => {
                setExam(res.data.form_name)
                setSubName(res.data.template_name)
                setExamQues(res.data.total_mcqs);
                // Initialize answers array with empty strings for each question
                const initialAnswers = res.data.total_mcqs.map(() => '');
                setExamAns(initialAnswers);
            }).catch((error) => {
                console.log(error)
            })
    }

    const handleAnswerSelection = (index, selectedAnswer) => {
        // Update the selected answer in the array of answers
        const updatedAnswers = [...examAns];
        updatedAnswers[index] = selectedAnswer;
        setExamAns(updatedAnswers);
    }

    const handleSubmitAnswers = () => {
        // Check if any answer is missing
        if (examAns.some(answer => answer === '')) {
            setErrorMessage('Please answer all questions before submitting.');
            return;
        }

        // Check if student's name is present
        if (studentName === '') {
            setErrorMessage('Please enter your name before submitting.');
            return;
        }

        // Set submitting state to true
        setSubmitting(true);

        // Here you can send the array of answers and student's name to the API
        axios.post(`${baseURL}/form/examResponse`, { answers: examAns, studentName, examName })
            .then((res) => {
                alert('Exam Submitted! ')
                setExamQues([]);
                setExamName('')
                setStudentName('')
                setExamAns([]);
                setSubmitting(false);
            }).catch((error) => {
                console.log(error);
                // Set submitting state to false if submission fails
                setSubmitting(false);
            })
    }

    return (
        <div className="exam-wrapper">
            <div>
                <input type="text" placeholder="Enter exam name" onChange={(e) => { setExamName(e.target.value) }} name='exam_name' />
                <button onClick={handleExamForm}>Load</button>
            </div>
            <div className="examForm">
                <div>
                    <span>Exam: {exam}</span>
                    <span>Subject: {subName}</span>
                </div>
                <div>
                    <input type="text" placeholder="Enter your name" onChange={(e) => { setStudentName(e.target.value) }} />
                </div>
                <div className='q-a'>
                    {examQues.map((data, index) => (
                        <div key={index}>
                            <strong>
                                <span>{index + 1}.{data.Question}</span>
                            </strong>
                            <div className="answers-opt">
                                <div>
                                    A. <input type="radio" name={`answer${index}`} value="A" onChange={(e) => handleAnswerSelection(index, e.target.value)} />  {data.A}
                                </div>
                                <div>
                                    B.  <input type="radio" name={`answer${index}`} value="B" onChange={(e) => handleAnswerSelection(index, e.target.value)} /> {data.B}
                                </div>
                                <div>
                                    C.  <input type="radio" name={`answer${index}`} value="C" onChange={(e) => handleAnswerSelection(index, e.target.value)} /> {data.C}
                                </div>
                                <div>
                                    D. <input type="radio" name={`answer${index}`} value="D" onChange={(e) => handleAnswerSelection(index, e.target.value)} /> {data.D}
                                </div>
                            </div>
                        </div>
                    ))}
                </div>
                {errorMessage && <div className="error-message">{errorMessage}</div>}
                {submitting ? (
                    <div className="submitting-message">Your response is being submitted...</div>
                ) : (
                    <button onClick={handleSubmitAnswers}>Submit Answers</button>
                )}
            </div>
        </div>
    )
}

export default ExamForm
