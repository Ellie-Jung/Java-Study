package day4;

class Person{
	
	String name;
	int age;
	
	void play() {System.out.println(name+ " 고고장에서 논다 ");}
	void sleep() {System.out.println(name +" 집에서 잔다");}
	
}

class Student extends Person
{
	int kor;
	int eng;
	int math;
	
	void play() {System.out.println(name+" 클럽에서 논다");}
	void study() {System.out.println(name + " 공부한다");}
	
}

public class Ex2_OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person a = new Person();
		a.name= "어머니";
		a.age = 50;
		a.play();
		a.sleep();
		
		Student b=new Student();
		b.name = "딸내미";
		b.age = 20;
		b.kor = 90;
		b.eng=  80;
		b.math = 100;
		b.play();
		b.study();
		b.sleep();
		
		
	}

}
