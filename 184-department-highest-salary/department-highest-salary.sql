# Write your MySQL query statement below
Select Department,Employee,Salary from
(
    Select d.name as Department,e.name as Employee,e.salary as Salary,
    dense_rank() over(partition by d.name order by e.salary desc) as ranks
    from Employee e
    join Department d
    on e.DepartmentId=d.id
) as t
where ranks<=1;
