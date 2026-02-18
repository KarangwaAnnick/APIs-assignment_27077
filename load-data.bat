@echo off
set PGPASSWORD=4321
"C:\Program Files\PostgreSQL\18\bin\psql.exe" -U postgres -d ecommerce_db -f sample-data.sql
echo Sample data loaded!
pause
