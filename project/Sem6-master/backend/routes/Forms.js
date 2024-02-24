import express from "express"
import { allForms, examForm, newForm } from "../controller/FormController.js"
import { responses } from "../controller/ResponseController.js"

const router = express.Router()

router.post('/createForm', newForm)
    .post('/examForm', examForm)
    .post('/examResponse', responses)
    .get('/allForms', allForms)

export default router