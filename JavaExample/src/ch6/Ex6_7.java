package ch6;
class MyPoin{
	int x;
	int y;
	public MyPoin(int x, int y) {
		this.x=x;
		this.y=y;
	}
	double getDistance (int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}

}
public class Ex6_7 {

	public static void main(String[] args) {
		MyPoin p = new MyPoin(1, 1);
		
		//p와 (2,2) 의 거리를 구한다.
		System.out.println(p.getDistance(2,2));

	}

}
