package com.test2;
//기본형 매개변수와 참조형 매개변수 
class MyClass {
	public int a;
}
public class Sample08 {
	//call my reference or pass by reference or input, output
	static void testMethod(MyClass m1) {
		m1.a = 300;
	}
	//call my value, pass by value, only input
	static void testMethod2(int x) { //int x = a;
		x =100;
	}
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.a = 10;
		System.out.println(m.a);
		testMethod(m);
		System.out.println(m.a);
		
		int a = 10;
		System.out.println(a);
		testMethod2(a);
		System.out.println(a); //값이그냥 복사됨
	}

}
