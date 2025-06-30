# springboot-employee-crud-api
Spring Boot CRUD REST API for managing employee records with MySQL database integration. Built using Spring Data JPA, Lombok, and RESTful principles.

# Spring Boot Employee CRUD API

A simple RESTful API built with **Spring Boot** that performs full **CRUD operations** on an `Employee` entity using **Spring Data JPA** and **MySQL**.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.3
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Postman (for testing)

---

## API Endpoints

| Method | Endpoint              | Description             |
|--------|-----------------------|-------------------------|
| POST   | `/api/employees`      | Create new employee     |
| GET    | `/api/employees`      | Get all employees       |
| GET    | `/api/employees/{id}` | Get employee by ID      |
| PUT    | `/api/employees/{id}` | Update employee by ID   |
| DELETE | `/api/employees/{id}` | Delete employee by ID   |

---

## How to Test with Postman

1. Set `Content-Type: application/json`
2. Example JSON for POST/PUT:

```json
{
  "name": "Munna",
  "department": "Java",
  "salary": 50000
}

---

Project Structure

src
├── controller
│   └── EmployeeController.java
├── model
│   └── Employee.java
├── repository
│   └── EmployeeRepository.java
└── EmployeeApiApplication.java

---

🙋‍♂️ Author
Munna Aziz Mondal
Java Developer | Spring Boot | REST API | MySQL |  Microservices | AWS | 
🌐 LinkedIn: https://www.linkedin.com/in/munna-aziz-mondal-061b95212/
📫 Email: azizmunna661@gmail.com

---

⭐️ Support
If you like this project, give it a ⭐️ on GitHub and share!
