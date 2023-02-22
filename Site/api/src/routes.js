const express = require('express');
const routes = express.Router();
const db = require('./database/config');
// const transporter = require('./email/config');

// Rotas para criar usuário
routes.post('/user', (request, response) => {

	const {
		name,
		email,
		password
	} = request.body;

	let verify;
	// Verificando se o usuário existe
	let sql = `SELECT * FROM usuario WHERE emailUsuario = '${email}'`;
	db.query(sql, (err, result) => {
		let sizeArray = result.rowsAffected[0];
	
		if(sizeArray != 0) {
			response.json({ message: "Esse usuário já existe!" });
		} else {
			const sql = `INSERT INTO usuario(nomeUsuario, emailUsuario, senhaUsuario) VALUES('${name}', '${email}', '${password}')`;
			db.query(sql, (err, result) => {
				if (err) throw err;
				response.json({
					message: "Usuário criado com sucesso!"
				});
			});
		}
	})
	
});


// Rotas para lista os usuários
routes.get('/user/all', (request, response) => {
	let sql = "SELECT * FROM usuario";
	db.query(sql, (err, result) => {
		response.json(result.recordsets[0]);
	});
})


// Login do usuário
routes.post('/login', (request, response) => {

	const { email, senha } = request.body;
	let sql = `SELECT * FROM usuario WHERE emailUsuario = '${email}' AND senhaUsuario = '${senha}'`;
	
	db.query(sql, (err, result) => {
		if(err) throw err;
		let sizeArray = result.rowsAffected[0];
		if(sizeArray == 0) {
			response.json({ message: "Opps.. Usuário ou Senha inválidos!"})
		} else {
			response.json({
				message: "Login feito com sucesso!",
				user: {
					name: result.recordset[0].nomeUsuario,
					email: result.recordset[0].emailUsuario,
					id: result.recordset[0].idUsuario
				}
			});
		}
	});
});

module.exports = routes;