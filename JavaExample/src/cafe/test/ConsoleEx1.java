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
			if(input.equalsIgnoreCase("q")) break; //��ҹ��� ���� ���� ���ϱ�
			System.out.println(input);
			
		}

	}

}
