Spring Boot CRM Application

Overview

This is a Spring Boot-based Customer Relationship Management (CRM) application designed to manage customer information. The application provides a user-friendly interface to log in, view a dashboard, list customers, add new customers, edit existing customers, and delete customers. It leverages modern web technologies and follows best practices for a Spring Boot application.

Features





User Authentication: Secure login page with Spring Security.



Dashboard: Welcome page with navigation options.



Customer Management:





View a list of customers with search functionality by name.



Add new customers with name, email, and phone details.



Edit existing customer information.



Delete customers from the list.



Responsive Design: Clean and intuitive UI built with Thymeleaf.

Technologies Used





Backend: Spring Boot 3.3.4



Database: MySQL (with Hibernate/JPA)



Frontend: Thymeleaf



Security: Spring Security



Build Tool: Maven



Java Version: 24

Prerequisites





Java 24 or higher



MySQL Server (e.g., MySQL 8.x)



Maven 3.x



IDE (e.g., Spring Tool Suite, IntelliJ IDEA, or Eclipse)

Installation





Clone the Repository

git clone https://github.com/your-username/spring-boot-crm.git
cd spring-boot-crm



Configure the Database





Create a MySQL database named student_crm_db.



Update src/main/resources/application.properties with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/student_crm_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver



Build the Project

mvn clean install



Run the Application

mvn spring-boot:run

Alternatively, run the CrMprojectApplication class in your IDE.



Access the Application





Open your browser and navigate to http://localhost:8080/login.



Default login: Username: user, Password: password (update with secure credentials in production).

Screenshots

Login Page

![Screenshot 2025-04-22 114130](https://github.com/user-attachments/assets/969d09ff-7d8a-4b8a-8327-51fc460d5465)


Dashboard

![Screenshot 2025-04-22 114215](https://github.com/user-attachments/assets/7cb6bd3b-1864-40a1-bdf5-ac27b1a397a3)


Customer List


![Screenshot 2025-04-22 114221](https://github.com/user-attachments/assets/d5de3b69-2f0e-4687-bbfb-2f7c32a017d7)


Edit Customer


![Screenshot 2025-04-22 114304](https://github.com/user-attachments/assets/11e2d644-63e8-40d6-a179-0435b9907b2b)


Add Customer


![Screenshot 2025-04-22 114229](https://github.com/user-attachments/assets/7611df01-7c36-4ae9-926b-868e3cd17164)

![crm-logo](https://github.com/user-attachments/assets/f2959aa1-04f8-4404-ba7b-3fb06b4ebed9)


Usage





Log in with the default credentials.



Navigate to the dashboard to manage customers.



Use the "View Customers" page to search, edit, or delete customers.



Add new customers via the "Add Customer" form.

Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.






