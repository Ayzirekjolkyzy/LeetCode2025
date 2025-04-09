# Write your MySQL query statement below
Select a.project_id, round(avg(b.experience_years),2) as average_years from Project a
join Employee b On a.employee_id=b.employee_id 
group by project_id;