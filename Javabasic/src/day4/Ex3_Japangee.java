package day4;

import java.util.Scanner;

public class Ex3_Japangee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int addmoney;
		int money[]= new int[] {1000,900,500};
		int change;
		int menu= -1;
			
		for(;;)
		{
			System.out.println("=====�������Ǳ�=====");
			
			System.out.println("1. �ݶ�    1000�� ");
			System.out.println("2. ���̴�    900�� ");
			System.out.println("3. ��       500�� ");
			System.out.println("0. �����ϱ�");
			
			System.out.println("���Ͻô� ���� ��ȣ�� �����ϼ��� ");
			menu=sc.nextInt();
		
			
			if (menu==0)
			{
				System.out.println("byebye ");
				break;
			}
			
		
			System.out.println("���� �������� ");
			addmoney = sc.nextInt();
		
			
			if (addmoney>=money[menu-1])
			{
				change = addmoney -money[menu-1];
				System.out.printf("�ܾ��� %d�� �Դϴ�\n",change);
	
			}
			
			else
			{
				System.out.printf("�ܾ��� %d�� �����մϴ�\n.",money[menu-1]-addmoney);
				System.out.printf("�ݾ� %d���� �ݳ��մϴ�\n. ",addmoney);
				continue;
			}
			
			if (menu==1)
				System.out.println("�ݶ� ��������");
			else if(menu==2)
				System.out.println("���̴� ��������");
			else if(menu==3)
				System.out.println("�� ��������");
			else
				System.out.println("�߸� �����ϼ̽��ϴ�.");
		
			
			
			
		
		}
		
	}

}
