<!-- omit from toc -->
# FIAT - SOAT1 - GRUPO 18

![](https://github.com/pabloldias/soat1-grupo18/actions/workflows/build-and-test.yml/badge.svg)

- [Tech Challenge](#tech-challenge)
  - [Alunos](#alunos)
  - [Tecnologias utilizadas](#tecnologias-utilizadas)
  - [Como rodar a aplicação via docker-compose?](#como-rodar-a-aplicação-via-docker-compose)
  - [Como rodar a aplicação via kubernetes?](#como-rodar-a-aplicação-via-kubernetes)
  - [Swagger](#swagger)
  - [Insomnia](#insomnia)
  - [Event Storming](#event-storming)


## Tech Challenge

Projeto realizado durante o primeiro módulo da Pós Tech Software Architecture da FIAP.

### Alunos

|                            Nome |     RM     |
| ------------------------------: | :--------: |
|    Elvis Freitas Lopes Herllain | `rm349139` |
|            Gisele Mara Leonardi | `rm349242` |
|   Leandro Gonçalves de Oliveira | `rm348615` |
|                 Pablo Lima Dias | `rm349149` |
| Pedro Henrique Gregorio Ignacio | `rm349099` |

### Tecnologias utilizadas

- Spring Boot 3.1
- Postgres 15
- Java 17
- Docker
- Github Actions
  - Para validar o docker-compose.yaml e fazer alguns testes e2e

### Como rodar a aplicação via docker-compose?

Para levantar a API junto com o banco de dados Postgres, execute na pasta raiz:

```bash
docker compose up
```

### Como rodar a aplicação via kubernetes?

Para levantar a API junto com o banco de dados Postgres, execute na pasta raiz:

```bash
kubectl apply -f kubernetes/
```

### Swagger

Para acessar o Swagger da aplicação, acesse o caminho [/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) da aplicação.

### Insomnia

Há um arquivo [insomnia-collection.yml](insomnia-collection.yml) na raiz do repositório.

### Event Storming

Nosso *event storming* está disponível em um [board do Miro](https://miro.com/app/board/uXjVMHS5nec=/).
