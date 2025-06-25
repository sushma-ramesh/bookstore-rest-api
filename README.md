# bookstore-rest-api
# 📚 Bookstore REST API

A Spring Boot-based RESTful API to manage books, customers, and orders. It includes features like CRUD operations, search by category or title, pagination, global exception handling, and Swagger UI documentation.

-------------------------------------------------------------------------

##  Features

- 📘 Book Management (CRUD)
- 👤 Customer Management
- 🛒 Order Placement
- 🔍 Search books by category or title
- 📄 Pagination & Sorting
- ❌ Global Exception Handling
- 📑 Swagger UI documentation

---------------------------------------------------------------------------

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Swagger (OpenAPI)
- Maven
- Git

-------------------------------------------------------------

## 📂 Project Structure
>    src/
>  ├── controller/
>  ├── service/
>  ├── impl/
>  ├── repository/
>  ├── model/
>  ├── exception/
>  └── BookstoreApiApplication.java


-----------------------------------------------------------------------

## 📬 API Endpoints

| Endpoint                            | Method | Description                         |
|-------------------------------------|--------|-------------------------------------|
| `/api/books`                        | GET    | Get all books (with pagination)     |
| `/api/books?category=Fiction`       | GET    | Filter books by category            |
| `/api/books?title=Java`             | GET    | Filter books by title               |
| `/api/books/{id}`                   | GET    | Get book by ID                      |
| `/api/books`                        | POST   | Create a new book                   |
| `/api/books/{id}`                   | DELETE | Delete a book                       |
| `/api/customers`                    | GET    | Get all customers                   |
| `/api/customers`                    | POST   | Create a new customer               |
| `/api/orders`                       | GET    | Get all orders                      |
| `/api/orders`                       | POST   | Create a new order                  |

----------------------------------------------------------------------------------------------------------

# Configure MySQL and properties
# application.properties
 - spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
 - spring.datasource.username=root
 - spring.datasource.password=root1234
 - spring.jpa.hibernate.ddl-auto=update

# Run the application
   mvn spring-boot:run

# Access Swagger UI
  http://localhost:8080/swagger-ui/index.html



