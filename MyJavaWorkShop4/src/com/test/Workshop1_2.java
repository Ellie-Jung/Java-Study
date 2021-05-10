package com.test;

import java.util.Scanner;

public class Workshop1_2 {
	public static float getUserInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return Float.parseFloat(input);
	}
	


	public static void main(String[] args) {
		
		for (;;) {
			
			System.out.print("Computer Science 성적을 입력하세요 :");
			float a = getUserInput();
			System.out.print("Java Programming 성적을 입력하세요 :");
			float b = getUserInput();
			System.out.print("공학수학 성적을 입력하세요 :");
			float c = getUserInput();
			System.out.print("오페라의 이해 성적을 입력하세요 :");
			float d = getUserInput();
			System.out.print("배드민턴 성적을 입력하세요 :");
			float e = getUserInput();
			System.out.println("==============================");
			
			float avr= (a+b+c+d+e)/5;
			System.out.printf("평점은 %.2f점 입니다.%n", avr);
			
			if (avr >=3.7) {
				if((a>=2.5)&&(b>=2.5)&&(c>=2.5)&&(d>=2.5)&&(e>=2.5)) {
					System.out.println("다음학기 장학금 대상자 입니다.");
				}
			}
			
			System.out.println("종료하시겠습니까?");
			System.out.println("1.종료");
			System.out.println("2.계속");
			float num = getUserInput();
			if (num==1) {
				System.out.println("종료합니다.");
				break;

			}else if (num==2) {
				continue;
			}else {
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		
		
		}
	

	}

}
