# Write your MySQL query statement below
Select a.name as Employee
from Employee a join Employee b
on a.managerId=b.id and a.salary>b.salary; 