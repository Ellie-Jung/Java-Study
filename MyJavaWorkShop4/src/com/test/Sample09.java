package com.test;

import java.util.Scanner;

public class Sample09 {

	public static void main(String[] args) {
		
//		int a= 10;
//		while (a==10) {}
		//���ѷ��� 
	//	while(true) {}
	//	for(;;) {}
		
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("--------�޴�-------");
			System.out.println("#1. �޴�");
			System.out.println("#2. ����");
			System.out.println("------------------");
			System.out.println("�޴��� �������ּ��� : ");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			
			if (num==1) {
					System.out.println("�޴��Դϴ�.");
			}else if ( num ==2) {
				System.out.println("�����Դϴ�.");
				break;
			} else {
				System.out.println("���ܻ�Ȳ�Դϴ�.");
				break;
			}
			
		}
		
		
		
//		for (;;) {
//			
//		}
//		
		
	}

}
