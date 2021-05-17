package com.test;
class Employee{
	String name;
	int age;
	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if((obj != null) && obj instanceof Employee) {
			Employee emp = (Employee)obj;
			return emp.name == this.name && emp.age == this.age;
		}else {
			return false;
		}
	}
}
public class Sample03 {

	public static void main(String[] args) {
		Employee e = new Employee("ȫ",11);
		Employee e1 = new Employee("��",12);
		System.out.println(e.equals(e1));

	}

}
