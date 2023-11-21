const dbConnect = require('./mongo');

const deleteData = async () => {
    const data = await dbConnect();
    
}
deleteData()