# Fast Sql Compiler
#### Compilador e linguagem criados para a disciplina Construção de Compiladores
####               do Departamento de Computação - UFSCar  
_____________________________________________________________________________________

## Linguagem Fast Sql
A linguagem FastSql foi criada com o intenção de facilitar a escrita de scripts sql
de forma mais simples e direta. Com ela é possível criar, fazer pesquisas, deletar e
incluir dados em tabelas de bancos de dados.

### Exemplos de uso
- Criando uma tabela
```
createTable(Pessoas)
    .columns(
        id:int, 
        nome:varchar(50), 
        idade:varchar(3), 
        endereco:varchar(50)
    )
```
- inserindo linhas
```
Pessoas.insert(1, 'Fulano', '20', 'Rua dois')
```


- Pesquisando linhas
``` 
Pessoas.find(nome: 'Fulano', idade: 20)
```

``` 
Pessoas.find(nome: 'Fulano', idade: 20).columns(nome, endereco)
``` 

- Deletando linhas
```
Pessoas.delete(nome: 'Fulano')
```



******************************************************
## O compilador
O compilador da linguagem Fast Sql gera código sql e realiza análises léxicas, 
sintáticas e semanticas para auxiliar o programador na hora de codar. 
### Exemplo de uso
- Código escrito em Fast Sql: 
```
createTable(Pessoas)
    .columns(
        id:int, 
        nome:varchar(50), 
        idade:varchar(3), 
        endereco:varchar(50)
    )

Pessoas.insert(1, 'Fulano', '20', 'Rua dois')

Pessoas.find(nome: 'Fulano', idade: 20)
Pessoas.find(nome: 'Fulano', idade: 20).columns(nome, endereco)

Pessoas.delete(nome: 'Fulano')
```
- Código Sql gerado pelo compilador:

```
CREATE TABLE Pessoas (
  id int, 
  nome varchar(50), 
  idade varchar(3), 
  endereco varchar(50),
);

INSERT INTO Pessoas VALUES (1, 'Fulano', '20', 'Rua dois');

SELECT * FROM Pessoas WHERE nome = 'Fulano' AND idade = '20';
SELECT (nome, endereco) FROM Pessoas WHERE nome = 'Fulano' AND idade = '20';

DELETE FROM Pessoas WHERE nome = 'Fulano';
```
