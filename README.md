# 📦 Estoque BackEnd

API REST desenvolvida com **Spring Boot** para gerenciamento de produtos em estoque.  
O projeto fornece endpoints para consulta de produtos e foi estruturado visando **boas práticas de arquitetura, segurança e escalabilidade**.

> Este backend é consumido por uma aplicação frontend (JavaFX) e se comunica via API REST.

## 🔗 Link da Aplicação Front

https://github.com/Felipe-Osorio-Dev/Estoque-Front

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Banco de Dados Relacional (configurável)
- Maven

---

## 📂 Arquitetura do Projeto

O projeto segue uma separação clara de responsabilidades:

- **controller** → Camada de entrada da API (REST)
- **service** → Regras de negócio
- **repository** → Acesso a dados
- **dto** → Objetos de transferência de dados
- **exception** → Tratamento centralizado de erros
- **config** → Configurações da aplicação

---

## 🔍 Funcionalidades Atuais

- Buscar produto por:
  - ID
  - Nome
  - Código do produto
- Tratamento de exceções personalizado
- Validação de entradas
- Comunicação via API REST

---

## 🛠️ Funcionalidades Planejadas

- Listagem de produtos
- Cadastro de produtos
- Atualização de produtos
- Exclusão de produtos
- Autenticação e autorização (JWT)
- Paginação e filtros

---

## 🔐 Segurança

Este projeto **não versiona dados sensíveis**.

As configurações de acesso ao banco de dados e outros dados sensíveis são feitas via **variáveis de ambiente**.

### Variáveis de Ambiente Necessárias

```bash
DB_URL=jdbc:postgresql://localhost:5432/estoque
DB_USER=seu_usuario
DB_PASSWORD=sua_senha
```

## ⚙️ Configuração da Aplicação

Exemplo de configuração (application-example.properties):

```bash
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=false
```

Crie seu próprio application.properties localmente ou utilize variáveis de ambiente.

## ▶️ Como Executar o Projeto
Pré-requisitos

Java 17+

Maven

Banco de dados configurado

Passos:

# Clone o repositório
git clone https://github.com/Felipe-Osorio-Dev/Estoque-BackEnd.git

# Acesse o diretório
cd Estoque-BackEnd

# Execute o projeto
mvn spring-boot:run

A aplicação estará disponível em:

http://localhost:8080

## 📡 Endpoints (Exemplo)

GET /produtos/{id}

GET /produtos?nome=ProdutoExemplo

GET /produtos?codigo=ABC123

## 🧪 Tratamento de Erros

O projeto utiliza tratamento centralizado de exceções para retornar respostas claras e padronizadas em caso de erro, facilitando o consumo da API pelo frontend.

## 🧠 Aprendizados e Objetivos

Este projeto foi desenvolvido com foco em:

Arquitetura limpa

Boas práticas com Spring Boot

Separação entre DTO e Model

Segurança no versionamento de código

Preparação para escalabilidade

## 👨‍💻 Autor

Felipe Osorio

🔗 GitHub: Felipe-Osorio-Dev

## 📌 Observações

Este projeto faz parte de um ecossistema onde o frontend é desenvolvido em JavaFX, consumindo esta API para operações de estoque.
