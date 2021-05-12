abstract class Student3{ //클래스내에 추상메서드 선언됨. 구현안됨. 구체적인사항 설정해줘야한다. abstract 부분을 구현을 해야 사용이 가능하다.
	void studying() {
		System.out.println("Student3 studying");
	}
	abstract void eating();//추상메서드.
}
class Student4 extends Student3{
	public void eating() {
		System.out.println("Student4 eating");
	}
}
public class Sample09 {

	public static void main(String[] args) {
		Student4 s = new Student4();
		s.eating();
		s.studying();
	}

}
