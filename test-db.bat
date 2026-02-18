@echo off
echo Testing PostgreSQL connection...
java -cp "C:\Users\USER\.m2\repository\org\postgresql\postgresql\42.6.0\postgresql-42.6.0.jar" org.postgresql.Driver jdbc:postgresql://localhost:5432/ecommerce_db postgres 4321
pause
