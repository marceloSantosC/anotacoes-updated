## USE (cria o banco se ele n�o existir)
use mongodba



## Se uma collection inexistente for usada ela ser� criada (VALE PARA QUALQUER CASO)

## Se o __id for omitido ele ser� criado automaticamente

## Todas opera��es s�o atomicas a n�vel de documento

## Insert (depreceado em vers�es mais novas em favor de insertOne e insertMany )
db.funcionarios.insert({"nome": 'Marcos', "idade": 27, "cargo": 'Gestor de RH'})

db.funcionarios.insert([{"nome": 'Marcos', "idade": 27, "cargo": 'Gestor de RH'}, {"nome": 'Marcos', "idade": 27, "cargo": 'Gestor de RH'}])

## InsertMany 3.2+
db.funcionarios.insertMany({"nome": 'Marcia', "idade": 18, "cargo": 'Estagi�rio de RH'}, {"nome": 'Maria', "idade": 19, "cargo": 'Estagi�rio de RH'})

## InsertOne 3.2+
db.funcionarios.insertOne({"nome": 'Marcia', "idade": 18, "cargo": 'Estagi�rio de RH'})












private TipoNota tipoNota;

