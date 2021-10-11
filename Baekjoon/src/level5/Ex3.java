package level5;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		String mul=(a*b*c)+"";
		
		String[] x=mul.split("");
		
		for(int i=0;i<10;i++) {
			int y=0;
			for(int j=0;j<x.length;j++) {
				if(i==(Integer.parseInt(x[j]))) {
					y++;
				}
			}
			System.out.println(y);
		}
	}
}
