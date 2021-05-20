package com.test;
class Student2<T>{
	T s; 
	public Student2(T s) {
		this.s = s;
	}
	public T getS() {
		return this.s;
	}
}
public class Sample03 {

	public static void main(String[] args) {
		Student2 <String> stu = new Student2<String>("ÀÌ¼ø½Å");
		System.out.println(stu.getS());

	}

}
