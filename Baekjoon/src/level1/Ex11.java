package level1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a= sc.next();
		String b= sc.next();
		
		char[] bb=b.toCharArray();
		String b0=bb[0]+"";
		String b1=bb[1]+"";
		String b2=bb[2]+"";
		
		System.out.println(Integer.parseInt(b2)*Integer.parseInt(a));
		System.out.println(Integer.parseInt(b1)*Integer.parseInt(a));
		System.out.println(Integer.parseInt(b0)*Integer.parseInt(a));
		System.out.println(Integer.parseInt(b)*Integer.parseInt(a));
		
	}

}
