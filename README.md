# 🛒 Ecommerce API - CRUD de Produtos

> 🚧 **Status do Projeto:** Em desenvolvimento. Atualmente com o módulo de **Cadastro de Produtos** (MVP) 100% funcional.

Este projeto visa a construção de uma API robusta para gerenciamento de e-commerce, utilizando as versões mais recentes do ecossistema Java para garantir performance e segurança.

## 🛠️ O que já foi implementado?

- **Módulo de Cadastro:**
    - Persistência de dados utilizando **Spring Data JPA**.
    - Validações de entrada com **Bean Validation** (campos obrigatórios, SKUs únicos e preços positivos).
    - Versionamento do banco de dados MySQL via **Flyway Migrations**.
    - Uso de **Java Records** (DTOs) para transferência de dados eficiente.

## 🚀 Tecnologias Utilizadas

* **Java 25** (Versão mais recente)
* **Spring Boot 4.0.3**
* **MySQL 8.0**
* **Flyway Migration**
* **Hibernate**



## 📋 Como testar o cadastro

Atualmente, a API aceita requisições `POST` no endpoint `/produtos`.

**Exemplo de JSON (Request Body):**
```json
{
  "nome": "Teclado Mecânico RGB",
  "descricao": "Switch Blue, ABNT2",
  "preco": 299.90,
  "sku": "TEC-RGB-01",
  "categoria": "PERIFERICOS"
}
