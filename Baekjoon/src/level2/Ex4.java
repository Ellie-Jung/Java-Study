package level2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int x= scanner.nextInt();
		int y= scanner.nextInt();
		
		if(x>0 && y>0) {
			System.out.println(1);
		}else if(x<0 && y>0) {
			System.out.println(2);
		}else if(x<0 && y<0) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}
		

}
