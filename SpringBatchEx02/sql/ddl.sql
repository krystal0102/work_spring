DROP TABLE IF EXISTS report;

CREATE TABLE report (
	refId 	INT,
	name 	VARCHAR(10),
	age		INT,
	dob		Date,
	income	DECIMAL(9,2)
);

SELECT * FROM report;