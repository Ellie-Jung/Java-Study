package level3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(x +" * "+ i  +" = "+x*i);
		}
		
	}
	
}
