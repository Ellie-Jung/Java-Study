
class Print {
	public  String delimiter = "";
	public  void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public  void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
public class MyOOP {
	
	public static void main(String[] args) {
		//..
		
//		printA();
//		printA();
//		printB();
//		printB();
		////////
//		Print.delimiter = "------";
//		Print.A();
//		Print.A();
//		Print.B();
//		Print.B();	
//		Print.delimiter = "*****";
//		Print.A();
//		Print.A();
//		Print.B();
//		Print.B();
		///Print.A�� Ŭ�����Ҽ� (Ŭ������static �־����)
		//p1.A�� p1�̶�� �ν��Ͻ��� �Ҽ� (Ŭ������ static�����
		Print p1 =new Print();
		p1.delimiter="-----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		Print p2 =new Print();
		p2.delimiter="****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		
;	}
	
}
