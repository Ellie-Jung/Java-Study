import java.util.Scanner;

public class Sample08 {

	public static void main(String[] args) {

		System.out.println("#################");
		System.out.println("# 1. ����");
		System.out.println("# 2. ����");
		System.out.println("# 3. ����");
		System.out.println("# 4. ������");
		System.out.println("# 5. ����");
		System.out.println("#################");
		
		System.out.print("#�޴� ��ȣ�� �Է��� �ּ��� : ");
		Scanner sc = new Scanner(System.in);
		int num;
	//	int num = sc.nextInt();
		String input = sc.nextLine();
		num = Integer.parseInt(input);
		
		
		if(num==1)
		{ System.out.println("�����Դϴ�.");}
		else if (num ==2)
		{ System.out.println("�����Դϴ�.");}
		else if (num ==3)
		{ System.out.println("�����Դϴ�.");}
		else if (num ==4)
		{ System.out.println("�������Դϴ�.");}
		else if (num ==5)
		{ System.out.println("�����մϴ�.");}
		else
		{ System.out.println("�߸��Է��ϼ̽��ϴ�.");}
	}

}
