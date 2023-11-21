const express = require('express')

const dbConnect = require('./mongo')
const app = express();

app.get('/', async (req, res) => {
    let data = await dbConnect();
    data = await data.find().toArray();
    res.send(data);
})

app.post('/', async (req, res) => {
    let data = await dbConnect();
    let result = await data.insertOne(req.body)
    res.send(result)
})

app.put('/', async (req, res) => {
    let data = await dbConnect();
    let result = await data.updateOne({EmpID:"3"},{
        $set :{Title:"Engineer"}
    })
    res.send("done")
})

app.delete('/', async (req, res) => {
    let data = await dbConnect();
    let result = await data.deleteOne({EmpID:"3"})
    res.send("done")
})

app.listen(5000);