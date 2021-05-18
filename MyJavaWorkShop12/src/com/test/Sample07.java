package com.test;

public class Sample07 {
	static class StaticClass{
		void testMethod2() {System.out.println("testMethod2 in StaticClass" +b);}
	}
	static int b= 30;
	public static void main(String[] args) {
		
		Sample07 obj = new Sample07();
		Sample07.InnerClass obj2 = obj.new InnerClass();
		obj2.testMethod();
	
		Sample07.StaticClass obj3= new Sample07.StaticClass();
		obj3.testMethod2();
		
	}
	private int a = 10;
	class InnerClass{
		void testMethod() {
			System.out.println("testMethod in innerClass");
		}
	}
}
