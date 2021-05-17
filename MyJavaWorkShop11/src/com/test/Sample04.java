package com.test;
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age= age;
	}
	public String toString() {
		String str = this.name + ","+ this.age;
		return str;
	}
}
public class Sample04 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",12);
		System.out.println(s.toString());
		System.out.println(s);

	}

}
