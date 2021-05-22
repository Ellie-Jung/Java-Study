package com.test2;
class A{
	public int a;
	public static int b;
}
public class Sample07 {

	public static void main(String[] args) {
		A obj= new A();
		obj.b = 20; //참조변수 통해서 접근하기 //스테틱 변수는 클래스 통해서 접근할수 있고 참조변수 통해서 접근할수도 있다. 두가지 다 가능
		A.b = 10; //클래스 통해서 접근하기
		System.out.println(A.b);

	}

}
