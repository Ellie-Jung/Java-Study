package com.test;

import java.util.Scanner;

public class Sample09 {

	public static void main(String[] args) {
		
//		int a= 10;
//		while (a==10) {}
		//무한루프 
	//	while(true) {}
	//	for(;;) {}
		
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("--------메뉴-------");
			System.out.println("#1. 메뉴");
			System.out.println("#2. 종료");
			System.out.println("------------------");
			System.out.println("메뉴를 선택해주세요 : ");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			
			if (num==1) {
					System.out.println("메뉴입니다.");
			}else if ( num ==2) {
				System.out.println("종료입니다.");
				break;
			} else {
				System.out.println("예외상황입니다.");
				break;
			}
			
		}
		
		
		
//		for (;;) {
//			
//		}
//		
		
	}

}
