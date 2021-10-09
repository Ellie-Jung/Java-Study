package level4;

import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	
	while(scanner.hasNext()) {
		String x= scanner.nextLine();
		String[] y =x.split(" ");
		
		System.out.println(Integer.parseInt(y[0])+Integer.parseInt(y[1]));
	}
}
}
