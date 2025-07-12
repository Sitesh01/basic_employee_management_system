# 🧑‍💼 Basic Employee Management System

A full-stack CRUD web application for managing employee data using Angular, Spring Boot, and MySQL.

## 📌 Project Description

This project allows users to perform basic employee management operations such as adding, viewing, updating, and deleting employee records. It demonstrates how to build a full-stack application using a modern front-end framework, a RESTful backend, and a relational database.

---

## 🧰 Tech Stack

| Layer        | Technology         |
|--------------|--------------------|
| Frontend     | Angular, Bootstrap |
| Backend      | Spring Boot (REST APIs) |
| Database     | MySQL              |

---

## 🚀 Features

- View a list of employees
- Add a new employee
- Update existing employee information
- Delete employee records
- Responsive UI with Bootstrap
- RESTful APIs with Spring Boot
- Persistent storage with MySQL

---

## 📡 Available APIs

| Method | Endpoint                  | Description                      |
|--------|---------------------------|----------------------------------|
| GET    | `/api/v1/employees`       | Get list of all employees        |
| GET    | `/api/v1/employees/{id}`  | Get employee details by ID       |
| POST   | `/api/v1/employees`       | Create a new employee            |
| PUT    | `/api/v1/employees/{id}`  | Update an existing employee      |
| DELETE | `/api/v1/employees/{id}`  | Delete an employee by ID         

## ⚙️ How to Run

### Prerequisites:
- Node.js and Angular CLI installed
- Java 17+ and Maven installed
- MySQL installed and running

### Step 1: Setup Database
Create a MySQL database:
```sql
CREATE DATABASE ems;
```

Update your backend application properties with DB credentials.

### Step 2: Run Backend
bash
Copy
Edit

```
cd basic-employee-management-system
mvn spring-boot:run
```

### Step 3: Run Frontend
```
cd basic-ems-frontend
npm install
ng serve
```

### Written By : Sitesh Kumar Bhandary
