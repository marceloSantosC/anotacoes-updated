# Proje��o
## Proje��o inclusiva (mostrar apenas os registros selecionados)
db.funcionarios.find({}, {idade: true, nome: true})

## Proje��o exclusiva (mostrar todos os campos, menos os false)
db.funcionarios.find({}, {idade: false})

### _id sempre ser� mostrado a menos que seja explicitamente excluido
db.funcionarios.find({}, {idade: true, nome: true, _id: false})



## Count 
### Pode receber um filtro como argumento
db.funcionarios.count()
### Pode ser usado no final de um FIND, como fun��o
db.funcionarios.find().count()








