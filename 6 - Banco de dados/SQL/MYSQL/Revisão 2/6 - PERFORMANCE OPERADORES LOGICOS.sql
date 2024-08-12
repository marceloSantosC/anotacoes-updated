# TODOS FUNCIONARIOS DO DEPARTAMENTO DE FILMES OU DE ROUPAS
# Verificar a predominancia de registros para otimizar a query
SELECT DEPARTAMENTO, COUNT(*) 
FROM FUNCIONARIOS 
WHERE DEPARTAMENTO = 'Filmes' OR DEPARTAMENTO =  'Roupas' GROUP BY departamento;

# Fazer a query sabendo que existem 21 registros em filmes e 53 em roupas
SELECT * FROM FUNCIONARIOS WHERE DEPARTAMENTO ='ROUPAS' OR DEPARTAMENTO = 'FILMES';

/* O gestor de marketing pediu a lista das funcionarias que trabalhem no departamento 
de filmes ou no departamento lar. Ele necessita enviar um email para as colaboradoras
-desses dois setores. */
# Verificar a predominancia de registros para otimizar a query
SELECT DEPARTAMENTO, COUNT(*) 
FROM FUNCIONARIOS 
WHERE DEPARTAMENTO = 'Filmes' OR DEPARTAMENTO =  'Lar' GROUP BY departamento;
SELECT SEXO, COUNT(*) FROM FUNCIONARIOS WHERE SEXO = 'Feminino' AND departamento = 'Filmes';
SELECT SEXO, COUNT(*) FROM FUNCIONARIOS WHERE SEXO = 'Feminino' AND departamento = 'Lar';

# Fazer a query sabendo que existem 9 registros em filmes, 32 em lar e 491 em feminino
SELECT nome, email, departamento, cargo, sexo 
FROM funcionarios 
WHERE (departamento = 'Lar' AND sexo = 'Feminino') OR (departamento = 'Filmes' AND sexo = 'Feminino');

# Traga os funcionarios do sexo masculino ou os funcionarios que trabalhem no setor Jardim
SELECT * FROM funcionarios WHERE SEXO = 'Masculino' OR departamento = 'Jardim';
