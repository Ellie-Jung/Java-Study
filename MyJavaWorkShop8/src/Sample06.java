class Student{
	protected String name;
	protected int age;
	Student(){}
	Student (String name, int age){
		this.name = name;
		this.age = age;
	}
}
class MiddleStudent extends Student{
	String gender ;
	MiddleStudent(String name, int age,  String gender){
		super (name,age);
//		this.name = name;
//		this.age = age;
		this.gender = gender;
		System.out.println(this.name+ ","+this.age+","+this.gender);
	}
}
public class Sample06 {

	public static void main(String[] args) {
		MiddleStudent middle = new MiddleStudent("È«±æµ¿", 20, "³²");
		

	}

}
