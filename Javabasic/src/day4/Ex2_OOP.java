package day4;

class Person{
	
	String name;
	int age;
	
	void play() {System.out.println(name+ " ����忡�� ��� ");}
	void sleep() {System.out.println(name +" ������ �ܴ�");}
	
}

class Student extends Person
{
	int kor;
	int eng;
	int math;
	
	void play() {System.out.println(name+" Ŭ������ ���");}
	void study() {System.out.println(name + " �����Ѵ�");}
	
}

public class Ex2_OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person a = new Person();
		a.name= "��Ӵ�";
		a.age = 50;
		a.play();
		a.sleep();
		
		Student b=new Student();
		b.name = "������";
		b.age = 20;
		b.kor = 90;
		b.eng=  80;
		b.math = 100;
		b.play();
		b.study();
		b.sleep();
		
		
	}

}
