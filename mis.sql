CREATE DATABASE IF NOT EXISTS MIS_DB;

USE MIS_DB;

DROP TABLE IF EXISTS faculty;

create table if not exists faculty(
faculty_id 	int not null auto_increment primary key,
faculty_fname varchar(100) not null,
faculty_lname varchar(100) not null,
faculty_tel varchar(100) not null,
faculty_email varchar(100) not null
);

insert into faculty(faculty_fname, faculty_lname, faculty_tel, faculty_email)
values('John','Walker','123456','123@example.com');


DROP TABLE IF EXISTS staff;

create table if not exists staff(
staff_id int not null auto_increment primary key,
staff_fname varchar(100) not null,
staff_lname varchar(100) not null,
staff_tel varchar(100) not null,
staff_email varchar(100) not null
);

insert into staff(staff_fname, staff_lname, staff_tel, staff_email)
values('Mark','Connor','143226','1443@example.com');

DROP TABLE IF EXISTS country;
create table if not exists country(
country_id int not null auto_increment primary key,
country_name varchar(100) not null
);

insert into country(country_name)
values('Canada');
insert into country(country_name)
values('United of States');

DROP TABLE IF EXISTS address;
create table if not exists address(
addr_id int not null auto_increment primary key,
addr_street varchar(100) not null,
addr_province varchar(100) not null,
addr_city varchar(100) not null,
addr_post varchar(100) not null,
country_id int not null,
constraint addr_coun_fk foreign key(country_id)
references country(country_id)
on delete cascade on update cascade
);

insert into address(addr_street, addr_province, addr_city, addr_post, country_id)
values('Dougall Ave', 'Ontario', 'Windsor', 'N9B 3Q1', 1);
insert into address(addr_street, addr_province, addr_city, addr_post, country_id)
values('Young Street', 'Ontario', 'Toronto', '7B9 3I9', 1);

DROP TABLE IF EXISTS company;
create table if not exists company(
com_id int not null auto_increment primary key,
com_name varchar(100) not null,
com_website varchar(100) not null,
com_notes varchar(100) not null,
addr_id int not null,
constraint com_addr_fk foreign key(addr_id)
references address(addr_id)
on delete cascade on update cascade
);

insert into company(com_name, com_website, com_notes, addr_id)
values('ABC', 'www.abc.com', 'abc company notes', 1);
insert into company(com_name, com_website, com_notes, addr_id)
values('123', 'www.123.com', '123 company notes', 2);

DROP TABLE IF EXISTS job_group;
create table if not exists job_group(
job_group_id int not null auto_increment primary key,
job_group_name varchar(100) not null
);

insert into job_group(job_group_name)
values('Web Development');
insert into job_group(job_group_name)
values('Mobile Development');
insert into job_group(job_group_name)
values('System Development');
insert into job_group(job_group_name)
values('Technical Support');
insert into job_group(job_group_name)
values('Networking');
insert into job_group(job_group_name)
values('Data Analysis');
insert into job_group(job_group_name)
values('Testing');
insert into job_group(job_group_name)
values('Security');

DROP TABLE IF EXISTS job;
create table if not exists job(
job_id int not null auto_increment primary key,
job_desc varchar(100) not null,
job_position varchar(100) not null,
job_resp varchar(100) not null,
job_requireed boolean not null,
job_salary varchar(100) not null,
job_status varchar(100) not null,
job_group_id int not null,
com_id int not null,
constraint job_com_fk foreign key(com_id)
references company(com_id)
on delete cascade on update cascade,
constraint job_jgroup_fk foreign key(job_group_id)
references job_group(job_group_id)
on delete cascade on update cascade
);

insert into job(job_desc,job_position,job_resp,job_requireed,job_salary,job_status,job_group_id,com_id)
values('Web developemnt position','Application Developer','Good',true,'20000', 'available',1,1);
insert into job(job_desc,job_position,job_resp,job_requireed,job_salary,job_status,job_group_id,com_id)
values('Mobile developemnt position','IOS Developer','Good',true,'24000', 'available',2,1);


