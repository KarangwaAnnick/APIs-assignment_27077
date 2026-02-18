# RESTful API Assignment

A comprehensive Spring Boot RESTful API project implementing multiple modules for different business domains.

## 🚀 Modules

### 📚 Library Management
- **Books API**: CRUD operations for book management
- **Features**: Add, delete, retrieve, search books

### 🛒 E-commerce
- **Products API**: Product catalog management
- **Features**: Product listing, search, pagination, stock management

### 🍕 Restaurant
- **Menu API**: Restaurant menu management
- **Features**: Menu items, availability status, category filtering

### 🎓 Student Management
- **Students API**: Student information management
- **Features**: Student registration, GPA filtering, major-based queries

### ✅ Task Management
- **Tasks API**: Task tracking system
- **Features**: Task CRUD, priority filtering, status management

### 👤 User Management
- **User Profiles API**: User profile management
- **Features**: Profile CRUD, country-based filtering, age range queries

## 🛠️ Technology Stack

- **Backend**: Spring Boot 3.x
- **Database**: PostgreSQL
- **Build Tool**: Maven
- **Java Version**: 17+

## 📁 Project Structure

```
src/main/java/com/auca/restfulapi/
├── ecommerce/     # Product management
├── library/        # Book management  
├── restaurant/     # Menu management
├── student/        # Student management
├── task/          # Task management
└── user/          # User profile management
```

## 🗄️ Database Setup

1. **Create database**:
   ```bash
   ./create-db.bat
   ```

2. **Load sample data**:
   ```bash
   ./load-data.bat
   ```

3. **Test connection**:
   ```bash
   ./test-db.bat
   ```

## 🚀 Running the Application

```bash
# Using Maven
./mvnw spring-boot:run

# Or use the provided script
./run.bat
```

The application will start on `http://localhost:8080`

## 📊 API Documentation

- **Postman Collection**: `Postman_Collection.json`
- **Screenshots**: Available in `/images` directory for each module

## 🎯 Key Features

- **RESTful Design**: Follows REST principles
- **Modular Architecture**: Separate packages for each domain
- **Database Integration**: PostgreSQL with JPA/Hibernate
- **Comprehensive CRUD**: Full CRUD operations for all entities
- **Search & Filtering**: Advanced search capabilities
- **Pagination**: Efficient data pagination
- **Error Handling**: Proper API error responses

## 📸 API Testing Screenshots

Each module includes comprehensive API testing screenshots:
- **Bonus Features**: User management with advanced filtering
- **Q1**: Library management operations
- **Q2**: Student management with GPA/major filtering
- **Q3**: Restaurant menu management
- **Q4**: E-commerce product management
- **Q5**: Task management with priority/status filtering

## 👤 Author

**KarangwaAnnick** - RESTful API Assignment Implementation
