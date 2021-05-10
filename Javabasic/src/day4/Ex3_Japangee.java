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
			System.out.println("=====음료자판기=====");
			
			System.out.println("1. 콜라    1000원 ");
			System.out.println("2. 사이다    900원 ");
			System.out.println("3. 물       500원 ");
			System.out.println("0. 종료하기");
			
			System.out.println("원하시는 음료 번호를 선택하세요 ");
			menu=sc.nextInt();
		
			
			if (menu==0)
			{
				System.out.println("byebye ");
				break;
			}
			
		
			System.out.println("돈을 넣으세요 ");
			addmoney = sc.nextInt();
		
			
			if (addmoney>=money[menu-1])
			{
				change = addmoney -money[menu-1];
				System.out.printf("잔액은 %d원 입니다\n",change);
	
			}
			
			else
			{
				System.out.printf("잔액이 %d원 부족합니다\n.",money[menu-1]-addmoney);
				System.out.printf("금액 %d원을 반납합니다\n. ",addmoney);
				continue;
			}
			
			if (menu==1)
				System.out.println("콜라 받으세요");
			else if(menu==2)
				System.out.println("사이다 받으세요");
			else if(menu==3)
				System.out.println("물 받으세요");
			else
				System.out.println("잘못 선택하셨습니다.");
		
			
			
			
		
		}
		
	}

}
