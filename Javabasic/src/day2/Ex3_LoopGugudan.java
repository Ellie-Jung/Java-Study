package day2;

import java.util.Scanner;

public class Ex3_LoopGugudan {
	
	static void Gugu(int start,int end)
	{
		
		for(int i=start;i<=end;i++)
		{
			System.out.println(i+"단");
			for(int j=1;j<=9;j++)
				System.out.printf("%d*%d = %d\n",i,j,i*j);
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------");
		System.out.println("구구단");
		System.out.println("----------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작단을 입력하시오");
		int start = sc.nextInt();
		
		System.out.println("끝단을 입력하시오");
		int end = sc.nextInt();
		
		Gugu(start,end);
	
		
	}

}
