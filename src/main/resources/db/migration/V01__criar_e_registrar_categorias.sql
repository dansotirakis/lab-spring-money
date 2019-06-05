CREATE TABLE apimoney.categoria (
	codigo INT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

INSERT INTO categoria (nome) values ('lazer');
INSERT INTO categoria (nome) values ('alimentação');
INSERT INTO categoria (nome) values ('supermercado');
INSERT INTO categoria (nome) values ('Outros');