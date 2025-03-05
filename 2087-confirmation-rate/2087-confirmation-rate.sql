# Write your MySQL query statement below
SELECT a.user_id, Round(ifnull(Sum(b.action='confirmed')/count(*),0),2) AS confirmation_rate FROM Signups a
Left Join  Confirmations b
ON a.user_id=b.user_id
 group by user_id;