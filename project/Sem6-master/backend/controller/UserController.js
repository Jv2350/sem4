import dotenv from "dotenv"
import jwt from "jsonwebtoken"
import { User } from "../model/UserModel.js";
import bcrypt from "bcrypt"
dotenv.config();

export const newUser = async (req, res) => {
    const { username, password, confirmPassword } = req.body
    try {
        if (password !== confirmPassword) {
            return res.status(400).json({ message: 'Passwords do not match' });
        }
        const existingUser = await User.findOne({ username });
        if (existingUser) {
            return res.status(400).json({ message: 'Username already taken' });
        }
        const hashedPassword = await bcrypt.hash(password, 10);
        const newUser = await User.create({ username, password: hashedPassword });
        const token = jwt.sign({ username }, process.env.JWT_SECRET, { expiresIn: '1m' });

        res.status(200).json({ token, username: newUser.username })
    } catch (error) {
        res.status(500).json({ message: 'Internal server error' });
    }
}

export const loginUser = async (req, res) => {
    const { username, password } = req.body;
    try {
        const user = await User.findOne({ username });
        if (!user) {
            return res.status(404).json({ message: 'User not found' });
        }
        const passwordMatch = await bcrypt.compare(password, user.password);
        if (!passwordMatch) {
            return res.status(401).json({ message: 'Invalid credentials' });
        }
        const token = jwt.sign({ username }, process.env.JWT_SECRET, { expiresIn: '1m' });
        res.json({ token, username: user.username });

    } catch (error) {
        res.status(500).json({ message: 'Internal server error' });
    }
}

