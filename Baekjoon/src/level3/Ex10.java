package level3;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t=scanner.nextInt();
		
		for(int i=1; i<=t;i++) {
			for(int j=t;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
}
