package com_test;

public class Sample02 {

	public static void main(String[] args) {
		//value type 값타입
		//JVM stack 메모리 공간에 할당되고 초기화됨.
		int a = 1;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		
		//reference type 참조타입
		//JVAM stack 메모리 공간에 e변수 할당되고 
		//head메모리 공간에 Employee 구조 생성되고 내부 변수 name, age가 할당됨.
		//e변수는 heap 메모리 공간의 Employee를 참조함.
		Employee e = new Employee();
		e.name = "이순신";
		e.age = 30;
		System.out.printf("%s,%d\n", e.name, e.age);
		Employee e2= e;
		e2.name = "세종대왕";
		System.out.printf("%s,%d\n", e2.name, e2.age);
		System.out.printf("%s,%d\n", e.name, e.age);
		
		

	}

}
class Employee{
	public String name;
	public int age;
}