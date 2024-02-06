import express from "express";

const router = express.Router();

router.get("/login", (req, res) => {
    // root route http://localhost:5000/
    res.send("Login!!");
});

export default router