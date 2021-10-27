package level7;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String x= scanner.next();
		String y= scanner.next();
		
		String x1=String.valueOf(x.charAt(2))+String.valueOf(x.charAt(1))+String.valueOf(x.charAt(0));
		String y1=String.valueOf(y.charAt(2))+String.valueOf(y.charAt(1))+String.valueOf(y.charAt(0));
		
		
		System.out.println(Integer.parseInt(x1)>Integer.parseInt(y1)? x1: y1);
		
	}
}

