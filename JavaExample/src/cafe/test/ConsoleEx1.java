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
			if(input.equalsIgnoreCase("q")) break; //q또는 Q를 입력하면 실행 종료한다.
			System.out.println(input);
			
		}

	}

}
