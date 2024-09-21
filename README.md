
Here's the updated `README.md` that includes using **Postman** for testing the API:

---

# BookStore Management System

This is a simple **CRUD (Create, Read, Update, Delete)** Bookstore Management System built using **Java Spring Boot** for the backend and **HTML, JavaScript** for the frontend. The project is developed using **IntelliJ IDEA**.

## Features

- Add a new book (Add)
- View details of all available books (View)
- View details of book by id (FindById)
- Update book information by id (Update)
- Delete a book from the inventory by id (Delete)

## Tech Stack

### Backend:
- **Java**: Programming language.
- **Spring Boot**: Framework for creating the backend API.
- **Spring Data JPA**: For interacting with the database.
- **MySQL**: Relational database for persisting data.
- **Lombok**: For simplifying Java code (optional).
- **Maven**: Dependency management.

### Frontend:
- **HTML**: Structure of the website.
- **JavaScript**: Client-side interactivity.

### Tools:
- **IntelliJ IDEA**: Development environment for both backend.
- **Postman**: API testing tool.
- **MySQL Workbench**: For managing and querying the MySQL database.
- **Visual Studio Code**: Development environment for both frontend.

## Requirements

- **Java 11+** installed.
- **Maven** installed.
- **MySQL** installed.
- **IntelliJ IDEA** or any preferred IDE.
- **Postman** installed for API testing.

## Setting Up MySQL Database

1. Install **MySQL** and create a database:
   ```sql
   CREATE DATABASE bookstore;
   ```

2. Open `src/main/resources/application.properties` and configure the following MySQL properties:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
   ```

## Running the Application

1. Clone this repository.
2. Open the project in **IntelliJ IDEA**.
3. Run the Spring Boot application using the `BookstoreApplication.java` file.
4. Ensure that **MySQL** is running and the necessary database has been created.

## Testing the API with Postman

1. **Start the Spring Boot application**.
2. Open **Postman** and test the following endpoints:

### API Endpoints:

- **POST /book/insert**  
  To add a new book:
  ```json
  {
      "title": "Spring in Action",
      "author": "Craig Walls",
      "publicationYear": 2020,
      "price": 39.99,
      "publisher": "Manning Publications",
      "availableStock": 10
  }
  ```

- **GET /book**  
  To get all books in the store.

- **PUT /book/{id}**  
  To update an existing book by its ID.

- **DELETE /book/{id}**  
  To delete a book by its ID.

### Example Postman Request:

- Open **Postman** and create a **POST** request to `http://localhost:8080/book/insert`.
- Under the **Body** tab, select **raw** and set the type to **JSON**, then paste the sample JSON data.
- Click **Send** to test the API.

## Conclusion

This project demonstrates the implementation of a basic CRUD Bookstore Management System using **Spring Boot** for the backend and **HTML/CSS/JavaScript** for the frontend, along with **MySQL** as the database. Postman is used to test the backend API efficiently.