DROP TABLE IF EXISTS semester;
create table if not exists semester(
semester_id int not null auto_increment primary key,
semester_name varchar(100) not null,
semester_year varchar(100) not null 
);

insert into semester(semester_name, semester_year)
values('Fall', '2016');
insert into semester(semester_name, semester_year)
values('Winter', '2016');

DROP TABLE IF EXISTS internship;
create table if not exists internship(
internship_id int not null auto_increment primary key,
internship_type varchar(100) not null 
);

insert into internship(internship_type)
values('Industy');
insert into internship(internship_type)
values('MAC Project');
insert into internship(internship_type)
values('Other');

DROP TABLE IF EXISTS university;
create table if not exists university(
university_name varchar(100) not null primary key,
country_id int not null,
constraint un_contry_fk foreign key(country_id)
references country(country_id)
on delete cascade on update cascade
);

insert into university(university_name, country_id)
values('University of Windsor', 1);
insert into university(university_name, country_id)
values('University of Toronto', 1);

DROP TABLE IF EXISTS education;
create table if not exists education(
education_id int not null auto_increment primary key,
education_degree varchar(100) not null,
education_gpa varchar(100) not null,
education_certification_title varchar(100) not null,
education_certification_body varchar(100) not null
);

insert into education(education_degree,education_gpa,education_certification_title,education_certification_body)
values('Master', '80', 'Engineering', 'Engineering Master');
insert into education(education_degree,education_gpa,education_certification_title,education_certification_body)
values('Bachelor', '82', 'Engineering', 'Engineering Bachelor');
insert into education(education_degree,education_gpa,education_certification_title,education_certification_body)
values('Master', '83', 'Education', 'Education Master');

DROP TABLE IF EXISTS univ_edu;
create table if not exists univ_edu(
univ_edu_id int not null auto_increment primary key,
education_id int not null,
university_name varchar(100) not null,
constraint ue_edu_fk foreign key(education_id)
references education(education_id)
on delete cascade on update cascade,
constraint ue_univ_fk foreign key(university_name)
references university(university_name)
on delete cascade on update cascade
);

insert into univ_edu(education_id,university_name)
values(1, 'University of Windsor');
insert into univ_edu(education_id,university_name)
values(2, 'University of Toronto');

DROP TABLE IF EXISTS student;
create table if not exists student(
stu_id int not null auto_increment primary key,
stu_fname varchar(100) not null,
stu_mname varchar(100),
stu_lname varchar(100) not null,
stu_email varchar(100) not null,
stu_tel varchar(100),
stu_gender varchar(100),
stu_status varchar(100),
stu_cur_or_pas varchar(100),
education_id int not null,
semester_id int not null,
job_id int not null,
internship_id int not null,
constraint stu_edu_fk foreign key(education_id)
references education(education_id)
on delete cascade on update cascade,
constraint stu_sem_fk foreign key(semester_id)
references semester(semester_id)
on delete cascade on update cascade,
constraint stu_job_fk foreign key(job_id)
references job(job_id)
on delete cascade on update cascade,
constraint stu_intern_fk foreign key(internship_id)
references internship(internship_id)
on delete cascade on update cascade
);

insert into student(stu_fname,stu_lname,stu_email,stu_tel,stu_gender,stu_status,stu_cur_or_pas,education_id,semester_id,job_id,internship_id)
values('Steve','Snow','snow@example.com','123321','Male','International','Current Student',1,1,1,1);

insert into student(stu_fname,stu_lname,stu_email,stu_tel,stu_gender,stu_status,stu_cur_or_pas,education_id,semester_id,job_id,internship_id)
values('Mat','Trump','trump@example.com','432121','Male','International','Current Student',1,2,1,1);