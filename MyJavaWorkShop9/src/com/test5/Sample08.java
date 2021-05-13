package com.test5;
class Employee extends Object{
	public String toString() {
		Integer i = new Integer(this.hashCode());
	return i.toString();
	}
}

public class Sample08 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		String temp = emp.toString();
		System.out.println(temp);
		System.out.println(emp);
		Employee emp2 = new Employee();
		System.out.println(emp2);
	}

}
