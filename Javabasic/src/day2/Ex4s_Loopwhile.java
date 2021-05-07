package day2;

import java.util.Scanner;

public class Ex4s_Loopwhile {
	
	static int ShowMenu()
	{
		System.out.println("1.콜라");
		System.out.println("2.쥬스");
		System.out.println("3.물");
		System.out.println("0.종료합니다");
		System.out.print("원하는 음료버튼을 선택하세요");
		
		Scanner sc = new Scanner(System.in);
	
		int num;
		num = sc.nextInt();
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------");
		System.out.println("음료자판기");
		System.out.println("----------");

		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		
		while (true)
		{
			num=ShowMenu();
			
			if (num==0)
				{	System.out.println("바이바이");
			 		break;
			 	}
			if (num==1)
				System.out.println("콜라 받으세요");
			else if (num==2)
				System.out.println("쥬스 받으세요");
			else if (num==3)
				System.out.println("물 받으세요");
			
			else 
				System.out.println("잘못 선택하셨어요");
	
		}
	}

}
