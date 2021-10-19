package level7;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int count = scanner.nextInt();
		int count2;
		String x;
		for(int i=0; i<count;i++) {
			count2=scanner.nextInt();
			x = scanner.next();
			for(int j=0;j<x.length();j++) {
				for(int k=0;k<count2;k++) {
					System.out.print(x.charAt(i));
				}
				System.out.println();
			}
		}
	}
}

