import express from "express"
import { loginUser, newUser } from "../controller/UserController.js"

const router = express.Router()

router.post('/signup', newUser)
    .post('/login', loginUser)

export default router