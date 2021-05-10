class Student2 {
	public String name;
}
public class Sample02 {

	public static void main(String[] args) {
		/* Value Type
		int a = 10;
		int b = 20;
		int c = a;
		int d = b;
		System.out.println(d);
		*/
		//Reference Type
		Student2 s = new Student2();
		s.name = "홍길동";
		Student2 s2 = s;
		System.out.println(s.name);
		System.out.println(s2.name);
		s2.name = "이순신";
		System.out.println(s.name);
	}

}
