package com.test;

//학생 (상태+동작)
//상태적인 정보(속성,특성- 이름,나이,학년,성별,..)
//동작을 나타내는 정보( 공부하다,운동하다,..)
class Student {
	String name;
	int age;
	int grade;
	boolean gender;
	public void study() {
		System.out.println(name + "이 공부한다.");
	}
	public void exercise() {}
}

class Employee{
	String name ;
	int empNo;
	public void work() {}
}

public class Sample01 {

	public static void main(String[] args) {
		
		Student tom = new Student();
		tom.name  = "톰";
		tom.age = 30;
		tom.gender = true ;
		tom.study();
		Student john = new Student();
		john.name = "존";
		john.age=40;
		john.gender = false;
		john.study();
	
		Employee susan = new Employee();
		Employee kate = new Employee();
		
	}

}
