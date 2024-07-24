   drop database if exists springweb;
   create database springweb;
   use springweb;

   drop tables if exists member;
   create table member(
		no bigint auto_increment ,            -- 회원번호
		id varchar(30) not null unique ,            -- 회원 아이디
		pw varchar(30) not null ,            -- 회원 비밀번호
		name varchar(20) not null ,            -- 회원 이름
		email varchar(50) ,               -- 회원 이메일
		phone varchar(13) not null unique,         -- 회원 핸드폰 번호
		constraint member_no_pk primary key(no )       -- 회원 번호 pk
   );
   
   # [1] 회원가입
   insert into member( id , pw , name , email , phone) values( 'qwe' , 'asd' , '유재석' , 'qwe@qwe' , '010-010-010' );
   
   
   select * from member;