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
		FireEngine fe = new FireEngine();//형변환시에 실제 인스턴스가 무엇인지가 중요.
		
		FireEngine fe2 = (FireEngine) car; //조상 -> 자손으로 형변환
		Car car2 = (Car)fe2;                //자손 -> 조상으로 형변환
//		car2.drive(); // NullPoint Error 발생
		
		///////////////////
		Car c = new Car();
		FireEngine fe3 = (FireEngine)c; // 형변환 실행시 에러 java.lang.ClassCastException
		fe.water(); ///컴파일 오케이
	}

}
