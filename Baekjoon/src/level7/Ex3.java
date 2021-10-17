package level7;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String x = scanner.next();
		
		for(char c='a'; c<='z';c++) {
			System.out.print(x.indexOf(c)+" ");
		}
	
	}
}