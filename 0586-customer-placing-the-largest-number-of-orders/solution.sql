# Write your MySQL query statement below
select customer_number from orders 
group by customer_number having count(order_number)
ORDER BY COUNT(order_number) DESC
limit 1;
