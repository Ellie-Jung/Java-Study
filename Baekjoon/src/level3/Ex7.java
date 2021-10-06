package level3;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t=scanner.nextInt();
		
		

		for(int i=1;i<=t;i++) {
			System.out.println("Case #"+i+": "+(scanner.nextInt()+scanner.nextInt()));
		}
				
	}
	
}
