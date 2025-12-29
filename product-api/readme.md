# Product API – Spring Boot REST Application

## Overview
This is a Spring Boot RESTful API that performs CRUD operations on a Product resource.
The application demonstrates clean architecture, validation, authentication, exception handling,
logging, and API documentation using Swagger.

## Tech Stack
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security (Basic Authentication)
- PostgreSQL
- Bean Validation (JSR-380)
- Swagger
- Maven

## Features
- CRUD operations on Product
- DTO-based API design
- Input validation with custom error messages
- Global exception handling
- HTTP Basic Authentication
- Swagger UI for API documentation
- Structured logging

## API Endpoints
| Method | Endpoint | Description |
|------|---------|-------------|
| GET | /products | Get all products |
| GET | /products/{id} | Get product by ID |
| POST | /products | Create product |
| PUT | /products/{id} | Update product |
| DELETE | /products/{id} | Delete product |

## Authentication
This API uses HTTP Basic Authentication.

**Credentials**
username: admin
password: admin123
