# Write your MySQL query statement below
select id,movie,description,rating 
from cinema
where (id%2!=0) And Description != "boring" 
Order by rating Desc;