package com.test2;
interface IStudent{
	public void study();
}
class Student implements IStudent{
	public void study() {
		System.out.println("학생이 공부하다.");
	}
}
public class Sample02 {

	public static void main(String[] args) {
		Student student= new Student();
		student.study();
		IStudent iStudent=new Student();
		iStudent.study();

	}

}
