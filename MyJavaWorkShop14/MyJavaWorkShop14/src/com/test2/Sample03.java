package com.test2;
//조건문 
import java.util.Scanner;

public class Sample03 {
	static int getInputValue() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {
		System.out.println("번호를 입력해주세요. ");
		int num = getInputValue();
		if(num ==0) {
			System.out.println("0입니다.");
		}else if(num ==1) {
			System.out.println("1입니다.");
		}else {
			System.out.println("0,1이 아닙니다.");
		}

		switch(num) {
		case 100:
			System.out.println("100입니다");
			break;
		case 200:
			System.out.println("200입니다.");
			break;
		}
		
//		int intValue1 = 123;
//		int intValue2 = -123;
//		String str1 = Integer.toString(intValue1);
//		String str2 = Integer.toString(intValue2);
//		System.out.println(str1);
//		System.out.println(str2);
//		int num1 = getInputValue();
//		String num2 = Integer.toString(getInputValue());
//		System.out.println(num2);
	
//		String aString =String.valueOf(getInputValue());
//	String aString = Integer.toString(getInputValue());
//		System.out.println(aString);
	}

}
