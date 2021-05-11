package com.test;
class MyClass2{
	MyClass2(){System.out.println("default Constructor");}
	static {System.out.println("Static Constructor");}
}
class MyClass{
	int a ;
	int a1= 10;
	MyClass(){
		System.out.println(a1);
	}
	static int b=20;
	static {
		b = 20;
	}
}
public class Sample01 {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		MyClass m1 = new MyClass();
		System.out.println(MyClass.b);
		System.out.println(MyClass.b);
		
		MyClass2 m3 = new MyClass2();
		MyClass2 m4 = new MyClass2();
	}

}
