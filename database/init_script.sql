CREATE DATABASE IF NOT EXISTS test;
USE test;

CREATE TABLE IF NOT EXISTS Category (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS SubCategory (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	category_id INT,
	PRIMARY KEY (id),
	FOREIGN KEY (category_id) REFERENCES Category(id)
);


CREATE TABLE IF NOT EXISTS BookLibrary (
	id INT NOT Null AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
	author VARCHAR(255),
	course_level INT,
	link VARCHAR(600),
	category_id INT,
	subcategory_id INT,
	PRIMARY KEY (id)
);

INSERT INTO  Category (name)
VALUES ('cat1'), ('cat2');
INSERT INTO Subcategory (name, category_id)
VALUES  ('sub1', 1), ('sub2', 2), ('sub3', 1), ('sub4', 1), ('sub5', 2);