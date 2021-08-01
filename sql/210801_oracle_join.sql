-- 두개의 테이블 조인
select * from notice N 
inner join "COMMENT" C
on N.ID=C.NOTICE_ID
order by N.regdate desc;
-- 이너 조인을 할경우 코멘트가 있는 데이터 3개만 가져온다

select * from notice N 
LEFT OUTER JOIN "COMMENT" C
on N.ID=C.NOTICE_ID
order by N.regdate desc;
-- 아우터 조인시(그냥 LEFT JOIN 해도 무방)코멘트 없는데이터도 NULL로 조인해 다 가져온다.