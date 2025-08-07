select E.name as Employee from Employee as K 
inner join Employee as E on 
k.Id=E.managerId 
where E.salary>K.salary; 
