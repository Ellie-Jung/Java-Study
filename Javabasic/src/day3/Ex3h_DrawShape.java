package day3;

import java.util.Scanner;

public class Ex3h_DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���ڸ� �ϳ� �Է��Ͻÿ�");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
	
		
//		for(int i=0;i<num;i++)
//		{
//			
//			
//			for(int j=0;j<i;j++)
//			{
//				System.out.print("*");
//			}
//		System.out.println("*");
//		}
//		
		
//		for(int i=num;i>=0;i--)
//		{
//			for(int j=0;j<i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("-");
//		}
		
		for(int i=0; i<=num; i++)
		{
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println("");
		}
		
		//���ﰢ��
		for(int i=num; i>=0; i--)
		{
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

}
