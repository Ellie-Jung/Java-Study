CREATE TABLE NOTICE
(
     ID		NUMBER,
     TITLE 		NVARCHAR2(100),
     WRITER_ID	NVARCHAR2(50),
     CONTENT	CLOB,
     REGDATE  	TIMESTAMP,
     HIT		NUMBER,
     FILES		NVARCHAR2(1000)
);

CREATE TABLE "COMMENT"
(
     ID		NUMBER,
     CONTENT	NVARCHAR2(2000),
     REGDATE  	TIMESTAMP,
     WRITER_ID	NVARCHAR2(50),
     NOTICE_ID	NUMBER
);

CREATE TABLE ROLE
(
     ID		VARCHAR2(50),
     DISCRIPTION 	NVARCHAR2(500)
);

CREATE TABLE MEMBER_ROLE
(
     MEMBER_ID	NVARCHAR2(50),
     ROLE_ID		VARCHAR2(50)
);

create table member1(
    ID NVARCHAR2(50),
    PWD NVARCHAR2(50),
    NAME NVARCHAR2(50),
    GENDER NCHAR(2),
    BIRTHDAY CHAR(10),
    PHONE CHAR(13),
    REGDATE DATE,
    EMAIL VARCHAR2(200)
      );
drop table member1;

insert into notice values(1, 'JDBC란 무엇인가?', 'okay', 'aaa', sysdate, 1, '');
insert into notice values(2, 'JDBC 드라이버 다운로드 방법', 'newlec', 'aaa', sysdate, 10, '');
insert into notice values(3, '전화주시기 바랍니다.', 'newlec', '연락처 남깁니다. 010-2222-2333', sysdate, 22, '');
insert into notice values(4, 'Service 계층 추가하기', 'dragon', 'aaa', sysdate, 1, '');
insert into notice values(5, 'JSP에서 JDBC 사용하기', 'newlec', 'soso', sysdate, 33, '');
insert into notice values(6, '파라미터를 가지는 문장 실행하기', 'okay', 'aaa', sysdate, 1, '');
insert into notice values(7, '선반_접시_그릇 이 세가지요~~', 'dragon', 'aaa', sysdate, 44, '');
insert into notice values(8, '하이' , 'bye', '', sysdate, 35, '');
insert into notice values(9, '졸리다' , 'bye', '', sysdate, 215, '');
insert into notice values(10, '하아앙' , 'bye', '', sysdate, 15, '');
insert into notice values(11, '자야지' , 'bye', '', sysdate, 5, '');
insert into notice values(12, '제목12' , 'bye', '', sysdate, 5, '');
insert into notice values(13, '제목13' , 'bye', '', sysdate, 5, '');
insert into notice values(14, '제목14' , 'bye', '', sysdate, 5, '');
insert into notice values(15, '제목15' , 'bye', '', sysdate, 5, '');
insert into notice values(16, '제목16' , 'bye', '', sysdate, 5, '');
insert into notice values(17, '제목17' , 'bye', '', sysdate, 5, '');
insert into notice values(19, '제목19' , 'bye', '', sysdate, 5, '');
insert into notice values(20, '제목20' , 'bye', '', sysdate, 5, '');
insert into notice values(21, '제목21' , 'bye', '', sysdate, 5, '');
insert into notice values(22, '제목22' , 'bye', '', sysdate, 5, '');


select * from notice;
delete from notice where id=11;
DROP TABLE NOTICE;
commit;