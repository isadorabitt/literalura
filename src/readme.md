# LiterAlura

Projeto para o desafio LiterAlura, onde construímos um catálogo de livros consumindo a API Gutendex e persistindo dados em um banco de dados PostgreSQL.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Pré-requisitos

- Java 17
- Maven
- PostgreSQL

## Configuração do Ambiente

### 1. Instalar o PostgreSQL

1. Baixe e instale o PostgreSQL a partir do [site oficial](https://www.postgresql.org/download/).
2. Durante a instalação, configure uma senha para o usuário `postgres`.
3. Crie um banco de dados chamado `literalura`:
   ```sql
   CREATE DATABASE literalura;
   
### Clonar repositório

1. git clone <url-do-repositorio>
   cd literalura

### Configurar o application.properties

1. spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
   spring.datasource.username=postgres
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

### Instalar as dependências

1. mvn clean install

### Executando o Projeto

1. mvn spring-boot:run

### Endpoints da API
- Livros
-Listar todos os livros

- http

- GET /livros
-Retorna uma lista de todos os livros cadastrados no banco de dados.

- Adicionar um novo livro

-http
-Copiar código
-POST /livros
-Corpo da requisição (JSON):

-json

{
"titulo": "Dom Casmurro",
"autor": "Machado de Assis",
"idioma": "PT",
"downloads": 500
}
- Buscar livro por título na API Gutendex e adicionar ao banco de dados

http
Copiar código
GET /livros/buscar?titulo=Dom Casmurro
Substitua Dom Casmurro pelo título desejado.

Autores
Listar todos os autores

http
Copiar código
GET /autores
Retorna uma lista de todos os autores cadastrados no banco de dados.

Adicionar um novo autor

http
Copiar código
POST /autores
Corpo da requisição (JSON):

json
Copiar código
{
"nome": "Machado de Assis",
"nascimento": "1839-06-21",
"falecimento": "1908-09-29"
}