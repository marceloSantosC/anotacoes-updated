# MAX Retorna o maior valor
SELECT MAX(ALL PRECO) AS 'MAX_PRECO' FROM PRODUTO;

# MIN Retorna o menor valor
SELECT MIN(DISTINCT PRECO) AS 'MIN_PRECO' FROM PRODUTO WHERE PRECO > 1000;

# AVG Retorna a média aritmética de um campo ou dado
SELECT AVG(PRECO) AS 'PRECO_MEDIO' FROM PRODUTO;

# SUM soma os valores passados
SELECT SUM(PRECO) AS 'SOMA_PRECOS' FROM PRODUTO;

# TRUNCATE Define um limite de casas decimais para serem mostradaas
## Funções podem receber o retorno de uma função como param
## Limita a no máximo 1 casa decimal
SELECT TRUNCATE(AVG(PRECO), 1) AS 'PRECO_MEDIO' FROM PRODUTO;



