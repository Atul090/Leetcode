# Write your MySQL query statement below
WITH CTE1 AS (
    SELECT name AS results 
    FROM MovieRating m 
    LEFT JOIN Users u ON m.user_id = u.user_id 
    GROUP BY m.user_id 
    ORDER BY COUNT(movie_id) DESC, name 
    LIMIT 1)
,
CTE2 AS (
    SELECT title AS results 
    FROM MovieRating m1 
    LEFT JOIN Movies m2 ON m1.movie_id = m2.movie_id 
    WHERE date_format(created_at,'%Y-%m')='2020-02' 
    GROUP BY m1.movie_id 
    ORDER BY AVG(rating) DESC, title 
    LIMIT 1
)

SELECT * FROM CTE1 UNION ALL SELECT * FROM CTE2;
# with cte as (select mr.*,u.name,m.title
# from MovieRating as mr
# left join users as u on mr.user_id=u.user_id
# left join movies as m on mr.movie_id=m.movie_id)

# (select name as results 
# from cte
# group by name 
# order by count(*) desc, name asc
# limit 1)
# union all
# (select title
# from cte
# where date_format(created_at, '%Y-%m')='2020-02'
# group by title
# order by avg(rating) desc, title
# limit 1)