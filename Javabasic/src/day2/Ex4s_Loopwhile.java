package day2;

import java.util.Scanner;

public class Ex4s_Loopwhile {
	
	static int ShowMenu()
	{
		System.out.println("1.�ݶ�");
		System.out.println("2.�꽺");
		System.out.println("3.��");
		System.out.println("0.�����մϴ�");
		System.out.print("���ϴ� �����ư�� �����ϼ���");
		
		Scanner sc = new Scanner(System.in);
	
		int num;
		num = sc.nextInt();
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------");
		System.out.println("�������Ǳ�");
		System.out.println("----------");

		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		
		while (true)
		{
			num=ShowMenu();
			
			if (num==0)
				{	System.out.println("���̹���");
			 		break;
			 	}
			if (num==1)
				System.out.println("�ݶ� ��������");
			else if (num==2)
				System.out.println("�꽺 ��������");
			else if (num==3)
				System.out.println("�� ��������");
			
			else 
				System.out.println("�߸� �����ϼ̾��");
	
		}
	}

}
