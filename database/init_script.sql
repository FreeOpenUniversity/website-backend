DROP DATABASE IF EXISTS test;
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
	category_id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	PRIMARY KEY (category_id)
);

CREATE TABLE IF NOT EXISTS Book (
	book_id INT NOT Null AUTO_INCREMENT,
	title VARCHAR(255),
	author VARCHAR(255),
	course_level INT,
	link VARCHAR(255),
	PRIMARY KEY (book_id)
);

CREATE TABLE IF NOT EXISTS BookCategory (
	book_id INT NOT NULL,
	category_id INT NOT NULL,
	PRIMARY KEY (book_id, category_id),
	KEY fk_book (book_id),
	KEY fk_category (category_id),
	CONSTRAINT fk_book FOREIGN KEY (book_id) REFERENCES Book (book_id),
	CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES Category (category_id)
);

INSERT INTO User (name, email, password, intro)
VALUES ('Tom', 'tom@gmail.com', 'password1', 'profile info1'), ('Jerry', 'jerry@gmail.com', 'password2', 'profile info2');
INSERT INTO Category (name)
VALUES ('Math'), ('Science');
INSERT INTO Book (title, author, course_level, link)
VALUES ('Calculus I', 'author1', 01, 'link1'), ('Physics', 'author2', 02, 'link2');
INSERT INTO BookCategory (book_id, category_id)
VALUES (1,1),(2,2);


-- INSERT INTO SubCategory (name, category_id)
-- VALUES  ('sub1', 1), ('sub2', 2), ('sub3', 1), ('sub4', 1), ('sub5', 2);

-- CREATE TABLE IF NOT EXISTS BookCategory (
-- 	book_id INT,
-- 	category_id INT,
-- 	PRIMARY KEY (book_id)
-- 	PRIMARY KEY (category_id)
-- 	FOREIGN KEY (book_id) REFERENCES BookLibrary(id)
-- 	FOREIGN KEY (category_id) REFERENCES Category(id)
-- );


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

