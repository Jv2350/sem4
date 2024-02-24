import { Response } from "../model/ResponseModel.js";

export const responses = async (req, res) => {
    try {
        const { examName, answers, studentName } = req.body;
        const response = await Response.create({
            exam_name: examName,
            answers: answers,
            student_name: studentName
        });
        res.status(200).json(response);
    } catch (error) {
        console.error(error);
        res.status(500).json({ message: 'Internal server error' });
    }
}