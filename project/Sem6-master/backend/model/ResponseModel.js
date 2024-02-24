// Import necessary packages

import mongoose from 'mongoose'
import { Schema } from 'mongoose';

// Define Response schema
const ResponseSchema = Schema({
    exam_name: {
        type: String,
        required: true
    },
    answers: {
        type: [String], // Array of answers
        required: true
    },
    student_name: {
        type: String,
        required: true
    }
});

// Create model for Response schema
export const Response = mongoose.model('Response', ResponseSchema);
