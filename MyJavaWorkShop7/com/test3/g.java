package com.test3;

import java.util.Scanner;

class Cal{
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	double div(int a, int b ) {
		return a/b;
	}
}

public class g {
	static int getNum() {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		return Integer.parseInt(inputString);
	}
	static String getF() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
	public static void main(String[] args) {
		Cal cal = new Cal();
		int num1,num2,result;
		for(;;) {
		System.out.println("#########�޴�########");
		System.out.println("#1. ��Ģ����         #");
		System.out.println("#2. ����            #");
		System.out.println("####################");
		System.out.print("# �׸��� �������ּ���. :");
		int menu = getNum();
		
		if(menu==2) {
			System.out.println("����");
			break;
		}
		System.out.print("�����ڸ� �����Ͻÿ�.(+,-,*,/): ");
		String sel =getF();
		switch(sel) {
		case "+" :
			System.out.print("ù ��° ���ڸ� �Է����ּ��� : ");
			 num1 = getNum();
			System.out.print("�� ��° ���ڸ� �Է����ּ��� : ");
			 num2 = getNum();
			result = cal.add(num1, num2);
			System.out.println("����� : "+num1+"+"+num2+"="+result);
			break;
		case "-" :
			System.out.print("ù ��° ���ڸ� �Է����ּ��� : ");
			 num1 = getNum();
			System.out.print("�� ��° ���ڸ� �Է����ּ��� : ");
			 num2 = getNum();
			 result = cal.sub(num1, num2);
			System.out.println("����� : "+num1+"-"+num2+"="+result);
			break;
		case "*":
			System.out.print("ù ��° ���ڸ� �Է����ּ��� : ");
			 num1 = getNum();
			System.out.print("�� ��° ���ڸ� �Է����ּ��� : ");
			 num2 = getNum();
			 result =cal.mul(num1, num2);
			System.out.println("����� : "+num1+"*"+num2+"="+result);
			break;
		case "/" :
			System.out.print("ù ��° ���ڸ� �Է����ּ��� : ");
			 num1 = getNum();
			System.out.print("�� ��° ���ڸ� �Է����ּ��� : ");
			 num2 = getNum();
			 result = (int) cal.div(num1, num2);
			System.out.println("����� : "+num1+"/"+num2+"="+result);
			break;
		
		
		}
		}
	
	}

}
