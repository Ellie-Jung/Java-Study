class Foo{
	public static String classVar = "I class var";
	public String instanceVar ="I instance var";
}

public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
		Foo f = new Foo();
		System.out.println(f.instanceVar);

	}

}
