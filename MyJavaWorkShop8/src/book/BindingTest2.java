package book;
class Parent2{
	int x =100;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child2 extends Parent2{
	int x = 200;
	void method() {
		System.out.println("x=" + x);
		System.out.println("super.x= "+super.x);
		System.out.println("this.x = "+this.x);
	}
}
public class BindingTest2 {

	public static void main(String[] args) {
		Parent2 p = new Parent2();
		Child2 c = new Child2();
		p.method();
		System.out.println();
		
		Parent2 k = new Child2();
		System.out.println("p.x = "+p.x);
		k.method();
		System.out.println();
		System.out.println("c.x ="+c.x);
		c.method();
		
	}

}
