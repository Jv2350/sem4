import csv from "csvtojson"
import { Template } from "../model/TemplateModel.js"

export const parseExcel = async (req, res) => {
    try {
        const jsonArray = await csv().fromFile(req.file.path);
        res.status(200).json(jsonArray)
    } catch (error) {
        res.status(400).json(error.message)
    }
}

export const uploadTemplate = async (req, res) => {
    try {
        const { temp_name, mcqs } = req.body
        const { token } = req.headers['authorization']
        const data = await Template.create({ temp_name, mcqs })
        res.status(200).json(data)
    } catch (error) {
        res.status(400).json(error.message)
    }
}

export const allTemplates = async (req, res) => {
    try {
        const templates = await Template.find()
        res.status(200).json(templates)
    } catch (error) {
        res.status(400).json(error.message)
    }
}

export const allQuestionsById = async (req, res) => {
    try {
        const id = req.params.id
        const questions = await Template.find({ _id: id }, 'mcqs').exec()
        res.send(questions[0].mcqs)
    } catch (error) {
        res.status(400).json(error.message)
    }
}

export const randomNoOfQuestions = async (req, res) => {
    const temp_name = req.body.temp_name;
    const number = req.body.number

    try {
        // Find the template in the database
        const template = await Template.findOne({ temp_name: temp_name });

        if (!template) {
            res.status(404).json(`Template with name "${temp_name}" not found`);
        }

        // Get all MCQs from the template
        const mcqs = template.mcqs;

        // Ensure the requested number of questions doesn't exceed available MCQs
        if (number > mcqs.length) {
            res.status(404).json(`Template "${temp_name}" only has ${mcqs.length} MCQs`);
        }

        // Shuffle the array of MCQs randomly
        // (Assuming a modern JavaScript environment with `Array.prototype.sort()` that supports callbacks)
        mcqs.sort(() => 0.5 - Math.random());

        // Extract the requested number of random MCQs
        const randomMcqs = mcqs.slice(0, number);

        res.status(200).json(randomMcqs)
    } catch (error) {
        console.error(error);
        res.status(400).json(error.message)
    }

}


export const allTempName = async (req, res) => {
    try {
        const result = await Template.distinct('temp_name');
        res.json(result);
    } catch (err) {
        console.error('Error fetching template names:', err);
        res.status(500).json({ error: 'Internal Server Error' });
    }

}

export const getQuestionsNumberByTempName = async (req, res) => {
    try {
        const { name } = req.params
        const template = await Template.findOne({ temp_name: name }).populate("mcqs")
        if (!template) {
            res.status(404).json('Template not found ')
        }
        else {
            res.status(200).json(template.mcqs.length)
        }
    } catch (error) {
        res.status(400).json(error.message)
    }
}

export const deletTemplate = async (req, res) => {
    try {
        const id = req.params.id
        const deleteTemp = await Template.findByIdAndDelete({ _id: id })
        res.status(200).json("succesfully deleted template")
    } catch (error) {
        res.status(400).json(error.message)

    }
}