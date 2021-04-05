Este é o repositorio foi criado para para disponibilizar serviços para o cidadão. Como serviço de consulta impostos e serviço de noticias.
Para o acesso de todas as funcionalidades o usuário deve estar autenticado.

````Em ambiente produtivo não será possível chamar esse serviço diretamente, todas as requisições deverão passar pelo API-GATEWAY.````

Membros:
 - [Jonathan Cabral](mailto:dev.jonathancabral@gmail.com)
 - [André Graciano](mailto:dev.jonathancabral@gmail.com)

## Build sem Docker
 
    gradlew clean build

## build com docker

    docker build -t sgm/cidadao -f .\Dockerfile .

    docker run -it -p 8081:8081 sgm/cidadao

## Documentação da API SWAGGER
	http://localhost:8081/swagger-ui.html#/
  
## Impostos Controller

### Recupera IPTU

`ROLE_ADMIN, ROLE_CLIENT, ROLE_CITIZEN`

```http
GET /impostos/iptu/cpf/{cpf}/inscricao/{inscricao}
```
	curl -X GET "http://localhost:8081/impostos/iptu/cpf/46406708776/inscricao/397177689" -H "accept: */*"
			
| Parameter | Type | Description |
| :--- | :--- | :--- |
| `cpf` | `string` | **Required**. CPF do usuario |
| `inscricao` | `string` | **Required**. inscrição da imóvel |

### Recupera ITR

`ROLE_ADMIN, ROLE_CLIENT, ROLE_CITIZEN`

```http
GET /impostos/itr/cpf/{cpf}/inscricao/{inscricao}
```
	curl -X GET "http://localhost:8081/impostos/itr/cpf/46406708776/inscricao/397177689" -H "accept: */*"
			
| Parameter | Type | Description |
| :--- | :--- | :--- |
| `cpf` | `string` | **Required**. CPF do usuario |
| `inscricao` | `string` | **Required**. inscrição da imóvel |

## Noticias Controller

### Recupera todas noticias

`ROLE_ADMIN, ROLE_CLIENT, ROLE_CITIZEN`

```http
GET /noticias
```
	curl -X GET "http://localhost:8081/noticias" -H "accept: */*"
			
### Recupera noticia por ID

`ROLE_ADMIN, ROLE_CLIENT, ROLE_CITIZEN`

```http
GET /noticias/{id}
```
	curl -X GET "http://localhost:8081/noticias/1" -H "accept: */*"

| Parameter | Type | Description |
| :--- | :--- | :--- |
| `ID` | `Integer` | **Required**. Id noticia |

### Recupera noticia por ID

`ROLE_ADMIN, ROLE_CLIENT, ROLE_CITIZEN`

```http
GET /noticias/{titulo}/titulo
```
	curl -X GET "http://localhost:8081/noticias/novidade/titulo" -H "accept: */*"

| Parameter | Type | Description |
| :--- | :--- | :--- |
| `titulo` | `String` | **Required**. titulo da noticia |

### Recupera noticia por ID

`ROLE_ADMIN, ROLE_CLIENT`

```http
POST /noticias/
```
	curl -X POST "http://localhost:8081/noticias" -H "accept: */*"

| Parameter | Type | Description |
| :--- | :--- | :--- |
| `autor` | `String` | **Required**. usuario de sistema que cadastrou a noticia |
| `conteudo` | `String` | **Required**. conteúdo da noticia |
| `criacao` | `Date` | **Required**. Data de criação |
| `Titulo` | `String` | **Required**. titulo da noticia |
