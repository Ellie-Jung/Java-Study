package ch7;
// 내부 클래스의 멤버변수 값 출력하기.
class Outer{
	class Inner {
		int iv =100;
	}
}
class Outer2{
	static class Inner2{
		int iv = 200;
	}
}
public class Ex7_25 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner ii= o.new Inner();
		System.out.println(ii.iv);
		
		Outer2.Inner2 i= new Outer2.Inner2(); //내부클래스가 static 클래스일때 
		System.out.println(i.iv);
		
	}

}
