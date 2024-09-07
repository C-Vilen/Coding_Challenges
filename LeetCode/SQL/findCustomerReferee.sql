/*
584. Find Customer Referee
Find the names of the customer that are not referred by the customer with id = 2.
Return the result table in any order.
*/
SELECT c.NAME
FROM Customer c
WHERE referee_id <> 2 OR referee_id IS NULL;