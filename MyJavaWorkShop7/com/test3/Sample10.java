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
//		A b2 = new B(); //Ÿ��ĳ��Ʈ�ÿ��� �������̵��Ѱ� ���´�
//		b.aMethod();
//		
		C c = new C();
		A a = c;
//		A a  = new C();
		a.aMethod();
	}

}
