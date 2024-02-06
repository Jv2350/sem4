import dotenv from "dotenv"
import express from "express"
import mongoose from "mongoose"
import cors from "cors"
import bodyParser from "body-parser"
import TemplateRoute from "./routes/Template.js"
const server = express()

server.use(express.json());
server.use(bodyParser.json());
server.use(cors());
dotenv.config();

main().catch((err) => console.log(err));
async function main() {
    await mongoose.connect(process.env.MONGODB_URL).then(() => console.log("database connected"));
}

server.get('/', (req, res) => {
    res.status(200).json("hello , good morning!")
})

server.use("/api", TemplateRoute)

server.listen(process.env.PORT, () => {
    console.log(`server started at port ${process.env.PORT}`);
});