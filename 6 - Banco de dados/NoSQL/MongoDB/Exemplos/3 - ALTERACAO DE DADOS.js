# update, atualizando todo o documento menos o ID
db.funcionarios.update({_id: ObjectId("60eb30df1d8c132099077d58")}, {nome: 'Marcos mion', idade: 25, salario: 80000, cargo: 'REI'})

## upsert faz com que o documento seja inserido caso não encontrado
db.funcionarios.update({_id: ObjectId("50eb30df1d8c132099077d58")}, {nome: 'Murilo', idade: 19, salario: 1200, cargo: 'Estagiario de Marketing'}, {upsert: true})


# $set(filtro), atualizando atributos
## $set só pode atualizar um documento mesmo que o WHERE retorne mais de uma linha
db.funcionarios.update({_id: ObjectId("60eb30df1d8c132099077d58")}, {$set: {nome: 'Mauricio', idade: 27, salario: 2000.00}})

## Multi para fazer $set com multiplos documentos
db.funcionarios.update({idade: {$gt: 39}}, {$set: {salario: 50000}}, {multi: true})















