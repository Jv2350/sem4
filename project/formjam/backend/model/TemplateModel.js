import mongoose from "mongoose";
import { Schema } from "mongoose";

const TemplateSchema = Schema({
    temp_name: {
        type: String,
        required: true
    },
    mcqs: {
        type: Array,
        required: true
    }
})

export const Template = mongoose.model("templates", TemplateSchema)
