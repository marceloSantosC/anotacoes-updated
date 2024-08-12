# REMOVE
## Deletar tudo que atenda ao filtro
db.funcionarios.remove({_id: ObjectId("60eb3ac81d8c132099077d5b")})

## Deletar x elementos que atendam ao filtro
db.funcionarios.remove({idade: {$gt: 20}}, 1)

## Deletar sem filtro (DELETE sem WHERE)
db.teste.remove({})


# DROP (equivale a DROP TABLE), retornar um boolean
## DROP pode ser usado no lugar de remove sem filtro
db.teste.drop()


# Mostra as collections
show collections













