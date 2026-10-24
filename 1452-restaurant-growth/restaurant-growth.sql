# Write your MySQL query statement below
select distinct visited_on,
round((
    select sum(amount)
    from Customer c2
    where c2.visited_on between date_sub(c1.visited_on,interval 6 day) and c1.visited_on
),2) as amount,
round((
    select sum(amount)/7
    from Customer c2
    where c2.visited_on between date_sub(c1.visited_on,interval 6 day) and c1.visited_on
),2) as average_amount
from Customer c1
where visited_on>=(
    select date_add(min(visited_on), interval 6 day)
    from Customer
)
order by visited_on asc