package level7;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int x= scanner.nextInt();
		String y[] = new String [x];
		int sum=0;
		String z= scanner.next();
		y=z.split("");
		for(int i=0;i<y.length;i++) {
			sum+=Integer.parseInt(y[i]);
		}
		System.out.println(sum);
	}
}