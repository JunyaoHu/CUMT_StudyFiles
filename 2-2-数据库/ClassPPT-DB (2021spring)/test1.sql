use test;
create table A
( Ano char(8) primary key,
  Aname char(50),
  Atel  char(20),
  Mname char(20));
create table P
(Pid char(8) primary key,
 Pname char(20),
 Psex  char(4),
 Ptel  char(20),
 Padd  char(50),
 Pbir  date);
 create table T
 (Tid char(8) primary key,
  Ano char(8) ,
  Tname char(50),
  Tdays int,
  Tfee float);
  create table PT
  (Pid char(8),
   Tid char(8),
   depature date,
   primary key (Pid,Tid));
      
   ALTER DATABASE test CHARACTER SET utf8 COLLATE  utf8_general_ci;
   
   insert into T values('t01','A01','樱花之旅',3,500);
   insert into T values('t02','A01','洛阳牡丹盛宴',3,500);
   insert into T values('t03','A02','北京1日游',1,500);
   insert into T values('t04','A02','南京1日游',1,400);
   
   insert into P (Pid, Pname,Ptel) values('p01','李明','13003200141');
   insert into P (Pid, Pname,Ptel) values('p02','王梅','13003200142');
   insert into P (Pid, Pname,Ptel) values('p03','李军','13003200143');
   insert into P (Pid, Pname,Ptel) values('p04','李雷','13003200144');
   
   insert into A (Ano,Aname) values('a01','青年旅行社');
   insert into A (Ano,Aname) values('a02','中国国际旅行社');
   
   insert into PT values ('p01','t01','2021-4-25');
   insert into PT values ('p01','t02','2020-4-20');
   insert into PT values ('p02','t01','2021-4-25');
   insert into PT values ('p03','t03','2020-1-1');
   insert into PT values ('p03','t04','2020-5-1');
   insert into PT values ('p04','t04','2020-5-1');
   
   select * from  PT;
   delete from A where Ano='a03';
   
   select Pname,Ptel
   from P,PT,T
   where T.Tid=PT.Tid
   and   P.Pid=PT.Pid
   and   Tname = '樱花之旅';
   
   select Pid,Pname 
   from P
   where not exists
     (select * from T,A
      where T.Ano = A.Ano
      and   Aname = '青年旅行社'
      and not exists
        (select * from PT
         where PT.Tid = T.Tid
         and   PT.Pid= P.Pid));
	
    select Pid,Pname,Ptel
    from P where Pid in
       (select PT1.Pid 
        from PT as PT1, PT as PT2
        where PT1.Pid=PT2.Pid
        and  PT1. Tid <>PT2.Tid);
        
	
        
	select sum(Tfee)
    from  PT,T
    where  year(depature) = 2020
    and  PT.Tid=T.Tid
    and   T.Tid in
      (select Tid from T , A
       where T.Ano=A.Ano
       and Aname ='中国国际旅行社'); # SQL(1)
       
	select Aname, Tname, Mname,Atel
    from A,T,P,PT
    where A.Ano= T.Ano
    and P.Pid= PT.Pid
    and PT.Tid=T.Tid
    and Pname ='李明'; # SQL(2)
    
    
   select Pname from P as P1
   where not exists
    (select  * from P as P2,PT as PT1
    where P2.Pid= PT1.Pid
    and  Pname = '李明'
    and not exists 
      (select * from PT as PT2
       where PT2.Tid = PT1.Tid
       and PT2.Pid= P1.Pid)); # SQL(3)
	
    select Tname from T
    where Tid in
     (select Tid from PT,P
      where PT.Pid= P.Pid
      and Pname ='李明'); # SQL(4)
	
   select Tid,Tname,Tfee
   from T as T1
   where T1.Tid =
      ( select  PT.Tid
        from  PT,T as T2 
        where PT.Tid= T2.Tid
        and T2.Ano = T1.Ano
        group by PT.Tid
        order by count(PT.Pid) desc 
        limit 1
        ); 
    
    

	
      
   
