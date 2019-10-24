DROP TABLE IF EXISTS martian;
DROP TABLE IF EXISTS base;

CREATE TABLE base(
    id int(10) unsigned NOT NULL auto_increment,
    base_name char(100) NOT NULL default '',
    founded TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY  (id)
);


CREATE TABLE martian(
    id int(10) unsigned NOT NULL auto_increment,
    first_name char(64) NOT NULL default '',
    last_name char(64) NOT NULL default '',
    base_id int unsigned default null,
    super_id int unsigned default null,
    PRIMARY KEY  (id),
    CONSTRAINT ref_martian2base FOREIGN KEY (base_id) REFERENCES base (id) ON DELETE RESTRICT,
    CONSTRAINT ref_martian2martian FOREIGN KEY (super_id) REFERENCES martian (id) ON DELETE RESTRICT

);