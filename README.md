# Task Management System API

## Features
- Complete CRUD Operations for Tasks (Create, Read, Update, Delete)
- MySQL Integration with Hibernate/JPA
- Swagger API Documentation

## Tech Stack
- Java 17
- Spring Boot
- MySQL
- Springdoc OpenAPI (Swagger)
- Lombok

## Setup Instructions

1. **Database Setup:** 
   Ensure MySQL is running locally on port 3306.
   The database `taskdb` will be created automatically if it doesn't exist, thanks to the connection string configuration.

2. **Database Credentials:**
   Update `src/main/resources/application.properties` with your MySQL username and password if they differ from the defaults (`root` / `root`).

3. **Run the Application:**
   Open a terminal in the project root and run:
   ```bash
   mvn spring-boot:run
   ```

## API Documentation
Once the application is running, view and test the API using Swagger UI:
`http://localhost:8080/swagger-ui.html`

## Example Endpoints
- `GET /tasks` - Retrieve all tasks
- `POST /tasks` - Create a new task
- `PUT /tasks/{id}` - Update a task
- `DELETE /tasks/{id}` - Delete a task
