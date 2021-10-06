package level3;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String x =scanner.nextLine();
		String[] x1=x.split(" ");
		int n= Integer.parseInt(x1[0]);
		int k=Integer.parseInt(x1[1]);
		
		String y= scanner.nextLine();
		String[] z= y.split(" ");
		
		for(int i=0; i<n;i++) {
			if(Integer.parseInt(z[i])<k) {
				System.out.print(z[i]+" ");
			}
		}
		
		
		
		
	}
}
