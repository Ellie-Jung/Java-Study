package com.test;
class MyClass2{
	int a;
	static int b;
}
public class Sample06 {
	int a = 0;
	static int b= 10;
	public static void main(String[] args) {
		
		Sample06 s = new Sample06();//static 이 아니면 무조건 new
		s.a=10; //자기 자신을 쓸수 있음
		System.out.println(s.a);
		b = 20; // static 있으면 뉴로 안만들고 바로 호출 가능
		System.out.println(b);
		
		MyClass2 m=new MyClass2();
		m.a = 30;
		MyClass2.b= 200;
	}

}
