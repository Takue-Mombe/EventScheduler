# EventScheduler

This is an Event Scheduler app using Restful APIs using springboot, spring security and postgresql

## [Features](#Features)
1. Create, read, update, and delete events
2. User registration and authentication
3. Secure password hashing with bcryptjs


## [Setup](#Setup)
### Prerequisites
Before running the application, make sure you have the following installed:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) 

### Clone the repository
```bash
git clone [https://github.com/Takue-Mombe/event-scheduling-app.git](https://github.com/Takue-Mombe/EventScheduler.git)
cd event-scheduling-app
```

### Build the project
```bash
mvn clean package
```
### Run the application
  ```bash
java -jar target/event-scheduling-app.jar
Replace 'target/event-scheduling-app.jar' with the actual path to your JAR file.
```

## [API_Endpoints](#API_Endpoints)
1. ### Events(#Events)
- `GET /events`: Retrieve all events.
- `GET /events/{id}`:Retrieve an event by ID.
- `POST /events`: Creates a new event (requires authentication)
- `PUT /events/{id}`: Update an existing event (requires authentication)
- `DELETE /events/{id}`: Delete an event (requires authentication)

2. ### Authentication (#Authentication)
- `POST /users/register`:Register a new user.
- `GET /users/login`: Login with username and password

## Request and Response Formats
### Event Schema:

```json
{
  "id": int,
  "title": "String",
  "description": "String",
  "date": "yyyy-mm-dd",
  "time": "hh:mm:ss"
}
```

### User Schema

```json
{
  "username": "String",
  "password": "String",
  "firstName": "String",
  "lastName": "String",
  "phoneNumber": int,
  "emailAddress": "String"
}
```

### Authentication

#### Request

```json
{
  "username": "String",
  "password": "String"
}
```
### Reponse Body (Failed Login)
```json
{
  "error": "Invalid credentials",
  "message": "Bad credentials"
}


```

## [Dependencies](#Dependencies)

- Spring Data JPA
- Lombok
- Spring Data JDBC
- Spring Web
- Spring Boot DevTools
- PostgreSQL Driver
- Spring Security

## Contributions

Contributions are welcome!

## License
This project is licensed under the terms of the MIT license. See the [LICENSE](LICENSE) file for details.
