const {MongoClient} = require("mongodb")

const url = 'mongodb://localhost:27017'

const client = new MongoClient(url)

const dbname = "Ruddo"
const collectionname = 'neha'

async function dbConnect(){
    let result = await client.connect();
    let db = result.db(dbname)
    let connection = db.collection(collectionname)
    return connection;
}

module.export