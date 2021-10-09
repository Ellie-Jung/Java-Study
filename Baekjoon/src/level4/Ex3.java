package level4;

import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	
	/*
	 * String x1=scanner.nextLine(); if(x1.length()==1) { x1=0+x1; }
	 * 
	 * int n=0;
	 * 
	 * String x=x1;
	 * 
	 * while(true) {
	 * 
	 * 
	 * 
	 * if(x.length()==1) { x=0+x; } String k=x.substring(0,1); String
	 * q=x.substring(1); String y=(Integer.parseInt(k)+Integer.parseInt(q))+"";
	 * if(y.length()==1) { y=0+y; } String r=y.substring(1); String z=q+r; n++;
	 * 
	 * if(x1.equals(z.trim())) { System.out.println(n); break; }
	 * 
	 * x=z;
	 * 
	 * }
	 * 
	 */
	
	int a= scanner.nextInt();
	int b=a;
	int c=0;
	
	do {
		b=(b%10)*10+(b/10+b%10)%10;
		c++;
	}while(a !=b);
		System.out.println(c);
	
}
}
