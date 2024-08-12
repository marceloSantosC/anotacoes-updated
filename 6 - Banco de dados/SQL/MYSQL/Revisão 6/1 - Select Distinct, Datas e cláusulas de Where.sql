# SELECT DISTINCT
-- Fazendo intersecção de registros repetidos
SELECT DISTINCT state FROM customers;

# DATAS
SELECT * 
FROM customers 
WHERE birth_date > '1990-01-01';

# IN
SELECT * 
FROM products
WHERE quantity_in_stock 
IN (49, 38, 72);

# BETWEEN
SELECT * 
FROM customers 
WHERE birth_date 
BETWEEN '1990-01-01' AND '2000-01-01';

# REGEXP
SELECT * FROM customers WHERE last_name REGEXP 'S';

## LIMIT
-- Limita o n° de registros retornados
SELECT * FROM sql_store.customers LIMIT 3;