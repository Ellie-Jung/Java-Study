class Point{
	int x;
	int y;
}
//class Circle extends Point { //상속
//	int r;
//}
class Circle{ //포함
	Point p= new Point(); //참조변수의 초기화
	int r;
	
}

public class InteritanceTest {

	public static void main(String[] args) {
		Circle  c = new Circle();
		System.out.println(c.toString()); //Circle@2d363fb3
		System.out.println(c); //위와결과 똑같이 나옴// 프린트엘엔의 기능. 참조변수가 바로들어오면 여기서 투스트링을 호출해서 사용
		Circle  c2 = new Circle();
		System.out.println(c2.toString()); //Circle@2d363fb3
//		toString 은 오브젝트 클래스. 바로 사용가능. 클래스이름@주소값을 문자열로 보여줌
		

//		c.p.x = 1;
//		c.p.y = 2;
//		c.r =3;
//		System.out.println("c.x ="+c.p.x);
//		System.out.println("c.y ="+c.p.y);
//		System.out.println("c.r ="+c.r);
	}

}
