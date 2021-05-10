package com.test;

class MyClass{
	int myVar1;
	static int myVar2;
	
}

public class Sample03 {
	static int myVar3;
	public static void main(String[] args) {
		MyClass m = new MyClass();
		MyClass.myVar2 = 20; //스태틱 선언하면 바로 호출해서 쓸수 있음
		System.out.println(MyClass.myVar2);
		Sample03.myVar3 = 10; //같은클래스 안에서는 클래스명 생략가능
		myVar3 = 20;
		
	}

}
