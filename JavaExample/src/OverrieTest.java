class MyPoint{
	int x; 
	int y;
	//생성자
	MyPoint(int x, int y){
		this.x= x;
		this.y =y;
	}
	//Object 클래스의 toString()을 오버라이딩
	public String toString() { //Object  클래스의 toString 이 public이므로 선언부 똑같아야함
		return "x: "+x+", y : "+y;
	}
}
public class OverrieTest {

	public static void main(String[] args) {
		MyPoint m = new MyPoint(1,3);
//		m.x =1;
//		m.y=3;
		System.out.println(m.toString());
		System.out.println(m);//위 결과랑 같음/ 객체가 가진 값들을 출력
//		System.out.println("m.x ="+m.x);
//		System.out.println("m.y ="+m.y);
		
	}

}
