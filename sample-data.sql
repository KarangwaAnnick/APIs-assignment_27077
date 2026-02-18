-- Products
INSERT INTO product (name, description, price, category, stock_quantity, brand) VALUES
('Laptop Pro', 'High-performance laptop', 1299.99, 'Electronics', 15, 'TechBrand'),
('Wireless Mouse', 'Ergonomic wireless mouse', 29.99, 'Electronics', 50, 'TechBrand'),
('Office Chair', 'Comfortable office chair', 199.99, 'Furniture', 20, 'ComfortPlus'),
('Desk Lamp', 'LED desk lamp', 39.99, 'Furniture', 30, 'BrightLight'),
('Notebook Set', 'Pack of 5 notebooks', 12.99, 'Stationery', 100, 'PaperCo');

-- Books
INSERT INTO books (title, author, isbn, publication_year) VALUES
('Clean Code', 'Robert C. Martin', '978-0132350884', 2008),
('Design Patterns', 'Gang of Four', '978-0201633610', 1994),
('The Pragmatic Programmer', 'Andrew Hunt', '978-0135957059', 2019),
('Refactoring', 'Martin Fowler', '978-0134757599', 2018),
('Head First Java', 'Kathy Sierra', '978-0596009205', 2005);

-- Students
INSERT INTO students (first_name, last_name, email, major, gpa) VALUES
('John', 'Doe', 'john.doe@university.edu', 'Computer Science', 3.8),
('Jane', 'Smith', 'jane.smith@university.edu', 'Engineering', 3.9),
('Mike', 'Johnson', 'mike.j@university.edu', 'Computer Science', 3.5),
('Sarah', 'Williams', 'sarah.w@university.edu', 'Mathematics', 3.7),
('Tom', 'Brown', 'tom.brown@university.edu', 'Engineering', 3.6);

-- Menu Items
INSERT INTO menu_items (name, description, price, category, available) VALUES
('Margherita Pizza', 'Classic tomato and mozzarella', 12.99, 'Main Course', true),
('Caesar Salad', 'Fresh romaine with caesar dressing', 8.99, 'Appetizer', true),
('Chocolate Cake', 'Rich chocolate dessert', 6.99, 'Dessert', true),
('Grilled Salmon', 'Fresh Atlantic salmon', 18.99, 'Main Course', true),
('Iced Coffee', 'Cold brew coffee', 4.99, 'Beverage', false);

-- Tasks
INSERT INTO tasks (title, description, completed, priority, due_date) VALUES
('Complete Project', 'Finish the REST API project', false, 'High', '2026-03-01'),
('Study for Exam', 'Prepare for final exam', false, 'High', '2026-02-25'),
('Buy Groceries', 'Weekly shopping', false, 'Low', '2026-02-20'),
('Team Meeting', 'Discuss project progress', true, 'Medium', '2026-02-15'),
('Code Review', 'Review pull requests', false, 'Medium', '2026-02-22');

-- User Profiles
INSERT INTO user_profiles (username, email, full_name, age, country, bio, active) VALUES
('johndoe', 'john@example.com', 'John Doe', 25, 'USA', 'Software developer passionate about coding', true),
('janesmith', 'jane@example.com', 'Jane Smith', 28, 'Canada', 'Tech enthusiast and blogger', true),
('mikej', 'mike@example.com', 'Mike Johnson', 30, 'UK', 'Full-stack developer', false),
('sarahw', 'sarah@example.com', 'Sarah Williams', 22, 'USA', 'Computer science student', true),
('tomb', 'tom@example.com', 'Tom Brown', 35, 'Australia', 'Senior engineer', true);
