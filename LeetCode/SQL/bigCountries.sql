/*
595. Big Countries
Write a solution to find the name, population, and area of the big countries.
Return the result table in any order.
*/
SELECT w.name, w.population, w.area
FROM World w
WHERE w.area >= 3000000 OR w.population >= 25000000;