# Spring Boot Project with PostgreSQL and Docker Compose

This project demonstrates how to set up a Spring Boot application with a PostgreSQL database using Docker Compose. The application and the database will run in separate containers.

## Prerequisites

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

## Getting Started

1. Clone this repository to your local machine.
2. Create a `.env` file in the root directory with the following content:

```env
# Spring Boot Application Configuration
SPRING_SERVER_PORT=8080

# Database Configuration
DB_PORT=5432
DB_NAME=mydb
DB_USER=myuser
DB_PASSWORD=mypassword
```

3. Update the values in the `.env` file according to your requirements.

## Building and Running the Application with Docker

To build and run the Spring Boot application using Docker, a Dockerfile is provided with the necessary instructions. The application uses the Eclipse Temurin JDK 17 image for execution.

### Dockerfile

The Dockerfile is configured to build the Spring Boot application and package it into a Docker image. It uses the `eclipse-temurin:17-jdk-jammy` image as the base image.


To build the Docker image, navigate to the project directory and run:

```bash
docker build -t springapi/springboot_CargoShip .
```

### Running the Application with Docker Compose

The `docker-compose.yml` file defines the services for the Spring Boot application and the PostgreSQL database. It also sets environment variables using the `.env` file.

To start the application and the database, run:

```bash
docker-compose up
```

The Spring Boot application will be accessible at `http://localhost:8080/swagger-ui/index.html#/`.

## Customizing the Application

Feel free to modify the Spring Boot application code and the database configuration to suit your needs.

## License
This project is licensed under the [MIT License](LICENSE).
