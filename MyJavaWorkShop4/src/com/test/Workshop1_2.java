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
			
			System.out.print("Computer Science ������ �Է��ϼ��� :");
			float a = getUserInput();
			System.out.print("Java Programming ������ �Է��ϼ��� :");
			float b = getUserInput();
			System.out.print("���м��� ������ �Է��ϼ��� :");
			float c = getUserInput();
			System.out.print("������� ���� ������ �Է��ϼ��� :");
			float d = getUserInput();
			System.out.print("������ ������ �Է��ϼ��� :");
			float e = getUserInput();
			System.out.println("==============================");
			
			float avr= (a+b+c+d+e)/5;
			System.out.printf("������ %.2f�� �Դϴ�.%n", avr);
			
			if (avr >=3.7) {
				if((a>=2.5)&&(b>=2.5)&&(c>=2.5)&&(d>=2.5)&&(e>=2.5)) {
					System.out.println("�����б� ���б� ����� �Դϴ�.");
				}
			}
			
			System.out.println("�����Ͻðڽ��ϱ�?");
			System.out.println("1.����");
			System.out.println("2.���");
			float num = getUserInput();
			if (num==1) {
				System.out.println("�����մϴ�.");
				break;

			}else if (num==2) {
				continue;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
		
		
		}
	

	}

}
