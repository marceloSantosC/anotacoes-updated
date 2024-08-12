# FIND
## Sem filtro
db.funcionarios.find()
db.funcionarios.find({})

# FIND ONE
db.funcionarios.findOne({_id: ObjectId("60e652d3eb1be62810747859")})

# QUERY COM ATRIBUTOS INEXISTENTES NÃO DÃO ERRO, APENAS RETORNA null
db.funcionarios.findOne({asdf: 'asdf'})


# FUNÇÕES DE FIND
## PRETTY faz a formatação do JSON (útil na CLI)
db.funcionarios.find().pretty()
## LIMIT
db.funcionarios.find().limit(1)
## SORT (1 PARA ASC E -1 PARA DESC)
db.funcionarios.find().sort({idade: -1})
## COMBINANDO FUNÇÕES
db.funcionarios.find().limit(1).pretty()