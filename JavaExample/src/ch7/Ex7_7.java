package ch7;
class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive,Brrr");
	}
	void stop() {
		System.out.println("stop!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("Water!");
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();//����ȯ�ÿ� ���� �ν��Ͻ��� ���������� �߿�.
		
		FireEngine fe2 = (FireEngine) car; //���� -> �ڼ����� ����ȯ
		Car car2 = (Car)fe2;                //�ڼ� -> �������� ����ȯ
//		car2.drive(); // NullPoint Error �߻�
		
		///////////////////
		Car c = new Car();
		FireEngine fe3 = (FireEngine)c; // ����ȯ ����� ���� java.lang.ClassCastException
		fe.water(); ///������ ������
	}

}
