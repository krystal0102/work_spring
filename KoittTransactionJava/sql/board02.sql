CREATE TABLE board02 (
	No INT PRIMARY KEY,
	TITLE VARCHAR(30),
	CONTENT VARCHAR(255),
	WRITER VARCHAR(30),
	REGDATE DATE
);

INSERT INTO board02 (no, title, content, writer, regdate) VALUES (1, 'TITLE-1', 'CONTENT-1', 'WRITER-1', CURDATE());

INSERT INTO board02 (no, title, content, writer, regdate) VALUES (2, 'TITLE-2', 'CONTENT-2', 'WRITER-2', CURDATE());
	
SELECT * FROM board02;

# 데이터베이스에서 최근 글의 글번호를 가져오는 SQL문 
SELECT no FROM board02 ORDER BY no DESC LIMIT 1;


