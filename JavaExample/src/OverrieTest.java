class MyPoint{
	int x; 
	int y;
	//������
	MyPoint(int x, int y){
		this.x= x;
		this.y =y;
	}
	//Object Ŭ������ toString()�� �������̵�
	public String toString() { //Object  Ŭ������ toString �� public�̹Ƿ� ����� �Ȱ��ƾ���
		return "x: "+x+", y : "+y;
	}
}
public class OverrieTest {

	public static void main(String[] args) {
		MyPoint m = new MyPoint(1,3);
//		m.x =1;
//		m.y=3;
		System.out.println(m.toString());
		System.out.println(m);//�� ����� ����/ ��ü�� ���� ������ ���
//		System.out.println("m.x ="+m.x);
//		System.out.println("m.y ="+m.y);
		
	}

}
