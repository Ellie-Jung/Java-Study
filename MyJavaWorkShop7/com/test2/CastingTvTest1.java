package com.test2;
class Car {
	String color;
	int door;
	void drive() {System.out.println("drive,Brrrr~");} //�����ϴ� ���
	void stop() {System.out.println("stop!!!");} //���ߴ� ���
}
class FireEngin extends Car{
	void water() {System.out.println("water!!!!");}
}
public class CastingTvTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngin fe = new FireEngin();
		FireEngin fe2 = null;
		car= fe;                //car = (car)fe;���� ����ȯ ����. ��ĳ����
		fe2 = (FireEngin) car;  //�ٿ�ĳ����. ����ȯ ���� �Ұ�
		
//		
//		fe.water();
//		fe2.water();
		
//		Car car= new Car();
//		Car car2= null;
//		FireEngin fe = null;
//		
		car.drive();
//		fe = (FireEngin)car;
////		fe.drive();
//		car2 = fe;
//		car2.drive();
//	
	}

}
