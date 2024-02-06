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

export const uploadExcel = async (req, res) => {
    try {
        const { temp_name, mcqs } = req.body
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

export const deletTemplate = async (req, res) => {
    try {
        const id = req.params.id
        const deleteTemp = await Template.findByIdAndDelete({ _id: id })
        res.status(200).json("succesfully deleted template")
    } catch (error) {
        res.status(400).json(error.message)

    }
}