package com.test;

abstract class Student {
	abstract void studying();
}

public class Sample08 {
	public static void main(String[] args) {
		Object object = new Object() {
			void testMethod() {
				System.out.println("testMethod");
			}
		}; //요롷게 쓰래
		Student stu = new Student() { //익명의 클래스 구현하기 //일회용으로 쓰고 버리기(추상클래스 구현하기)
			@Override
			void studying() {
				System.out.println("Student studying");
			}
		};//
		stu.studying();
	}

}
