import React from 'react'

function QuestionType(props) {
    // console.log(props)
    const handleInputChange1 = (e) => {
        props.useset({...props.set,question: e.target.value});
        props.totalmarks();
    };
    const handleInputChange2 = (e) => {
        props.useset({...props.set,marks: e.target.value});
        props.totalmarks();
      };
  return (
    <div className="card">
  <h5 className="card-header">{props.title} (Total: {props.total})</h5>
  <div className="card-body">
  <div className="input-group mb-3">
  <span className="input-group-text" id="inputGroup-sizing-small">Questions</span>
  <input type="Number" max={`${props.total}`} min={0} placeholder="0" className="form-control" value={props.set.question}
            onChange={handleInputChange1} id="mcqQues" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default"/>
  <span className="input-group-text" id="inputGroup-sizing-small">Marks Per Question</span>
  <input type="Number"  min={0} placeholder="0" className="form-control" value={props.set.marks}
            onChange={handleInputChange2} aria-label="Sizing example input" id="mcqMarks" aria-describedby="inputGroup-sizing-default"/>
</div>
</div>
</div>
  )
}

export default QuestionType