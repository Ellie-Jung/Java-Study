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
//		Car car = null;
//		FireEngin fe = new FireEngin();
//		FireEngin fe2 = null;
//		
//		fe.water();
//		car= fe;
//		fe2 = (FireEngin) car;
//		fe2.water();
		
		Car car= new Car();
		Car car2= null;
		FireEngin fe = null;
		
		car.drive();
//		fe = (FireEngin)car;
////		fe.drive();
//		car2 = fe;
//		car2.drive();
//	
	}

}
