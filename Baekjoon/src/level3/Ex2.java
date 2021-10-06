package level3;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int t = scanner.nextInt();
	
	for(int j=0;j<t;j++) {
		System.out.println(scanner.nextInt()+scanner.nextInt());
	}
}
	
}
