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
			 System.out.println("#1. 덧셈");
			 System.out.println("#2. 뺄셈");
			 System.out.println("#3. 곱셈");
			 System.out.println("#4. 나눗셈");
			 System.out.println("#5. 종료");
			 System.out.println("########################");
			 System.out.print("# 메뉴를 선택해주세요. : ");
			
//			 Scanner sc = new Scanner(System.in);
//			 int menu = sc.nextInt();
			 int menu = getInput();
			 if (menu==5) {
				 System.out.println("종료합니다");
				 break;
			 }
			 
			 System.out.print("첫번째 숫자를 입력해주세요 :");
//			 int  num1 = sc.nextInt();
			 num1 = getInput();
			 System.out.print("두번째 숫자를 입력해주세요 :");
//			 int num2 = sc.nextInt();
			 num2 = getInput();
			 Calculator3 calc = new Calculator3(); //clac 가 Calculator3 클래스의 인스턴스
			 if (menu ==1) {
				int a = calc.add(num1, num2);
				System.out.println("결과는 "+a);
			 }else if (menu==2) {
				 int b = calc.sub(num1,num2);
				 System.out.println("결과는 "+b);
			 }else if(menu==3) {
				 int c= calc.mul(num1, num2);
				 System.out.println("결과는 "+c);
			 }else if(menu ==4) {
				 float d= calc.div(num1, num2);
				 System.out.println("결과는 "+d);
//			 }else if (menu==5) {
//				 System.out.println("종료합니다");
//				 break;
			 }else {
				 System.out.println("잘못입력하셨습니다.");
			 }
	
	} 
	}

}
