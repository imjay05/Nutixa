# Nutixa 
Nutrixa is a  Spring Boot backend service for fitness activity tracking, engineered with JWT authentication for scalable health data management.


## 🛠Tech Stack & Tools



Language: Java 21 (LTS)

Framework: Spring Boot 4.0.1 (Spring Security, Spring Data JPA)

Database: MYSQL and PostgreSQL (Cloud-hosted via Neon DB)

Security: JSON Web Tokens (JWT) with Stateless Session Management

Deployment: Render 

Documentation: Swagger UI / OpenAPI 3.0



## 🏗 System Architecture



The project follows the N-Tier Architecture to ensure separation of concerns and maintainability:

Controller Layer: Handles REST requests and DTO mapping.

Service Layer: Contains core business logic and transaction management.

Repository Layer: Manages database interactions using Spring Data JPA.

Security Layer: Custom JWT Filters and Role-Based Access Control (RBAC).

## Project Structure


```text
Nutixa/
├── fitness/
│   ├── API_Test_ScreenShots/     # API validation proof
│   ├── src/main/java/com/project/fitness/
│   │   ├── config/               # API Configurations
│   │   │   └── OpenApiConfig.java
│   │   ├── controller/           # REST Endpoints
│   │   │   ├── ActivityController.java
│   │   │   ├── AuthController.java
│   │   │   ├── PublicController.java
│   │   │   └── RecommendationsController.java
│   │   ├── dto/                  # Data Transfer Objects
│   │   │   ├── ActivityRequest.java
│   │   │   ├── ActivityResponse.java
│   │   │   ├── LoginRequest.java
│   │   │   ├── LoginResponse.java
│   │   │   ├── RecommendationRequest.java
│   │   │   └── RegisterRequest.java
│   │   ├── exceptions/           # Global Error Handling
│   │   │   └── GlobalExceptionHandler.java
│   │   ├── model/                # JPA Entities (Database Tables)
│   │   │   ├── Activity.java
│   │   │   ├── ActivityType.java
│   │   │   ├── Recommendations.java
│   │   │   ├── User.java
│   │   │   └── UserRole.java
│   │   ├── repository/           # Database Communication
│   │   │   ├── ActivityRepository.java
│   │   │   ├── RecommendationRepository.java
│   │   │   └── UserRepository.java
│   │   ├── security/             # JWT & Spring Security Logic
│   │   │   ├── CustomUserDetailsService.java
│   │   │   ├── JwtAuthenticationFilter.java
│   │   │   ├── JwtUtils.java
│   │   │   └── SecurityConfig.java
│   │   ├── services/             # Business Logic Layer
│   │   │   ├── ActivityService.java
│   │   │   ├── RecommendationService.java
│   │   │   └── UserService.java
│   │   └── FitnessApplication.java # Main Entry Point
│   ├── resources/
│   │   └── application.properties # App Configurations
│   ├── Dockerfile                # Deployment Config
│   └── pom.xml                   # Maven Dependencies
├── .gitignore                    # Git Ignore rules
└── README.md                     # Project Documentation

```

## 🔑 Key Features



Stateless Authentication: Secure login using JWT with custom OncePerRequestFilter.

RBAC (Role-Based Access Control): Dedicated endpoints for ROLE_USER and ROLE_ADMIN.

Automated Deployment: Fully containerized logic ready for Docker and cloud environments.

Data Integrity: Robust validation using Jakarta Validation and global exception handling.


## 📖 API Documentation (Swagger)

The project includes fully interactive documentation using Swagger UI. This allows for real-time testing of endpoints without external tools.

Live Documentation: https://nutrixa-fit.onrender.com/swagger-ui/index.html

Base URL: https://nutrixa-fitness.onrender.com


## 📊 Database Schema (ER Diagram)



<img width="856" height="821" alt="EER_Diagram" src="https://github.com/user-attachments/assets/a7cc1f73-62c9-4e00-b914-05ff3a818de4" />



## Getting Started


Clone the Repo: https://github.com/imjay05/Nutixa

Environment Variables: Create an application.properties and add your DB_URL, DB_PWD, DB_USER .

Run: ./mvnw package 

spring-boot:run
