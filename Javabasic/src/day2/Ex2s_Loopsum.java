package day2;

import java.util.Scanner;

public class Ex2s_Loopsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���� �ջ��");
		System.out.println("----------");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				System.out.println("�߰����"+i+""+sum);
			}
			else
			{
				System.out.println("Ȧ������"+i+""+sum);
			}
			System.out.println("�ջ���"+sum);
				
		}
	}
}
