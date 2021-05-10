package com.test;

import java.util.Scanner;

public class Quiz01_teacher {
	static int getInputValue() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	static int add(int a, int b) {
		return a + b;
	}
	static int subtract(int a, int b) {
		return a - b;
	}
	static int multiply(int a, int b) {
		return a * b;
	}
	static int divide(int a, int b) {
		return a / b;
	}
		
	public static void main(String[] args) throws InterruptedException {
		
		int num1, num2, result;
		for(;;) {
			System.out.println("####################");
			System.out.println("# 1. 덧셈");
			System.out.println("# 2. 뺄셈");
			System.out.println("# 3. 곱셈");
			System.out.println("# 4. 나눗셈");
			System.out.println("# 5. 종료");
			System.out.println("####################");
			System.out.print("# 메뉴를 선택해주세요. : ");
			int selNum = getInputValue();
			switch(selNum) {
			case 1:
				System.out.print("첫번째 숫자를 입력해주세요. : ");
				num1 = getInputValue();
				System.out.print("두번째 숫자를 입력해주세요. : ");
				num2 = getInputValue();
				result = num1 + num2;
				System.out.println("결과는 " + result + "입니다.");
				Thread.sleep(1000);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:	
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}
	}

}
