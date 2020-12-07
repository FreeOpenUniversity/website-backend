CREATE DATABASE IF NOT EXISTS test;
USE test;

CREATE TABLE IF NOT EXISTS User (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT Null,
	password VARCHAR(50) NOT Null,
	intro VARCHAR(1023),
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Category (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	book_id INT,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS BookLibrary (
	id INT NOT Null AUTO_INCREMENT,
	title VARCHAR(255),
	author VARCHAR(255),
	course_level INT,
	link VARCHAR(255),
	category_id INT,
	PRIMARY KEY (id)
);

-- CREATE TABLE IF NOT EXISTS BookCategory (
-- 	book_id INT,
-- 	category_id INT,
-- 	PRIMARY KEY (book_id)
-- 	PRIMARY KEY (category_id)
-- 	FOREIGN KEY (book_id) REFERENCES BookLibrary(id)
-- 	FOREIGN KEY (category_id) REFERENCES Category(id)
-- );

INSERT INTO  User (name, email, password, intro)
VALUES ('Tom', 'tom@gmail.com', 'password1', 'profile info1'), ('Jerry', 'jerry@gmail.com', 'password2', 'profile info2');
INSERT INTO  Category (name, book_id)
VALUES ('Math', 001), ('Science', 002);
INSERT INTO  BookLibrary (title, author, course_level, link, category_id)
VALUES ('Calculus I', 'author1', 01, 'link1', 001), ('Physics', 'author2', 02, 'link2', 002); 


-- INSERT INTO SubCategory (name, category_id)
-- VALUES  ('sub1', 1), ('sub2', 2), ('sub3', 1), ('sub4', 1), ('sub5', 2);




-- CREATE TABLE IF NOT EXISTS BookLibrary (
-- 	id INT NOT Null AUTO_INCREMENT,
-- 	title VARCHAR(255) NOT NULL,
-- 	author VARCHAR(255),
-- 	course_level INT,
-- 	link VARCHAR(600),
-- 	subcategory_id INT,
-- 	PRIMARY KEY (id),
-- 	FOREIGN KEY (subcategory_id) REFERENCES SubCategory(id)
-- );


-- CREATE TABLE IF NOT EXISTS SubCategory (
-- 	id INT NOT NULL AUTO_INCREMENT,
-- 	name VARCHAR(255) NOT NULL,
-- 	category_id INT,
-- 	PRIMARY KEY (id),
-- 	FOREIGN KEY (category_id) REFERENCES Category(id)
-- );

