----2021.06.16 
-- JOIN & SUBQUERY 복습 
--
--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--
--(5) 박지성이구매한도서의출판사수

select count(publisher)
from book join orders
using(bookid)
where custid in( select custid from customer where name = '박지성');


--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이

select bookname, price, price-saleprice
from book join orders
using (bookid)
where custid =(select custid from customer where name = '박지성');

--(7) 박지성이구매하지않은도서의이름

select distinct bookname
from book b left outer join orders o
on b.bookid = o.bookid
where custid not in (select custid from customer where name = '박지성') or custid is null;

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--
--(8) 주문하지않은고객의이름(부속질의사용)

select name
from customer c left outer join orders o
on c.custid = o.custid
where c.custid not in (select distinct custid from orders);

--(9) 주문금액의총액과주문의평균금액

select sum(saleprice) ,avg(saleprice)
from orders;

--(10) 고객의이름과고객별구매액

select name, sum(saleprice)
from customer join orders
using (custid)
group by name;

--(11) 고객의이름과고객이구매한도서목록

select name, bookname
from customer c  join orders o
on c.custid=o.custid
join  book b
on b.bookid = o.bookid
;

--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문

select * --orderid, max(price-saleprice)
from orders natural join book
where (price-saleprice)= (select max(price-saleprice)from book natural join orders)
;

--(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
--도서의 판매 평균액
select avg(saleprice) from orders;

select name
from orders join customer
on orders.custid= customer.custid
group by name
having avg(saleprice) >(select avg(saleprice) from orders)

;


select name, avg(saleprice)
from orders natural join customer
group by name;


--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--
--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
--박지성이 구매한 도서의 출판사
select distinct publisher 
from book natural join orders 
where custid =(select custid from customer where name ='박지성');

select name
from book natural join orders natural join customer
where publisher in( select distinct publisher 
                    from book natural join orders 
                    where custid =(select custid 
                                   from customer 
                                   where name ='박지성'))and name !='박지성';



--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

--모든 고객이 구매한 출판사

select name
from book natural join customer natural join orders
group by name
having count(distinct publisher)>=2;

