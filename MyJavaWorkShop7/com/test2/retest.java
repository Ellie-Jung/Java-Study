package com.test2;

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

	
public class retest {
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
		System.out.println("#########메뉴########");
		System.out.println("#1. 사칙연산         #");
		System.out.println("#2. 종료            #");
		System.out.println("####################");
		System.out.print("# 항목을 선택해주세요. :");
		int menu = getNum();
		System.out.print("연산자를 선택하시오.(+,-,*,/): ");
		String sel =getF();
		
	if(menu==1) {
		if (sel =="*") {
			System.out.print("첫 번째 숫자를 입력해주세요 : ");
			 num1 = getNum();
			System.out.print("두 번째 숫자를 입력해주세요 : ");
			 num2 = getNum();
			result = cal.add(num1, num2);
			System.out.println("결과는 : "+num1+"+"+num2+"="+result); 
		}else if(sel =="+") {
			System.out.print("첫 번째 숫자를 입력해주세요 : ");
			 num1 = getNum();
			System.out.print("두 번째 숫자를 입력해주세요 : ");
			 num2 = getNum();
			result = cal.sub(num1, num2);
			System.out.println("결과는 : "+num1+"-"+num2+"="+result);
		}else if (sel =="*") {
			System.out.print("첫 번째 숫자를 입력해주세요 : ");
			 num1 = getNum();
			System.out.print("두 번째 숫자를 입력해주세요 : ");
			 num2 = getNum();
			result = cal.mul(num1, num2);
			System.out.println("결과는 : "+num1+"*"+num2+"="+result);
		}else if(sel =="/") {
			System.out.print("첫 번째 숫자를 입력해주세요 : ");
			 num1 = getNum();
			System.out.print("두 번째 숫자를 입력해주세요 : ");
			 num2 = getNum();
			result= (int) cal.div(num1, num2);
			System.out.println("결과는 : "+num1+"/"+num2+"="+result);
			
		}
		}
	}
		
		
		
		
	}


