const express = require('express');
const app = express();
const path = require('path');
const routes = require('./routes');
const cors = require('cors');


app.use(express.json());
app.use(cors());
app.use(routes);
app.use(express.static(path.join(__dirname, 'public')));
app.route('/', (request, response) => {
    response.render('index.html');
});

app.listen(3333);