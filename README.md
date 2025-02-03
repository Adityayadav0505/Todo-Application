# 📝 Todo Application

A full-stack **Todo Application** built using **Spring Boot** (Backend) and **React** (Frontend).

## 📌 Features
- ✅ User authentication & authorization (JWT-based)
- ✅ Create, update, delete, and view todos
- ✅ Mark todos as completed
- ✅ Responsive UI built with React
- ✅ RESTful APIs powered by Spring Boot
- ✅ PostgreSQL/MySQL Database Integration (currently using h2 database)
- ✅ Secure backend with Spring Security
- ✅ Frontend state management using React Hooks

---

## 🏗️ **Tech Stack**
### **Frontend** (React)
- ⚛️ React.js
- 🎨 Bootstrap / TailwindCSS (for styling)
- 🔄 Axios (for API calls)
- 🔧 React Router

### **Backend** (Spring Boot)
- ☕ Spring Boot 3
- 🔐 Spring Security & JWT Authentication
- 🗄️ Hibernate & JPA (for database interaction)
- 📡 REST API with Spring Web

### **Database**
- 💾 PostgreSQL / MySQL (Choose as per your requirement)

---

## 🚀 **Getting Started**

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/your-username/todo-app.git
cd todo-app
```
🎯 Backend Setup (Spring Boot)

2️⃣ Configure Database
Update application.properties (for MySQL/PostgreSQL):
```
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3️⃣ Build & Run Backend
sh
```
cd backend
mvn spring-boot:run
```
By default, the server runs on http://localhost:8080.

🎨 Frontend Setup (React)
4️⃣ Install Dependencies
sh
```
cd frontend
npm install
```
5️⃣ Run React App
sh
```
npm start
The frontend runs on http://localhost:3000.
```



