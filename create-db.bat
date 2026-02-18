@echo off
set PGPASSWORD=4321
echo DROP DATABASE IF EXISTS ecommerce_db; CREATE DATABASE ecommerce_db WITH OWNER = postgres ENCODING = 'UTF8'; | "C:\Program Files\PostgreSQL\18\bin\psql.exe" -U postgres -d postgres
echo Database created!
pause
