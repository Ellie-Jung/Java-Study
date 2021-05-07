package day2;

import java.util.Scanner;

public class Ex2s_Loopsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자 합산기");
		System.out.println("----------");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				System.out.println("중간결과"+i+""+sum);
			}
			else
			{
				System.out.println("홀수제외"+i+""+sum);
			}
			System.out.println("합산결과"+sum);
				
		}
	}
}
