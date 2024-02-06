import React, { useState, useEffect } from "react";
import data from '../data.json'
import QuestionType from "./QuestionType";
import Email from "./Email";
import DateTime from "../Form/DateTime"
import axios from "axios";
function FormItem() {
  const handleSubmit = (e) => {
    e.preventDefault();
  }
  const handleInputChange1 = (e) => {
    setpercent(e.target.value);
  };
  let TotalMcq = data.mcq.length;

  const [percent, setpercent] = useState()
  const [mcq, setmcq] = useState({
    question: 0,
    marks: 0
  });

  const [total, settotal] = useState(0)

  const baseURL = 'http://localhost:8080'

  const [tempName, setTempName] = useState([])
  const [totTemp, setTotTemp] = useState([])
  const tempApi = async () => {
    const response = await axios
      .get(`${baseURL}/api/templates`)
      .then(function (response) {
        setTempName(response.data)
        console.log(response.data.length)
        setTotTemp(response.data.length)
      })
      .catch(function (error) {
        console.log(error.message);
      });
  }



  useEffect(() => {
    const updatedSecondState = mcq.marks * mcq.question;
    settotal(updatedSecondState);
    tempApi()
  }, []);
  return (
    //  ()
    <div className="container">
      <form onSubmit={handleSubmit}>
        <div className="input mb-3">
          <span className="input-text" id="inputGroup-sizing-default">
            Enter Exam Name
          </span>
          <input
            type="text"
            className="form-control"
            aria-label="Sizing example input"
            aria-describedby="inputGroup-sizing-default"
          />
        </div>
        <label htmlFor="templet-Select">Select the Templet</label>
        <select
          className="form-select form-select-lg mb-3"
          aria-label=".form-select-lg example"
          id="templet-Select"
          label="Select one"
        >
          {tempName?.map((name, index) => {
            return (
              <>
                <div key={index}>
                  <option value="1">{name[0].temp_name}</option>
                </div>
              </>
            )
          })}

          {/* <option value="2">Two</option>
          <option value="3">Three</option> */}
        </select>
        <QuestionType total={TotalMcq} title="Mcq" set={mcq} useset={setmcq} />

        <br />

        <h3>Total Marks: {total}</h3>
        <div className="input-group mb-3">
          <span className="input-group-text" id="inputGroup-sizing-small">Enter Passing Marks</span>
          <input type="number" className="form-control" placeholder="Enter Number" max={total} onChange={handleInputChange1} aria-label="Recipient's username" aria-describedby="basic-addon2" />
          <span className="input-group-text" id="basic-addon2">{NaN ? 0 : Math.round(((percent / total) * 100), 2)}%</span>
        </div>
        {/* <div className="container  p-3 mb-5 bg-body rounded border">
          <Email />
        </div> */}
        <DateTime />
        <div className="col-12">
          <br />
          <button type="submit" className="btn btn-primary text-center">Save Form</button>
        </div>
      </form>
    </div>

  );
}

export default FormItem;
