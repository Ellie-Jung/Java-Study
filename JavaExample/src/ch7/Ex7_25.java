package ch7;
// ���� Ŭ������ ������� �� ����ϱ�.
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
		
		Outer2.Inner2 i= new Outer2.Inner2(); //����Ŭ������ static Ŭ�����϶� 
		System.out.println(i.iv);
		
	}

}
