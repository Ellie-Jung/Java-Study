package com.test2;
class Car {
	String color;
	int door;
	void drive() {System.out.println("drive,Brrrr~");} //운전하는 기능
	void stop() {System.out.println("stop!!!");} //멈추는 기능
}
class FireEngin extends Car{
	void water() {System.out.println("water!!!!");}
}
public class CastingTvTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngin fe = new FireEngin();
		FireEngin fe2 = null;
		car= fe;                //car = (car)fe;에서 형변환 생략. 업캐스팅
		fe2 = (FireEngin) car;  //다운캐스팅. 형변환 생략 불가
		
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
