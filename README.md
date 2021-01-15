# Achieve3000
List of Exercises
1.Select employees who have any degree in "BA";
Select * from employees where <ColumnName> like 'BA';
Select * from employees where <ColumnName> ='BA';

2.Display how many orders were processed by each employee.Display Employees Last Name, First name and amount of orders.

Select lastName,firstName
From employees right outer join orders on employees.employeeID=orders.employeeID;

3,Display how many orders were made by each Shipper. Display Shipper's name and "Amount of processed orders"

Select Shipper'sName
From Shipper's left outer join orders on Shipper's.shipperID=order.shipperID;
