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
			System.out.println("# 1. ����");
			System.out.println("# 2. ����");
			System.out.println("# 3. ����");
			System.out.println("# 4. ������");
			System.out.println("# 5. ����");
			System.out.println("####################");
			System.out.print("# �޴��� �������ּ���. : ");
			int selNum = getInputValue();
			switch(selNum) {
			case 1:
				System.out.print("ù��° ���ڸ� �Է����ּ���. : ");
				num1 = getInputValue();
				System.out.print("�ι�° ���ڸ� �Է����ּ���. : ");
				num2 = getInputValue();
				result = num1 + num2;
				System.out.println("����� " + result + "�Դϴ�.");
				Thread.sleep(1000);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:	
				System.out.println("����");
				System.exit(0);
				break;
			}
		}
	}

}
