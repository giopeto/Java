CREATE DATABASE IF NOT EXISTS `web_system_db`;

USE web_system_db;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `web_system_db`.`users`;
DROP TABLE IF EXISTS `web_system_db`.`places`;

CREATE TABLE `web_system_db`.`users` (
	id SERIAL,
	username VARCHAR(20) NOT NULL,
	password VARCHAR(255) NOT NULL,
	role VARCHAR(32) NOT NULL,
	email VARCHAR(50) NOT NULL,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	gender VARCHAR(32) NOT NULL,
	address VARCHAR(400) NOT NULL,
	phone VARCHAR(255) NOT NULL,
	is_blocked TINYINT(1) NOT NULL DEFAULT 0,
	picture	LONGBLOB,
	created_by VARCHAR(255) NOT NULL,
	created_on DATETIME NOT NULL,
	updated_by VARCHAR(255) NOT NULL,
	updated_on TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT pk_user PRIMARY KEY (id),
	CONSTRAINT u_user_name UNIQUE (username),
	CONSTRAINT u_user_email UNIQUE (email)
) Engine = InnoDB DEFAULT CHARSET=UTF8;
	
CREATE TABLE `web_system_db`.`places` (
	id SERIAL,
	name VARCHAR(50) NOT NULL,
	category VARCHAR(32) NOT NULL,
	description VARCHAR(4000) NOT NULL,
	location VARCHAR(400) NOT NULL,
	picture	LONGBLOB,
	ownership_doc LONGBLOB, -- or some kind of ownership ID
	-- is_available TINYINT(1) NOT NULL DEFAULT 1,
	number_available SMALLINT NOT NULL DEFAULT 0,
	owner_id BIGINT UNSIGNED NOT NULL,
	rating SMALLINT UNSIGNED NOT NULL,
	created_by VARCHAR(255) NOT NULL,
	created_on DATETIME NOT NULL,
	updated_by VARCHAR(255) NOT NULL,
	updated_on TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT pk_place PRIMARY KEY (id),
	CONSTRAINT fk_places_users FOREIGN KEY fk_places_users (owner_id)
		REFERENCES `web_system_db`.`users`(id) ON DELETE RESTRICT ON UPDATE CASCADE
) Engine = InnoDB DEFAULT CHARSET=UTF8;
    
SET FOREIGN_KEY_CHECKS = 1;
