create database quiz;
use quiz;
create table register(
user_id int not null auto_increment, 
first_name varchar(50),
last_name varchar(50),
dob date,
department varchar(50),
username varchar(100),
password varchar(100),
primary key(user_id)

);
select * from register;
create table result(
name varchar(50),
marks int

);
select * from result;