CREATE DATABASE teste;

USE teste;

CREATE TABLE IF NOT EXISTS recado (
	id SERIAL PRIMARY KEY,
	remetente VARCHAR(512) NOT NULL,
	texto TEXT NOT NULL,
	data TIMESTAMP NOT NULL
);

INSERT INTO recado (remetente, texto, data) VALUES ('Joãozinho', 'Texto 1', '2020-01-01 12:00:00');
INSERT INTO recado (remetente, texto, data) VALUES ('Antônia', 'Texto 2', '2020-01-01 12:00:01');