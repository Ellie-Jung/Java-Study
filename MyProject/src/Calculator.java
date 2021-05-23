import java.util.Scanner;

public class Calculator {
	int addNum(int x, int y) {
		return x+y;
	}
	int subNum(int x, int y) {
		return x-y;
	}
	int mulNum(int x, int y) {
		return x*y;
	}
	float divNum(int x, int y) {
		return x/y;
	}
	double circumference(int r) {
		return 2*Math.PI*r;
	}
	double circleAria(int r) {
		return Math.PI*r*r;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();

		System.out.println(c.addNum(2, 3));
		System.out.println(c.circleAria(2));

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2= sc.nextInt();

		System.out.println("더하기"+c.addNum(num1, num2));
		System.out.println("나누기"+c.divNum(num1, num2));
		System.out.println("원의 반지름을 입력하세요");
		int r = sc.nextInt();
		System.out.println("둘레"+c.circumference(r));
		System.out.println("넓이"+c.circleAria(r));
	}
}
