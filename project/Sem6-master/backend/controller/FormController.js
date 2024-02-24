import { Form } from "../model/FormModel.js"

export const newForm = async (req, res) => {
    try {
        const formItems = req.body
        const form_name = req.body.form_name
        if (await Form.findOne({ form_name: form_name })) {
            res.status(500).json("Form already exist!")
            console.log('already exist')
        } else {
            const form = await Form.create(formItems)
            res.status(200).json(form)
        }

    } catch (error) {
        res.status(400).json({ errorInNewForm: error.message })
    }
}

export const examForm = async (req, res) => {
    try {
        const name = req.body.examName
        const form = await Form.findOne({ form_name: name })
        res.status(200).json(form)
    } catch (error) {
        res.status(400).json({ errorInExamForm: error.message })
    }

}

export const allForms = async (req, res) => {
    try {
        const forms = await Form.find()
        res.status(200).json(forms)

    } catch (error) {
        res.status(400).json({ errorInShowingAllForms: error.message })
    }
}