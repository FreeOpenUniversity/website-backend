CREATE TABLE IF NOT EXISTS User (
    id INT NOT Null AUTO_INCREMENT,
	firstname VARCHAR(255) NOT NULL,
	lastname VARCHAR(255),
	zipcode INT,
	address1 VARCHAR(255),
	address2 VARCHAR(255),
	cellphone VARCHAR(255),
	email VARCHAR(255),
	photo VARCHAR(1024),
	password VARCHAR(255),
	intro VARCHAR(1024),
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS UserHistory(
    id INT NOT Null AUTO_INCREMENT,
    userId INT,
    FOREIGN KEY (userId) REFERENCES User(id),
    history VARCHAR(512),
	PRIMARY KEY (id)
);