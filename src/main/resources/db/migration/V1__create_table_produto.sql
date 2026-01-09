CREATE TABLE produto(
    id BIGSERIAL PRIMARY KEY,
    codigo_produto VARCHAR(50) UNIQUE NOT NULL,
    nome VARCHAR(100) NOT NULL,
    unidade BIGINT NOT NULL,
    validade DATE NOT NULL
);