<h1 align="center">
  TODO List
</h1>

API para gerenciar tarefas (CRUD).

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [H2 Database Engine](https://www.h2database.com/html/main.html)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com/):

### Descrição da Solicitação
- **Criar Tarefa**
- **Método HTTP:** POST
- **URL:** `http://localhost:8080/todos`
- **Cabeçalhos:** Nenhum
- **Parâmetros da URL:** Nenhum
- **Corpo da Solicitação:** Nenhum

### Resposta Esperada

- **Código de Status:** 200 OK
- **Exemplo de Resposta:**

```json
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
```
### Descrição da Solicitação
- **Listar Tarefas**
- **Método HTTP:** GET
- **URL:** `http://localhost:8080/todos`
- **Cabeçalhos:** Nenhum
- **Parâmetros da URL:** Nenhum
- **Corpo da Solicitação:** Nenhum

### Resposta Esperada

- **Código de Status:** 200 OK
- **Exemplo de Resposta:**

```json
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
```

### Descrição da Solicitação
- **Atualizar Tarefa**
- **Método HTTP:** PUT
- **URL:** `http://localhost:8080/todos`
- **Cabeçalhos:** Nenhum
- **Parâmetros da URL:** Nenhum
- **Corpo da Solicitação:** Nenhum

### Resposta Esperada

- **Código de Status:** 200 OK
- **Exemplo de Resposta:**

```json
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
```
### Descrição da Solicitação
- **Remover Tarefa**
- **Método HTTP:** DELETE
- **URL:** `http://localhost:8080/todos/{id}`
- **Cabeçalhos:** Nenhum
- **Parâmetros da URL:** Nenhum
   - `{id}`: O ID do todo que deseja excluir.
- **Corpo da Solicitação:** Nenhum

### Resposta Esperada

- **Código de Status:** 200 OK
- **Exemplo de Resposta:**

```json
[ ]
```