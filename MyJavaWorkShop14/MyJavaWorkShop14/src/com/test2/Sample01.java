package com.test2;
//형변환 //정수형  변환
public class Sample01 {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE; //정수형 / 가장큰값을 얘기한다.
		long b = a; //작은타입이 큰타입으로 
		long c = Long.MAX_VALUE; 
		int d = (int)c; //큰타입이 작은타입으로 생략불가
 		System.out.println(b+ ","+ d);

	}

}
