package day1;

import java.util.Scanner;

public class Ex2s_CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------------");
		System.out.println("홀수 짝수 감별기");
		System.out.println("------------------");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num= sc.nextInt();
		
		if(num%2==0)
			System.out.println("은 짝수입니다.");
		else
			System.out.println("은 홀수입니다.");
	}

}
