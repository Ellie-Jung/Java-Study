package book;
class Parent{
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	int x = 200;
	void method() {
		System.out.println("Child Method");
	}
}
public class BindingTest {

	public static void main(String[] args) {
		Parent P = new Parent();
		Child C = new Child();
		
		P.method();
		C.method();
	}

}
