package ch09;

public class Person {
	String name;
	String personNumber;
	
	public Person(String personNumber) {
		this.name ="";
		this.personNumber=personNumber;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return name ==p.name;
		}
		return false;
	}
	public static void main(String[] args) {
		Person a = new Person("1111");
		Person b = new Person("1111");
		
		System.out.println(a.equals(b));
		
	}
}
