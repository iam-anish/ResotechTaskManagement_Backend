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

## **Frontend Service (React):**

**Project Setup:**
1. Install Node.js and npm:
   
   -> If you haven't installed Node.js and npm yet, download and install them from Node.js official website.


2. Navigate to Frontend Directory:
   
   -> Open your terminal and navigate to the frontend directory of your React project.


3. Install Dependencies:

   -> Run the following command to install all required dependencies:
   npm install


4. Update API URL:
   
   -> Locate the taskService.axios.js file in your React project.
   
   -> Update the const API_URL variable with the backend API URL as follows:

   const API_URL = 'http://localhost:9070/api/tasks';
   Ensure that you replace http://localhost:9070/api/tasks with the actual API URL where your Spring Boot backend is running.


5. Start the Frontend Development Server:
   
   -> After updating the API URL, run the following command to start the frontend development server:
   npm start

   This will start the React application, and you can access it via http://localhost:3000 in your web browser.
   By following these steps, you should have both the backend and frontend services up and running, allowing you to manage tasks effectively using the Resotech Task Management System.