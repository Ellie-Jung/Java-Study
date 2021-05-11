package com.test3;
class A2{
	int a;
	A2(){System.out.println("A default Constructor");}
	A2(int a){
		this.a = a;
		System.out.println(a+ "A COnstructor");
	}
}
class B2 extends A2{
	B2(){
		super(10);
		super.a =100;
		System.out.println("B dagault Constructor");}
}
public class Sample13 {

	public static void main(String[] args) {
		B2 b = new B2();

	}

}
