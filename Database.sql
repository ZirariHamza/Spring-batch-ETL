CREATE DATABASE walletdb
GO

USE walletdb
GO
CREATE TABLE users(
	id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	email VARCHAR(255),
	enabled bit,
	first_name VARCHAR(20),
	last_name VARCHAR(20),
	last_password_reset_date DATETIME2,
	password VARCHAR(20),
	phone_number VARCHAR(10),
	username VARCHAR(20),
	title_prefix VARCHAR(5)
	)
GO