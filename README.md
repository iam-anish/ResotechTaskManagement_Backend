# **Resotech Task Management System**

## **Backend Service (Spring Boot):**

**Database Configuration:**

1. MySQL Database Setup:
  
   -> Create a MySQL database named resotech_task in your MySQL server.


2. Update Database Configuration:
   
   -> Navigate to your Spring Boot project and locate the application.properties file.
   
   -> Update the database connection URL in the application.properties file as follows:
properties

spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:${MYSQL_PORT:3306}/resotech_task
   Ensure that you replace ${MYSQL_HOST:localhost} and ${MYSQL_PORT:3306} with your actual MySQL host and port if they are different from the default values.


3. Start the Backend Server:

   -> Run your Spring Boot application. Upon starting the server, it will automatically create all necessary tables in the resotech_task database.

