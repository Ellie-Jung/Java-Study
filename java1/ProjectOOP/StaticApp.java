class Foo{
	public static String classVar = "I class var";
	public String instanceVar ="I instance var";
	public static void classMethod() {
		System.out.println(classVar);  //Ok
//		System.out.println(instanceVar);  //Error
	}
	public void instanceMethod() {
		System.out.println(classVar);  //Ok
		System.out.println(instanceVar); //Ok
	}
}
public class StaticApp {
	
	public String instanceVar ="I instance var";
	public static void main(String[] args) {
		System.out.println(Foo.classVar); //Ok
	//	System.out.println(Foo.instanceVar); //Error
		Foo f = new Foo();
		System.out.println(f.instanceVar);
		
		Foo.classMethod();
//		Foo.instanceMethod(); //Error
		f.instanceMethod();
		
	}

}
