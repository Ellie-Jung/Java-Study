package com.test;

import java.util.Scanner;

class Calculator3{
	
	int add(int a, int b){
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	float div(int a, int b) {
		return a/b;
	}
}
public class Quiz01 {
	static int getInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {
		
		int num1, num2;
		for(;;) {
		
			System.out.println("########################");
			 System.out.println("#1. ����");
			 System.out.println("#2. ����");
			 System.out.println("#3. ����");
			 System.out.println("#4. ������");
			 System.out.println("#5. ����");
			 System.out.println("########################");
			 System.out.print("# �޴��� �������ּ���. : ");
			
//			 Scanner sc = new Scanner(System.in);
//			 int menu = sc.nextInt();
			 int menu = getInput();
			 if (menu==5) {
				 System.out.println("�����մϴ�");
				 break;
			 }
			 
			 System.out.print("ù��° ���ڸ� �Է����ּ��� :");
//			 int  num1 = sc.nextInt();
			 num1 = getInput();
			 System.out.print("�ι�° ���ڸ� �Է����ּ��� :");
//			 int num2 = sc.nextInt();
			 num2 = getInput();
			 Calculator3 calc = new Calculator3(); //clac �� Calculator3 Ŭ������ �ν��Ͻ�
			 if (menu ==1) {
				int a = calc.add(num1, num2);
				System.out.println("����� "+a);
			 }else if (menu==2) {
				 int b = calc.sub(num1,num2);
				 System.out.println("����� "+b);
			 }else if(menu==3) {
				 int c= calc.mul(num1, num2);
				 System.out.println("����� "+c);
			 }else if(menu ==4) {
				 float d= calc.div(num1, num2);
				 System.out.println("����� "+d);
//			 }else if (menu==5) {
//				 System.out.println("�����մϴ�");
//				 break;
			 }else {
				 System.out.println("�߸��Է��ϼ̽��ϴ�.");
			 }
	
	} 
	}

}