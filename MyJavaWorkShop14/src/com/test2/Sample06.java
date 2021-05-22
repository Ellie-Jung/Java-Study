package com.test2;
//캡슐화 //생성자 //상속
class Employee{
	protected String name;
	protected int age;
	public Employee() {} //생성자 만들기
	public Employee(String name, int age) {
		this.name= name;
		this.age = age;
	}
	public void setName( String name) { //프라이빗 캡슐화 ->개터 세터 만들기
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
		System.out.println("일한다.");
	}
	public void working(String location){ //메서드 오버로딩
		System.out.println(this.name + "이 "+ location +"에서 일한다.");
	}
	static int salary; //스테틱변수
	static { //스테틱 변수 초기화
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
		System.out.println(this.name +"은 밥을 먹는다.");
	}
	@Override //오버라이딩하기 //상속시 하위메서드를 재정의 (다형성)
	public void working() {
		System.out.println("working overriding");
	}
}
public class Sample06 {
	public static void main(String[] args) {
		Employee emp = new Employee()	;
		Employee emp2 = new Employee("이순신", 14)	;
		emp2.working();
		emp2.working("서울");
		
		Employee.displaySalary();
		
		System.out.println("===========");
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("홍길동", 20);
		PartTimeEmployee.salary =300;
		System.out.println(partTimeEmployee.salary);
		partTimeEmployee.displaySalary();
		partTimeEmployee.eating();
		partTimeEmployee.working();
		
		Employee emp3 = new PartTimeEmployee("세종대왕", 50);
		emp3.working();
		
		
		
	}

}
