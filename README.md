# Product API – Spring Boot REST Application

## Overview

Product API is a Spring Boot–based RESTful application that provides CRUD operations for managing products.
The application demonstrates clean architecture, validation, authentication, exception handling, logging, and API documentation using Swagger.

This project was developed as part of a technical assignment to showcase real-world backend development practices using Java and Spring Boot.

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* Spring Security (HTTP Basic Authentication)
* PostgreSQL / MySQL
* Bean Validation (JSR 380)
* OpenAPI / Swagger
* Maven

---

## Features

* CRUD operations on Product resource
* DTO-based API design (request/response separation)
* Input validation with custom error messages
* Global exception handling using `@ControllerAdvice`
* HTTP Basic Authentication
* Structured logging using SLF4J
* Swagger UI for API documentation
* SQL-based schema management

---

## API Endpoints

| Method | Endpoint         | Description                |
| ------ | ---------------- | -------------------------- |
| GET    | `/products`      | Fetch all products         |
| GET    | `/products/{id}` | Fetch product by ID        |
| POST   | `/products`      | Create a new product       |
| PUT    | `/products/{id}` | Update an existing product |
| DELETE | `/products/{id}` | Delete a product           |

---

## Authentication

The API is secured using **HTTP Basic Authentication**.

**Credentials**

```
Username: admin
Password: admin123
```

All `/products/**` endpoints require authentication.
Swagger UI and OpenAPI endpoints are publicly accessible.

---

## Swagger UI

Swagger UI is available at:

```
http://localhost:8080/swagger-ui.html
```

It can be used to explore and test all API endpoints interactively.

---

## Sample Request (Create Product)

```json
{
  "name": "Laptop",
  "description": "High performance laptop",
  "price": 75000
}
```

---

## Database Setup

* Database schema is managed using `schema.sql`
* Optional sample data is loaded via `data.sql`
* Hibernate DDL auto-generation is disabled to ensure controlled schema management

---

## How to Run the Application

1. Clone the repository
2. Configure database credentials in `application.yml`
3. Run the application:

```bash
mvn clean install
mvn spring-boot:run
```

4. Access the application on:

```
http://localhost:8080
```

---

## Logging

* Application logs are configured using SLF4J
* Log levels are environment-friendly and suitable for production debugging

---
