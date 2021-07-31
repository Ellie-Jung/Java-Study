--getNoticeList
SELECT * FROM NOTICE ORDER BY REGDATE DESC;
SELECT * FROM NOTICE where rownum between 1 and 5; --rownum은 셀렉트한 결과집합 만들때 만들어짐. 그래서 2이상의 어떤값으로 비교해도 값을 가져오지못한다.
select rownum, notice.* from notice; -- rownum과 노티스의 전체를 검색하는 셀렉트문. 로우넘과 같이 검색할때는 그냥 * 이아니라 꼭 notice.* 형식으로 써야함(왜냐면 로우넘은 모든것에 포함될수없기때문에..)
select *from(select rownum num ,notice.* from notice) where num between 3 and 5; -- num이라는 별칭을 주어야지 from절의 rownum결과 얻을수 있다. 안쓰면 이 셀렉트문으로 얻어지는 로우넘을의미하게됨.
select *from(select rownum num ,notice.* from notice) ORDER BY REGDATE DESC;


select rownum, notice.* from notice ORDER BY REGDATE DESC;  --정렬시에 로우넘이 뒤죽박죽 된다.
select rownum, n.* from (SELECT * FROM NOTICE ORDER BY REGDATE DESC) n; --로우넘을 순서대로 정렬하기 위해 from절이 먼저 실행되니까 거기서 먼저 정렬후 사용 (from절 테이블에 별칭줌)
select rownum, n.* from (SELECT * FROM NOTICE ORDER BY REGDATE DESC) n
where rownum between 1 and 5;
--정렬과  rownum 둘다 사용시 서브쿼리 두개 사용
select * from (select rownum num, n.* from(SELECT * FROM NOTICE ORDER BY REGDATE DESC) n)
where num between 3 and 5;


--로우넘을 뽑아내는 함수 사용할수도 있다 ( 위에꺼 이렇게도 사용가능) 
select * from (
    select ROW_NUMBER() over(order by regdate desc) num,
            notice.* from  notice
)
where num between 6 and 10;


--getNoticeCount

--getNotice

--getNextNotice
SELECT * FROM NOTICE
WHERE ID= (
    SELECT ID FROM NOTICE WHERE REGDATE > (SELECT REGDATE FROM NOTICE WHERE ID=3)
    AND ROWNUM=1
);

SELECT ID FROM NOTICE WHERE REGDATE > (SELECT REGDATE FROM NOTICE WHERE ID=3)
AND ROWNUM=1;

commit;


--getPrevNotice

SELECT * FROM NOTICE
WHERE ID= (
    SELECT ID from(select * from notice order by regdate desc) WHERE REGDATE < (SELECT REGDATE FROM NOTICE WHERE ID=3) and rownum=1
);

select * from notice order by regdate desc;
SELECT ID from(select * from notice order by regdate desc) WHERE REGDATE < (SELECT REGDATE FROM NOTICE WHERE ID=3) and rownum=1;
