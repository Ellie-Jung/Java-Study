package day3;

import java.util.Scanner;

public class Ex5s_MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------------------");
		System.out.println("Max 판별기");
		System.out.println("------------------------");
	
		Scanner sc = new Scanner(System.in);
				
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.print("세번째 숫자를 입력하세요 : ");
		int c = sc.nextInt();
		
		int max =a;
		if(max <b)
			max = b;
		if (max<c)
			max=c;
		
		System.out.println(">>>>가장 큰 숫자는?"+max);
		
	}

}
