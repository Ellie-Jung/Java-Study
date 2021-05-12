class MyClass{
	int a;
	static int b;
	static {
		b=10;
		System.out.println(b);
		System.out.println("Static Initial");
	}
	MyClass(){
		a = 200;
		System.out.println(a);
		System.out.println("Default Constructor");
		System.out.println(b++);
	}
}
public class Sample01 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
//		System.out.println(MyClass.b);
		MyClass obj2 = new MyClass();

	}

}
