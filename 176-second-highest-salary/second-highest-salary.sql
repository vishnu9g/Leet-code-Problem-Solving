select Max(salary) as SecondHighestSalary from Employee 
where salary<(select max(salary) from Employee);