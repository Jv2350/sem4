import React, { useEffect } from 'react'
import './App.css';
import FormItem from './components/Form/FormItem';
// import Login from './components/Login';
import Sidebar from './components/Sidebar';
import Login from './components/Login';
import ExamForm from './components/Student/ExamForm';
import Template from './components/Template/Template';
import AddQuestions from './components/Template/AddQuestions';
import AllForm from './components/Form/AllForm';
import { BrowserRouter as Router, Route, Routes, useNavigate } from 'react-router-dom';
function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Login />}></Route>
        <Route path='/sidebar' element={<Sidebar />}></Route>
        <Route path='/form' element={<FormItem />}></Route>
        <Route path='/template' element={<Template />}></Route>
        <Route path='/addQuestions' element={<AddQuestions />}></Route>
        <Route path='/exam' element={<ExamForm />}></Route>
        <Route path='/allForms' element={<AllForm />}></Route>
      </Routes>
    </Router>
  );
}

export default App;
