DROP DATABASE bookmgr;

create database bookmgr;

DROP TABLE Book;

CREATE TABLE Book(
	isbn			INT				NOT NULL 		PRIMARY KEY AUTO_INCREMENT,
	title			VARCHAR(20)		NOT NULL,
	author			VARCHAR(20)		NOT	NULL,
	publisher		VARCHAR(20)		NOT NULL,
	price			INT				NOT NULL,
	description		VARCHAR(255)		NULL,
	attachment VARCHAR(255)
);

INSERT INTO Book (title, author, publisher, price, description, attachment)
	VALUES ('1제목', '1저자', '1출판사', '50000', '1설명', NULL);
	
INSERT INTO Book (title, author, publisher, price, description, attachment)
	VALUES ('2제목', '2저자', '2출판사', '60000', '2설명', NULL);
	
INSERT INTO Book (title, author, publisher, price, description, attachment)
	VALUES ('3제목', '3저자', '3출판사', '70000', '3설명', NULL);

SELECT * FROM book;

SHOW TABLES;


