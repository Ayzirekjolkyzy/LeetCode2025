# Write your MySQL query statement below
select b.contest_id, round(count(distinct b.user_id)*100/(select count(distinct user_id) from Users),2) as percentage 
from  Register b
group by b.contest_id
order by percentage desc, contest_id  ;