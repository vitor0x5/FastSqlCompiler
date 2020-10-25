# Fast Sql Compiler
#### Compilador e linguagem criados para a disciplina Construção de Compiladores
#### do Departamento de Computação - UFSCar
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
Pessoas.insert(1, "Fulano", "20", "Rua dois")
```
https://www.youtube.com/watch?v=lzDJAD4NkQ4&feature=youtu.be

- Pesquisando linhas
```
Pessoas.find(nome: "Fulano", idade: "20")
```

```
Pessoas.find(nome: "Fulano", idade: "20").columns(nome, endereco)
```

```
Pessoas.findAll()
```

```
Pessoas.findAll().columns(nome, endereco)
```

- Deletando linhas
```
Pessoas.delete(nome: "Fulano")
```
```
Pessoas.deleteAll()
```

******************************************************
## O compilador
O compilador da linguagem Fast Sql gera código sql e realiza análises léxicas,
sintáticas e semanticas para auxiliar o programador na hora de codar.
Ele foi criado utilizando a biblioteca [Antlr 4.8](https://www.antlr.org/) e a
linguagem Java
ç - Simbolo não identificado
### Exemplo de geração de código
- Código escrito em Fast Sql:
```
createTable(Pessoas)https://www.youtube.com/watch?v=lzDJAD4NkQ4&feature=youtu.be
    .columns(
        id:int,
        nome:varchar(50),
        idade:varchar(3),
        endereco:varchar(50)
    )

Pessoas.insert(1, "Fulano", "20", "Rua dois")

Pessoas.find(nome: "Fulano", idade: "20")
Pessoas.find(nome: "Fulano", idade: "20").columns(nome, endereco)
Pessoas.findAll()
Pessoas.findAll().columns(nome, endereco)

Pessoas.delete(nome: "Fulano")
Pessoas.deleteAll()
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

SELECT * FROM Pessoas WHERE nome = 'Fulano'https://www.youtube.com/watch?v=lzDJAD4NkQ4&feature=youtu.be AND idade = '20';
SELECT (nome, endereco) FROM Pessoas WHERE nome = 'Fulano' AND idade = '20';
SELECT * FROM Pessoas
SELECT (nome, endereco) FROM Pessoas

DELETE FROM Pessoas WHERE nome = 'Fulano';
DELETE FROM Pessoas
```
******************************************************
## Compilando o projeto
Caso você deseje compilar o código fonte siga os passos a baixo:

1. Clone o projeto
```
git clone https://github.com/vitor0x5/FastSqlCompiler.git
```
2. Abra o projeto em uma IDE Java (recomendação: [Apache NetBeans](http://netbeans.apache.org/))
3. Execute a verificação de pacotes/plugins do maven
4. Clique no botão de Build da sua IDE

## Utilizando o compilador
Para utilizar o compilador siga os passos a baixo:

1. Escreva um código em Fast Sql e salve em um arquivo
2. Baixe o [executável do compilador](https://https://www.youtube.com/watch?v=lzDJAD4NkQ4&feature=youtu.begithub.com/vitor0x5/FastSqlCompiler/blob/master/target/fastSqlCompiler-1.0-SNAPSHOT-jar-with-dependencies.jar) ou compile o projeto você mesmo
3. Abra um terminal e execute o seguinte comando:
```
java -jar fastSqlCompiler-1.0-SNAPSHOT-jar-with-dependencies.jar <seu-código-fast-sql> <arquivo-de-saída>
```
4. O compilador irá analisar <seu-código-fast-sql> e imprimir em <arquivo-de-saída> os erros (caso haja algum) ou o código sql gerado
5. Use o código gerado em seu banco de dados de preferência

******************************************************
##Arquivos do projeto

Existem 3 arquivos escenciais para a compreensão do projeto, são eles:

1. src/main/antlr4/br/ufscar/dc/compiladores/fastsqlcompiler/***FastSql.g4***: esse arquivo define a gramatica da linguagem, é um arquivofor FILE in casos-de-teste/*; do java -jar target/fastSqlCompiler-1.0-SNAPSHOT-jar-with-dependencies.jar $FILE $FILE.output; done utilizado pela ferramenta Antlr para gerar classes que irão funcionar como nosso analizadores léxico, sintático e semântico.

2. src/main/java/br/ufscar/dc/compiladores/fastsqlcompiler/***Main.java***: esse arquivo combina todas as classes em um lugar só e gera a nossa execução principal.

3. src/main/java/br/ufscar/dc/compiladores/fastsqlcompiler/***FastSqlSeç - Simbolo não identificadomantic.java***: nesse arquivos temos a implementação do analizador semântico, ele usa a classe FastSqlBaseVisitor gerada automaticamente pelo Antlr, essa classe nos permite navegar pela árvore sintática do nosso programa, então podemos fazer verificacões de todo tipo.

*********************************************************
## Casos de teste
Os casos de teste estão na basta '/casos-de-teste' e consistem em uma série de arquivos .fsql que contêm exemplos de programas usando a linguagem criada nesse projeto e também arquivos .fsql.output que é o retorno do compilador para cada um dos arquivos contendo o programa. Para gerar novamente os arquivos de output, exclua os já existentes e execute no seu terminal, estando na pasta raiz do projeto, o sequinte comando:

```console
for FILE in casos-de-teste/*; do java -jar target/fastSqlCompiler-1.0-SNAPSHOT-jar-with-dependencies.jar $FILE $FILE.output; done
```

O arquivo de teste 'exemplo-claro.fsql' é o único arquivo que possui geração de código, os demais arquivos mostram como o compilador trata diferentes erros no programa.

### Video Explciativo

[![IMAGE ALT TEXT HERE](http://img.youtube.com/vi/lzDJAD4NkQ4/0.jpg)](http://www.youtube.com/watch?v=lzDJAD4NkQ4)
