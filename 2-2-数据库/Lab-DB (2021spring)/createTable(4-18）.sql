
show variables like'character_set_%';
set character_set_server=utf8;
set character_set_database=utf8;

create database exp;
use exp;

create table 教师 
 (教师号  char(8) primary key,
  教师名  char(8) not null,
  学院代码  char(10)) default char set ='utf8';

create table 课程
( 课程号 char(8)  primary key,
  课程名 char(20) not null,
  学时   int) default char set ='utf8';
  
  create table 学生
  ( 学号 char(8) primary key,
    姓名 char(10) not null,
    性别 char(4) not null,
    学院代码 char(10)) default char set ='utf8';

create table 授课
( 教师号 char(8) references 教师(教师号),
  课程号 char(8) references 课程(课程号),
  primary key (教师号, 课程号)) default char set ='utf8';
  
  
create table 学院
( 学院代码 char(10) primary key,
  学院名称 char(30) not null) default char set ='utf8';
  

create table 学习
( 学号  char(8) references 学生(学号),
  课程号 char(8) references 课程(课程号),
  教师号 char(8) references 教师(教师号),
  成绩 int ,
  primary key  (学号,课程号,教师号)) default char set ='utf8';

insert into 教师 values('1','李梦','100');
insert into 教师 values('2','张亮','101');
insert into 教师 values('3','王刚','102');
insert into 教师 values('4','赵广','103');
insert into 教师 values('5','孙露','104');

insert into 课程 values('C1','数据库','40');
insert into 课程 values('C2','软件工程','32');
insert into 课程 values('C3','经济学','32');
insert into 课程 values('C4','古代汉语','64');
insert into 课程 values('C5','信号与系统','72');
insert into 课程 values('C6','材料力学','56');
insert into 课程 values('C7','通信原理','72');


insert into 学生 values('T01','王娜','女','100');
insert into 学生 values('T02','李倩','女','100');
insert into 学生 values('T03','张皓','男','100');
insert into 学生 values('T04','李静','女','101');
insert into 学生 values('T05','周小米','女','101');
insert into 学生 values('T06','王石','男','102');
insert into 学生 values('T07','谢楠','女','102');
insert into 学生 values('T08','蒋明','男','102');
insert into 学生 values('T09','陈冲','男','102');
insert into 学生 values('T10','赵琳','女','102');
insert into 学生 values('T11','韩寒','女','103');
insert into 学生 values('T12','吴亮','男','103');
insert into 学生 values('T13','刘波','男','103');
insert into 学生 values('T14','张斌','男','104');
insert into 学生 values('T15','周通','男','104');
insert into 学生 values('T16','张航','男','100');

insert into 学习 values('T01','C1','1',88);
insert into 学习 values('T01','C3','3',54);
insert into 学习 values('T01','C4','3',69);
insert into 学习 values('T01','C5','3',85);
insert into 学习 values('T02','C3','3',74);
insert into 学习 values('T02','C4','3',63);
insert into 学习 values('T02','C5','3',66);
insert into 学习 values('T02','C6','4',77);
insert into 学习 values('T03','C1','1',95);
insert into 学习 values('T03','C2','2',92);
insert into 学习 values('T03','C3','3',92);
insert into 学习 values('T03','C4','3',91);
insert into 学习 values('T03','C5','3',87);
insert into 学习 values('T04','C1','1',83);
insert into 学习 values('T04','C3','3',64);
insert into 学习 values('T04','C5','3',62);
insert into 学习 values('T05','C3','3',83);
insert into 学习 values('T05','C4','3',78);
insert into 学习 values('T05','C6','4',78);
insert into 学习 values('T06','C3','3',66);
insert into 学习 values('T06','C5','5',33);
insert into 学习 values('T07','C3','3',69);
insert into 学习 values('T07','C4','3',56);
insert into 学习 values('T08','C3','3',64);
insert into 学习 values('T08','C5','5',65);
insert into 学习 values('T09','C2','2',64);
insert into 学习 values('T09','C3','3',45);
insert into 学习 values('T10','C3','3',46);
insert into 学习 values('T10','C4','3',56);
insert into 学习 values('T11','C3','3',75);
insert into 学习 values('T12','C3','3',86);
insert into 学习 values('T13','C3','3',67);
insert into 学习 values('T14','C3','3',65);
insert into 学习 values('T15','C3','3',68);
insert into 学习 values('T15','C5','3',56);
insert into 学习 values('T16','C1','1',91);
insert into 学习 values('T16','C2','2',89);
insert into 学习 values('T16','C3','3',94);
insert into 学习 values('T16','C4','3',76);
insert into 学习 values('T16','C5','5',81);
insert into 学习 values('T16','C6','4',82);


insert into 学院 values('100','计算机');
insert into 学院 values('101','机电');
insert into 学院 values('102','管理');
insert into 学院 values('103','材料');
insert into 学院 values('104','文法');

insert into 授课 values('1','C1');
insert into 授课 values('2','C2');
insert into 授课 values('3','C3');
insert into 授课 values('3','C4');
insert into 授课 values('3','C5');
insert into 授课 values('4','C6');
insert into 授课 values('5','C5');
insert into 授课 values('5','C6');
insert into 授课 values('5','C7');













