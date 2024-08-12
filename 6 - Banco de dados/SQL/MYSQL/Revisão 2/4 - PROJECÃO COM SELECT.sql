# SELECIONANDO QUALQUER DADO
SELECT 2 + 4;

# ALIAS
SELECT 2 + 4 AS SOMA;

# FILTRAR COM WHERE
SELECT NOME, ENDERECO FROM CLIENTES WHERE SEXO = 'F';

# OPERADOR LIKE
SELECT NOME, ENDERECO FROM CLIENTES WHERE NOME LIKE '%M';

# SELECT * DO JEITO CORRETO
SELECT NOME, CPF, EMAIL, ENDERECO, SEXO FROM projeto.clientes;

# SELECT DISTINCT FAZ INTERSERCÇÃO DE REGISTROS
SELECT DISTINCT NOME FROM customers;

# SHOW DATABASES
SHOW DATABASES;