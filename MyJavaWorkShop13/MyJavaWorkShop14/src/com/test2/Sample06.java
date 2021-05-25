package com.test2;
//ĸ��ȭ //������ //���
class Employee{
	protected String name;
	protected int age;
	public Employee() {} //������ �����
	public Employee(String name, int age) {
		this.name= name;
		this.age = age;
	}
	public void setName( String name) { //�����̺� ĸ��ȭ ->���� ���� �����
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public int getAge() {
		return this.age;
	} 
	public void working() {
		System.out.println("���Ѵ�.");
	}
	public void working(String location){ //�޼��� �����ε�
		System.out.println(this.name + "�� "+ location +"���� ���Ѵ�.");
	}
	static int salary; //����ƽ����
	static { //����ƽ ���� �ʱ�ȭ
		salary = 3000;
	}
	static void displaySalary() {
		System.out.println(salary);
	}
} 
class PartTimeEmployee extends Employee{
//	public PartTimeEmployee() {}
	public PartTimeEmployee(String name, int age) {
		super(name,age);
	}
	public void eating() {
		System.out.println(this.name +"�� ���� �Դ´�.");
	}
	@Override //�������̵��ϱ� //��ӽ� �����޼��带 ������ (������)
	public void working() {
		System.out.println("working overriding");
	}
}
public class Sample06 {
	public static void main(String[] args) {
		Employee emp = new Employee()	;
		Employee emp2 = new Employee("�̼���", 14)	;
		emp2.working();
		emp2.working("����");
		
		Employee.displaySalary();
		
		System.out.println("===========");
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("ȫ�浿", 20);
		PartTimeEmployee.salary =300;
		System.out.println(partTimeEmployee.salary);
		partTimeEmployee.displaySalary();
		partTimeEmployee.eating();
		partTimeEmployee.working();
		
		Employee emp3 = new PartTimeEmployee("�������", 50);
		emp3.working();
		
		
		
	}

}
