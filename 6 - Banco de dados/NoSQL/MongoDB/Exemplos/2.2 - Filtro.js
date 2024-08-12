# Por ID
db.funcionarios.findOne({_id: ObjectId("60eb30df1d8c132099077d58")})

# Com Array
## Por valor e ordem dos elementos (igual)
db.funcionarios.find({cargos: ["diretor", "gestor"]})

## $all, Apenas por valor e sem levar em conta ordem
### Retorna todos registros cujo array cargos contenha o valor gestor e diretor, independente da ordem
db.funcionarios.find({cargos: {$all: ["gestor", "diretor"]}})

## Buscar um elemento em um array
db.funcionarios.find({cargos: "diretor"})

## Buscar um elemento pelo indice 
db.funcionarios.find({"cargos.1": {$gt: 15}})

# Com documento aninhado
## Valor de atributo de documento aninhado
db.funcionarios.find({"funcionario.nome": 'Marcia'})

## Documento aninhado (deve ter correspondência exata)
db.funcionarios.find({funcionario: {nome: 'Marcia', idade: 22}})

# Operadores (sintaxe { <atributo>: { $operador: <valor> }, ... })

## IN ($in) 
db.funcionarios.find({idade: {$in: [18, 20, 27]}})

## Menor que/less than ($lt) e maior que/greater than ($gt)
db.funcionarios.find({idade: {$lt: 20}})
db.funcionarios.count({idade: {$gt: 20}})

## $OR: [condicao1, condicao2, ...]
### Idade igual a 27 ou 20
db.funcionarios.find({$or: [{idade: 20}, {idade: 27}]})

## $EXISTS (atributo existe no documento)
### Todos funcionários onde o atributo funcionario não existe
db.funcionarios.find({funcionario: {$exists: false}})

## AND (,)
### Idade menor que 30 AND IN 18
db.funcionarios.find({idade: {$lt: 30}, idade: {$in: [18]}})

## OR e AND
### Todos funcionários com idade maior que 20 AND nome = Marcos OR Roberto Santos OR Roberta Santos
db.funcionarios.find({idade: {$gt:20}, $or: [{nome: {$in: ['Marcos', 'Roberto Santos', 'Roberta Santos']}}]})