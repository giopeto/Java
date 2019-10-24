DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS vehicles;
DROP TABLE IF EXISTS users2vehicles;

CREATE TABLE users(
    id int(10) unsigned NOT NULL auto_increment,
    name char(100) NOT NULL default '',
    PRIMARY KEY  (id)
);


CREATE TABLE vehicles(
    id int(10) unsigned NOT NULL auto_increment,
    name char(64) NOT NULL default '',
    PRIMARY KEY  (id)
);

CREATE TABLE users2vehicles(
    user_id int(10) unsigned NOT NULL,
    vehicle_id int(10) unsigned NOT NULL,
    PRIMARY KEY  (user_id, vehicle_id),
    UNIQUE KEY (user_id, vehicle_id)
);