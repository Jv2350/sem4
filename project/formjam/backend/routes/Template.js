import express from "express"
import multer from "multer"
import { allQuestionsById, allTemplates, deletTemplate, parseExcel, uploadExcel } from "../controller/TemplateController.js"


const router = express.Router()

const storage = multer.diskStorage({
    destination: (req, file, cb) => {
        cb(null, './uploads');
    },
    filename: (req, file, cb) => {
        cb(null, file.originalname)
    },
});

const upload = multer({
    storage
})
router
    .post('/excel', upload.single('csvFile'), parseExcel)
    .post('/temp', uploadExcel)
    .get('/templates', allTemplates)
    .get('/temp/:id', allQuestionsById)
    .get('/deleteTemp/:id', deletTemplate)


export default router