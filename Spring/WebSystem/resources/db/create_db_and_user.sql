create database web_system_db;
grant usage on *.* to ws_user@localhost identified by 'ws_user_pass';
grant all privileges on web_system_db.* to ws_user@localhost;