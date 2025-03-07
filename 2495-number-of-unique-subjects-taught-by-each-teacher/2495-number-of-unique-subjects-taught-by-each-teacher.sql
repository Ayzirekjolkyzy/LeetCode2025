# Write your MySQL query statement below
SELECT teacher_id,
    COUNT(distinct subject_id) cnt
    from Teacher
    Group by teacher_id;