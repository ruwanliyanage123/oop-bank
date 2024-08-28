CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

//write a join query to get the employee name and department name
SELECT e.name, d.name FROM employee e JOIN department d ON e.id = d.id;

//write a query for join three tables
SELECT e.name, d.name, p.name FROM employee e JOIN department d ON e.id = d.id JOIN project p ON e.id = p.id;

SELECT e.name, d.name, p.name FROM employee e JOIN department d ON e.id = d.id JOIN project p ON e.id = p.id; 



