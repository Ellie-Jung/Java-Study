class Point{
	int x;
	int y;
}
//class Circle extends Point { //���
//	int r;
//}
class Circle{ //����
	Point p= new Point(); //���������� �ʱ�ȭ
	int r;
	
}

public class InteritanceTest {

	public static void main(String[] args) {
		Circle  c = new Circle();
		System.out.println(c.toString()); //Circle@2d363fb3
		System.out.println(c); //���Ͱ�� �Ȱ��� ����// ����Ʈ������ ���. ���������� �ٷε����� ���⼭ ����Ʈ���� ȣ���ؼ� ���
		Circle  c2 = new Circle();
		System.out.println(c2.toString()); //Circle@2d363fb3
//		toString �� ������Ʈ Ŭ����. �ٷ� ��밡��. Ŭ�����̸�@�ּҰ��� ���ڿ��� ������
		

//		c.p.x = 1;
//		c.p.y = 2;
//		c.r =3;
//		System.out.println("c.x ="+c.p.x);
//		System.out.println("c.y ="+c.p.y);
//		System.out.println("c.r ="+c.r);
	}

}
