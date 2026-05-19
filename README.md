# Touch - Spring Boot 3.5 Project

A simple Spring Boot 3.5 application using Maven as the build tool.

## Project Structure

```
touch/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/touch/
│   │   │       ├── TouchApplication.java
│   │   │       └── controller/
│   │   │           └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── README.md
```

## Prerequisites

- Java 17 or higher
- Maven 3.6+

## Getting Started

### 1. Build the Project

```bash
mvn clean install
```

### 2. Run the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### 3. Test the Endpoints

```bash
# Hello endpoint
curl http://localhost:8080/

# Status endpoint
curl http://localhost:8080/api/status

# Health check
curl http://localhost:8080/actuator/health
```

## Technologies Used

- **Spring Boot**: 3.5.0
- **Java**: 17
- **Maven**: 3.6+
- **Lombok**: For reducing boilerplate code
- **Spring DevTools**: For live reload during development

## Dependencies

- `spring-boot-starter-web` - For building REST APIs
- `spring-boot-starter-actuator` - For monitoring and management endpoints
- `spring-boot-starter-test` - For unit testing
- `spring-boot-devtools` - For development improvements
- `lombok` - For annotation processing

## Configuration

Application properties can be modified in `src/main/resources/application.properties`:

- `server.port`: Server port (default: 8080)
- `logging.level.root`: Root logging level (default: INFO)
- `management.endpoints.web.exposure.include`: Exposed actuator endpoints

## Building for Production

```bash
mvn clean package
java -jar target/touch-1.0.0.jar
```

## License

This project is open source and available under the MIT License.

## Next Steps

1. Add more controllers and services as needed
2. Configure database connection if required
3. Add more dependencies for your specific use case
4. Set up proper error handling and logging
5. Add unit and integration tests
