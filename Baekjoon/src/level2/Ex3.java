package level2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		
		if((a%100!=0 && a%400==0) || (a%400==0&&a%4==0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
