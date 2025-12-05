# Registration_Form_springboot_SQL
Registration Form using React, springboot, and SQL


libraries need to install:

backend:

navigate to the below link

	https://start.spring.io

Project		- Maven
Language 	- Java
Spring Boot	- 3.5.7
Group		- com.example
Artifact	- backend
Name		- backend
Packaging	- Jar
Java Version	- choose according to your local java version 17 or 21

Add the following Dependencies:

Spring Web 
Spring Data JPA
MySQL Driver
Spring Boot DevTools

click generate and extract the ZIP file

replace the backend src file with extracted src file

run backend using below command:

mvn spring-boot:run


frontend:

npx create-react-app frontend

replace the src in frontend

run frontend using below command:

npm start

schema:

create database studentregdb;

users table will be automatically created by using this entity @Table

Note:change your mysql password in resources -> application.properties