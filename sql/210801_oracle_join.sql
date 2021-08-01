-- 두개의 테이블 조인
select * from notice N 
inner join "COMMENT" C
on N.ID=C.NOTICE_ID
order by N.regdate desc;
-- 이너 조인을 할경우 코멘트가 있는 데이터 3개만 가져온다

select N.ID,N.TITLE, n.writer_id, N.REGDATE, n.hit,N.FILES, COUNT(C.ID) CMT_COUNT from notice N 
LEFT OUTER JOIN "COMMENT" C
on N.ID=C.NOTICE_ID
GROUP BY N.ID,N.TITLE, n.writer_id, N.REGDATE, n.hit,N.FILES
order by N.regdate desc;
-- 아우터 조인시(그냥 LEFT JOIN 해도 무방)코멘트 없는데이터도 NULL로 조인해 다 가져온다. 근데 자식때문에 부모가 반복된다. ( 댓글이 2개인거 반복해서 출력됨)


SELECT * FROM (SELECT ROWNUM NUM, N.* 
                FROM( SELECT * FROM NOTICE WHERE TITLE LIKE '%%' ORDER BY REGDATE DESC) N) -- 여기에 NOTICE에는 위에 조인 문이 사용되어야한다.
WHERE NUM BETWEEN 1 AND 10;                


-- 조인문을 뷰로 만들어서 사용한다-------------------
CREATE VIEW NOTICE_VIEW
AS
select N.ID,N.TITLE, n.writer_id, N.REGDATE, n.hit,N.FILES, COUNT(C.ID) CMT_COUNT from notice N 
LEFT OUTER JOIN "COMMENT" C
on N.ID=C.NOTICE_ID
GROUP BY N.ID,N.TITLE, n.writer_id, N.REGDATE, n.hit,N.FILES;
--order by N.regdate desc; 이건 빼는게 좋다
                
SELECT * FROM (SELECT ROWNUM NUM, N.* 
                FROM( SELECT * FROM NOTICE_VIEW WHERE TITLE LIKE '%%' ORDER BY REGDATE DESC) N) -- 뷰로 만들어서 사용함
WHERE NUM BETWEEN 1 AND 10; 
                