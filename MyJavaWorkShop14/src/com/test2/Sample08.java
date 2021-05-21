package com.test2;
//
class MyClass {
	public int a;
}
public class Sample08 {
	//call my reference or pass by reference or input, output
	static void testMethod(MyClass m1) {
		m1.a = 300;
	}
	static void testMethod2(int x) {
		x =100;
	}
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.a = 10;
		System.out.println(m.a);
		testMethod(m);
		System.out.println(m.a);
		
		int x = 10;
		System.out.println(x);
		testMethod2(x);
		System.out.println(x);
	}

}
