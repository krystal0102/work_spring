#DROP DATABASE bookmgr;

#CREATE DATABASE bookmgr;

DROP TABLE Book;
DROP TABLE users;


CREATE TABLE users (
	no			INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	email		VARCHAR(255) NOT NULL,
	password	VARCHAR(255) NOT NULL,
	name		VARCHAR(255) NOT NULL,
	attachment	VARCHAR(255),
	UNIQUE (email)
);

CREATE TABLE Book(
	isbn			INT				NOT NULL 		PRIMARY KEY AUTO_INCREMENT,
	title			VARCHAR(20)		NOT NULL,
	author			VARCHAR(20)		NOT	NULL,
	publisher		VARCHAR(20)		NOT NULL,
	price			INT				NOT NULL,
	description		VARCHAR(255)		NULL,
	attachment 		VARCHAR(255),
	user_no			INT				NOT NULL,
	FOREIGN KEY (user_no) REFERENCES users(no)
);


INSERT INTO users (email, password, name, attachment)
	VALUES ('teachertophoon@gmail.com', '1234', '정상훈', NULL);
	
INSERT INTO users (email, password, name, attachment)
	VALUES ('gildong@gmail.com', '5678', '홍길동', NULL);
	
INSERT INTO users (email, password, name, attachment)
	VALUES ('younghee@gmail.com', '7788', '김영희', NULL);
	
	
	

INSERT INTO Book (title, author, publisher, price, description, attachment, user_no)
	VALUES ('1제목', '1저자', '1출판사', '50000', '1설명', NULL, 1);
	
INSERT INTO Book (title, author, publisher, price, description, attachment, user_no)
	VALUES ('2제목', '2저자', '2출판사', '60000', '2설명', NULL, 1);
	
INSERT INTO Book (title, author, publisher, price, description, attachment, user_no)
	VALUES ('3제목', '3저자', '3출판사', '70000', '3설명', NULL, 1);
	
	
	

SELECT * FROM book;

SELECT * FROM users;



SHOW TABLES;


