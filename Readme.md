# Spring Boot JPA Demo Application
A Spring Boot application demonstrating JPA integration with both H2 and PostgreSQL databases.

# Project Structure

**1. Controller:** Handles HTTP requests and responses.

**2. Model:** Contains JPA Entity Class which defines the database schema.

**3. Repository:** Extends the Spring JPA Repository and provides database operations.

**4. Service:** Contains the business logic.

# Getting Started

### 1. Clone the repository

```
git clone https://github.com/NidhiYadav726/SpringBoot_JPADemo.git
```
### 2. Add H2 and PostgreSQL Dependency in pom.xml

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		
 IF USING POSTGRES DATABASE use THIS DEPENDENCY-->
	<dependency>
	    <groupId>org.postgresql</groupId>
   	    <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
        </dependency>
```

### 3. Configure database properties in application.properties
#### 1. Database Configuration for H2
````
spring.datasource.url=jdbc:h2:mem:demoDatabase
spring.jpa.show-sql=true

#to delay data initialization, first create table and then update data
spring.jpa.defer-datasource-initialization=true
````
#### 2. DataBase Configuration for PostgreSQL

```
#spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_database
#spring.datasource.username=your-username
#spring.datasource.password=your-password
#spring.datasource.driver-class-name=org.postgresql.Driver
```
# Executing the Project
### 1. Using H2 Database

 ``
mvn spring-boot:run
``

Access H2 console at http://localhost:8080/h2-console 

### 2. Using PostgreSQL
a. Ensure PostgreSQL is running.

b. Update application.properties with PostgreSQL Configurations.

``
mvn spring-boot:run
``

Access http://localhost:8080/api/users to view the results

# Technologies Used
1. **Spring Boot** - Framework for building Java applications


2. **Spring Data JPA** - ORM for database interaction


3. **H2 Database** - In-memory database for development & testing


4. **PostgreSQL** - Relational database for production


5. **Spring Boot REST API** - To expose CRUD operations
