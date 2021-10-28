package level7;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String x= scanner.nextLine().trim();
	
		String[] arr= x.split(" ");
		
		if(x.length()==0) {
			System.out.println(0);
		}else {
			System.out.println(arr.length);
		}
	}
}

