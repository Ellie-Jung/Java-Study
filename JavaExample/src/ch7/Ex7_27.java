package ch7;
class Outer3{
	int value =10;
	
	class Inner{
		int value =20;
		void method1() {
			int value =30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	}//Inner 클래스 끝
}//Outer클래스 끝
public class Ex7_27 {

	public static void main(String[] args) {
		Outer3 o = new Outer3();
		Outer3.Inner inner = o.new Inner();
		
				
		inner.method1();

	}

}
