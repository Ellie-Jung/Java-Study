package com.test3;

class A{
	void aMethod() {System.out.println("aMethod in A");}
}
class B extends A{
	void aMethod() {System.out.println("aMethod in B");}
}
class C extends B{
	
}

public class Sample10 {

	public static void main(String[] args) {
//		B b = new B();
//		b.aMethod();
//		A b2 = new B(); //타입캐스트시에는 오버라이딩한게 나온다
//		b.aMethod();
//		
		C c = new C();
		A a = c;
//		A a  = new C();
		a.aMethod();
	}

}
