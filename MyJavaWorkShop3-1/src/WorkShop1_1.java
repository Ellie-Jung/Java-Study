import java.util.Scanner;

public class WorkShop1_1 {
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {
		
		
		System.out.println("=======�޴�=======");
		System.out.println("1. �Ƹ޸�ī�� 2000��");
		System.out.println("2. ī���  3000��");
		System.out.println("3. ���̱�   1500��");
		System.out.println("4. ũ��ġ��   500��");
		System.out.println("=================");
		
		System.out.println("�ֹ������� �Է��ϼ���");
		
		System.out.println("=======�ֹ�=======");
		System.out.print("�Ƹ޸�ī�� �ֹ� ���� : ");
		int num = getUserInput();
		System.out.print("ī��� �ֹ� ���� : ");
		int num2 = getUserInput();
		System.out.print("���̱� �ֹ� ���� : ");
		int num3 = getUserInput();
		System.out.print("ũ��ġ�� �ֹ� ���� : ");
		int num4 = getUserInput();
		
		System.out.println("========�ݾ�=======");
		int b1 = 2000;
		System.out.printf("�Ƹ޸�ī�� : %d��%n", num*b1);
		int b2 = 3000;
		System.out.printf("ī��� : %d��%n", num2*b2);
		int b3 = 1500;
		System.out.printf("���̱� : %d��%n", num3*b3);
		int b4 = 500;
		System.out.printf("ũ��ġ�� :%d��%n", num4*b4);
		System.out.println("=======================");
		
		double point;
		int total = (num*b1)+ (num2*b2)+ (num3*b3)+(num4*b4);
		
		System.out.printf("�� ���űݾ� :%d��\n ",total);
		
//		if (total >=30000) {
//			point = total*0.02;
//			System.out.printf("����Ʈ���� : %.0f��",point);
//		}else if(total>12000) {
//			point= total*0.01;
//			System.out.printf("����Ʈ���� : %0.f��",point);
//		} else
//			System.out.println("����Ʈ ���� :0��");
		
		if (total >=30000) {
			point = total*0.02;
			
		}else if(total>12000) {
			point= total*0.01;
			
		} else
			point = 0;
		
		System.out.printf("����Ʈ���� : %d��",(int)point);
		
		
	}

}