package com.test;

import java.util.Scanner;

class Calculator3{
	
	static int add(int a, int b){
		return a+b;
	}
	static int sub(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static float div(int a, int b) {
		return a/b;
	}
}
public class Quiz01 {

	public static void main(String[] args) {
		
		int num1, num2;
		String sel;
		Scanner scanner = new Scanner(System.in);
//		Calculator3 calc = new Calculator3(); 
		for(;;) {
		
			System.out.println("########################");
			 System.out.println("#1. 사칙연산");
			 System.out.println("#2. 종료");		 
			 System.out.println("########################");
			 System.out.print("# 항목 선택해주세요. : ");
			
			 int menu = scanner.nextInt();
			 if (menu==2) {
				 System.out.println("종료합니다");
				 break;
			 }
		
				 System.out.println("연산자를 선택해주세요(1(+),2(-),3(*),4(/)) :");
				 sel = scanner.nextLine();
				 System.out.print("첫번째 숫자를 입력해주세요 :");
				  num1 = scanner.nextInt();
				 System.out.print("두번째 숫자를 입력해주세요 :");
				  num2 = scanner.nextInt();
				
				 if (sel =="+") {
					int a = Calculator3.add(num1, num2);
					System.out.println("결과는 :"+num1+"+"+num2+"="+a);
				 }else if (sel =="-") {
					 int b = Calculator3.sub(num1,num2);
					 System.out.println("결과는 "+num1+"-"+num2+"="+b);
				 }else if(sel =="*") {
					 int c= Calculator3.mul(num1, num2);
					 System.out.println("결과는 "+num1+"*"+num2+"="+c);
				 }else if(sel =="/") {
					 float d= Calculator3.div(num1, num2);
					 System.out.println("결과는 "+num1+"/"+num2+"="+d);		
				 }
			 
				 }
	
	}

}
