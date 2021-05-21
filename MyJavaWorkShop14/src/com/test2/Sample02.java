package com.test2;
//증감연산자 //이항연산자 삼항연산자
public class Sample02 {

	public static void main(String[] args) {
		int a = 0;
		int c = a++;
		
		int b = a;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		a++;
		System.out.println(a);
		System.out.println(b);
		
		int d= 0;
		int e= ++d + d++;
		System.out.println(d);
		System.out.println(e);
		
		int f = 0;
		int g = f--;
		System.out.println(f);
		System.out.println(g);
		
		int a1 = 10;
		int b1 =20;
		if((a1>b1)&& (b1>10)) { //true 이면 안에 문장 수행 //and연산자 둘다 해당해야 참이된다
		 System.out.println("a1은 20보다 크고 b1은 10보다 큽니다.");
		}else {
			System.out.println("a1은 20보다 크고 b1은 10보다 크지않습니다.");
		}
		//|| 이거는 or 연산자. 둘중 하나가 트루면 실행
		if((a1>20)|| (b1>20)) {
			System.out.println("a1이 20보다 크거나 b1이 10보다 크다.(하나라도 일치시 처리)");
		}
		
		int c1 = (a1==b1)? 100: 200; //삼항연산자. ?앞의 조건이 참이면 100, 거짓이면 200 실행된다.
		System.out.println(c1);
		
		int sum = 0; 
		for (int inx =0; inx <10; inx++) {
			sum += inx ; //대입연산자 sum = sum+ inx 
		}
		System.out.println(sum);
	}

}
