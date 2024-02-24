import axios from 'axios'
import React, { useEffect, useState } from 'react'
import "./AllForm.css"
import Sidebar from '../Sidebar'

const AllForm = () => {
    const [forms, setForms] = useState([])
    useEffect(() => {
        axios.get('http://localhost:8080/form/allForms')
            .then((res) => {
                setForms(res.data)
            }).catch((error) => {
                console.log(error.message)
            })
    }, [])

    return (
        <div style={{ display: 'flex' }}>
            <Sidebar />
            <div style={{ paddingTop: '5rem' }}>
                <span>Forms</span>
                {forms.map((form, index) => (
                    <div className="forms" >
                        <div key={index} className='forms-wrapper'>
                            <div>{index + 1}. {form.form_name}
                                <button type="button" className="btn btn-primary form-btn" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                    Show details
                                </button>
                                <div className="modal fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div style={{ paddingTop: '2rem' }} className="modal-dialog">
                                        <div className="modal-content" style={{ width: '45vw' }}>
                                            <div className="modal-header">
                                                <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div className="modal-body" >
                                                Details will be shown here
                                            </div>
                                            <div className="modal-footer">
                                                <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                ))}


            </div>
        </div>
    )
}

export default AllForm