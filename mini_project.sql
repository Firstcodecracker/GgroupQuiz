use Mini_Project;





create database project;

create table QandA( question varchar(255));
insert into  QandA values('Number of primitive datatype in java ?'),
('What is the size of float and double in java ?'),
('Automatic type conversion is possible in which of the possible cases ?'),
('Which statement is true about Java ?'),
('Which component is used to compile, debug and execute the java programs ?'),
(' Which of these cannot be used for a variable name in Java ?'),
('What is the extension of java code files ?'),
(' Which of the following is not an OOPS concept in Java ?'),
(' Which exception is thrown when java is out of memory ?'),
('Which of these are selection statements in Java ?');

select * from QandA;


create table StudentInfo(id int primary key, name varchar(255), marks int,grade varchar(255));

insert into StudentInfo values(101, 'Ram', 9 ,'A');

select * from StudentInfo;
delete from QandA;