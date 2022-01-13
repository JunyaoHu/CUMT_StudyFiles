show variables like'character_set_%';
set character_set_server=utf8mb4;

create database exp;
use exp;

create table 教师 
 (教师号  char(8) primary key,
  教师名  char(8) not null,
  学院代码  char(10)) default char set ='utf8mb4';

create table 课程
( 课程号 char(8)  primary key,
  课程名 char(20) not null,
  学时   int) default char set ='utf8mb4';
  
  create table 学生
  ( 学号 char(8) primary key,
    姓名 char(10) not null,
    性别 char(4) not null,
    学院代码 char(10)) default char set ='utf8mb4';

create table 授课
( 教师号 char(8) references 教师(教师号),
  课程号 char(8) references 课程(课程号),
  primary key (教师号, 课程号)) default char set ='utf8mb4';
  
  
create table 学院
( 学院代码 char(10) primary key,
  学院名称 char(30) not null) default char set ='utf8mb4';
  

create table 学习
( 学号  char(8) references 学生(学号),
  课程号 char(8) references 课程(课程号),
  教师号 char(8) references 教师(教师号),
  成绩 int ,
  primary key  (学号,课程号,教师号)) default char set ='utf8mb4';

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

-- 学院（学院代码，学院名称） 
-- 学生（学号，姓名，性别，学院代码） 
-- 教师（教师号，教师名，学院代码）
-- 课程（课程号，课程名，学时）
-- 学习（学号，课程号，教师号，成绩）
-- 开课（教师号，课程号）

-- 1．求选修了老师“王刚”开课课程且成绩在90分以上的学生姓名、课程名称和成绩；（姓名，课程名，成绩）
SELECT 姓名, 课程名, 成绩
FROM 学生, 教师, 学习, 课程
WHERE 学生.学号 = 学习.学号
	AND 教师.教师号 = 学习.教师号
    AND 课程.课程号 = 学习.课程号
    AND 学习.成绩 > 90
    AND 教师.教师名 = '王刚';

-- 2．求选修了“王刚”老师所授全部课程的学生姓名和学院名称；（姓名，学院名称）
SELECT 姓名, 学院名称
FROM 学生, 学院
WHERE 学生.学院代码 = 学院.学院代码
      AND 学生.学号 IN (
		SELECT DISTINCT 学号
		FROM 学习
		WHERE NOT EXISTS (
			SELECT *
			FROM 教师, 授课
			WHERE 教师.教师号 = 授课.教师号
				AND 教师.教师名="王刚"
				AND NOT EXISTS (
					SELECT *
					FROM 学习 AS A
					WHERE A.学号 = 学习.学号
						AND A.课程号 = 授课.课程号)));
        
-- 3．求没有选修课程“软件工程”的学生学号和姓名；（学生学号，姓名）
SELECT 学号, 姓名
FROM 学生
WHERE 学号 NOT IN (
	SELECT 学号
	FROM 学习,课程
	WHERE 学习.课程号 = 课程.课程号
		AND 课程名 = "软件工程");

-- 4．求至少选修了两门课程的学生学号；（学号）
SELECT 学号
FROM 学习
GROUP BY 学号
HAVING COUNT(课程号) >= 2;

-- 5．求课程“经济学”不及格学生姓名和考试成绩；（姓名，成绩）
SELECT 姓名, 成绩
FROM 学生, 学习, 课程
WHERE 学生.学号 = 学习.学号
	AND 课程.课程号 = 学习.课程号
    AND 课程名 = '经济学'
    AND 成绩 < 59;

-- 6．求至少选修了与学号“T06” 同学选修的课程相同的学生学号；（学号）
SELECT DISTINCT 学号
FROM 学习
WHERE NOT EXISTS (
	SELECT *
	FROM 学习 AS A
	WHERE A.学号 = 'T06'
		AND NOT EXISTS (
			SELECT *
			FROM 学习 AS B
			WHERE 学习.学号 = B.学号
				AND A.课程号 = B.课程号));

-- 7．求至少选修了“C3，C4”两门课程的学生姓名和学院名称；（姓名，学院名称）
SELECT 姓名, 学院名称
FROM 学习, 学生, 学院
WHERE 学习.学号 = 学生.学号
	AND 学院.学院代码 = 学生.学院代码
	AND 课程号 = 'C3'
	AND 学习.学号 IN (
		SELECT 学号
		FROM 学习
		WHERE 课程号 = 'C4' );

-- 8．查询“王石”同学没有选修的课程号和课程名；（课程号，课程名）
SELECT 课程号, 课程名
FROM 课程
WHERE 课程号 NOT IN (
	SELECT A.课程号
	FROM 课程 AS A, 学习, 学生
	WHERE A.课程号 = 学习.课程号
		AND 学习.学号 = 学生.学号
		AND 姓名 = "王石" );

-- 9．查询没有被任何学生选修的课程的课程号；（课程号）
SELECT 课程号
FROM 课程
WHERE NOT EXISTS (
	SELECT 课程号
    FROM 学习
    WHERE 课程.课程号 = 学习.课程号);

-- 10．求选修了全部课程的学生姓名；（姓名）
SELECT 姓名
FROM 学生
WHERE EXISTS (
	SELECT * 
    FROM 学习
    GROUP BY 学习.学号
    HAVING COUNT(学习.课程号) = (
		SELECT COUNT(课程号)
        FROM 课程));

-- 11．查询各学院课程“经济学”的平均分，并按照成绩从高到低的顺序排列；（学院名称，平均分）
SELECT 学院名称, AVG(成绩) AS 平均分
FROM 学习, 学生, 学院, 课程
WHERE 学习.学号 = 学生.学号
      AND 学生.学院代码 = 学院.学院代码
      AND 学习.课程号=课程.课程号
      AND 课程名 = '经济学'
GROUP BY 学院.学院代码
ORDER BY AVG(成绩) DESC;

-- 12．查询选修课程“经济学”的学生姓名和所在院系，
-- 结果按各院系排列，同时成绩从高到低排列；（姓名，学院名称，成绩）
SELECT 姓名, 学院名称, 成绩
FROM 学生, 学院, 课程, 学习
WHERE 学生.学院代码 = 学院.学院代码
	AND 学生.学号 = 学习.学号
    AND 学习.课程号 = 课程.课程号
    AND 课程名 = '经济学'
ORDER BY 学院.学院代码 ASC, 成绩 DESC;

-- 13．求学时在30-45之间（含30和45）的课程的课程号和课程名称及授课教师；（课程号，课程名，教师姓名）
SELECT 课程.课程号, 课程名, 教师名
FROM 课程, 授课, 教师
WHERE 课程.课程号 = 授课.课程号
	AND 授课.教师号 = 教师.教师号
    AND 学时 BETWEEN 30 AND 45;

-- 14．检索选修课程“经济学”的最高分学生的姓名；（姓名）
SELECT 姓名
FROM 学习, 课程, 学生
WHERE 学习.学号 = 学生.学号
	AND 学习.课程号 = 课程.课程号
    AND 课程.课程名 = '经济学'
ORDER BY 成绩 DESC 
LIMIT 1;

-- 15．查询选课人数超过5人的课程的课程号及课程名；（课程号，课程名）
SELECT 课程.课程号, 课程.课程名
FROM 学习, 课程
WHERE 学习.课程号=课程.课程号
GROUP BY 课程名
HAVING COUNT(学号)>5;









