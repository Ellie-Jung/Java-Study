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
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2= sc.nextInt();

		System.out.println("���ϱ�"+c.addNum(num1, num2));
		System.out.println("������"+c.divNum(num1, num2));
		System.out.println("���� �������� �Է��ϼ���");
		int r = sc.nextInt();
		System.out.println("�ѷ�"+c.circumference(r));
		System.out.println("����"+c.circleAria(r));
	}
}
