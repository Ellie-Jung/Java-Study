package level3;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t=scanner.nextInt();
		
		
		for(int i=1;i<=t;i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			System.out.println("Case #"+i+": "+x+" + "+y+" = "+(x+y));
		}
				
	}
}
