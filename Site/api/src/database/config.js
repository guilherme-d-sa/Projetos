const sql = require('mssql');

let dbConfig = {
	server: 'servidorprojeto.database.windows.net',
	user: 'guilherme',
	password: 'Saidaminhaconta23',
	database: 'ProjetoBd',
	"options": {
		"encrypt": true,
		"enableArithAbort": true
	}
}

let conn = new sql.ConnectionPool(dbConfig);

conn.connect((err) => {
	if (err) throw err;
	console.log('Database Connected!')
})

module.exports = conn;