https://microsoftedge.microsoft.com/addons/detail/api-tester-rest-client-/aodkfioaidcbpnklppnkeelkcdioabbc

 express = require('express');
const axios = require('axios');

const app = express();
app.use(express.json());

const JSON_SERVER_URL = 'http://localhost:3000/users';

// GET all users
app.get('/api/users', async (req, res) => {
    try {
        const response = await axios.get(JSON_SERVER_URL);
        res.json(response.data);
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});

// GET a user by ID
app.get('/api/users/:id', async (req, res) => {
    try {
        const response = await axios.get(`${JSON_SERVER_URL}/${req.params.id}`);
        res.json(response.data);
    } catch (error) {
        res.status(404).json({ message: 'User not found' });
    }
});

// CREATE a new user
app.post('/api/users', async (req, res) => {
    try {
        const response = await axios.post(JSON_SERVER_URL, req.body);
        res.status(201).json(response.data);
    } catch (error) {
        res.status(400).json({ message: error.message });
    }
});

// UPDATE a user by ID
app.put('/api/users/:id', async (req, res) => {
    try {
        const response = await axios.put(`${JSON_SERVER_URL}/${req.params.id}`, req.body);
        res.json(response.data);
    } catch (error) {
        res.status(400).json({ message: error.message });
    }
});

// DELETE a user by ID
app.delete('/api/users/:id', async (req, res) => {
    try {
        await axios.delete(`${JSON_SERVER_URL}/${req.params.id}`);
        res.json({ message: 'User deleted' });
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});

// Start the Express server
const PORT = 4000;
app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});


