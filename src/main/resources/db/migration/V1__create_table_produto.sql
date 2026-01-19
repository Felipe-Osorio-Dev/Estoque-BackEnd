CREATE TABLE produto(
    id BIGSERIAL PRIMARY KEY,
    codigo_produto VARCHAR(50) UNIQUE NOT NULL,
    nome VARCHAR(100) NOT NULL,
    unidade INTEGER NOT NULL,
    validade DATE NOT NULL
);