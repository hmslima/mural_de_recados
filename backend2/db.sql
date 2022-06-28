CREATE TABLE IF NOT EXISTS recado (
	id SERIAL PRIMARY KEY,
	texto TEXT,
	data TIMESTAMP
);

INSERT INTO recado (texto, data) VALUES ('Texto 1', '2020-01-01 12:00:00');
INSERT INTO recado (texto, data) VALUES ('Texto 2', '2020-01-01 12:00:01');