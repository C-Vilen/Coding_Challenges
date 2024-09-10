/*
1068. Product Sales Analysis I
Write a solution to report the product_name, year, and price for each sale_id in the Sales table.
Return the resulting table in any order.
*/
SELECT p.product_name, s.year, s.price
FROM Sales s
JOIN Product p ON s.product_id = p.product_id