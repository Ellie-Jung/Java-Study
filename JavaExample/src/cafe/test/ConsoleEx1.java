package cafe.test;

import java.util.Scanner;

public class ConsoleEx1 {

	public static void main(String[] args) {
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
//			if(input.equals("q") || input.equals("Q")) break;
			if(input.equalsIgnoreCase("q")) break; //대소문자 구분 없이 비교하기
			System.out.println(input);
			
		}

	}

}
