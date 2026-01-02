# Write your MySQL query statement below
#select name as Employee
#from Employee e
#where salary>(select salary from employee where id=e.managerid); 
select e1.name as employee from employee e1 join employee e2 on e1.managerId=e2.id where e1.salary>e2.salary;
