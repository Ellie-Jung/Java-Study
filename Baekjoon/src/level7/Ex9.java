package level7;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		int time=0;
		char tmp;
		
		for(int i=0; i<string.length(); i++) {
			tmp= string.charAt(i);
			
			if(tmp>='A' && tmp <='C') time +=3;
			else if(tmp >='D' && tmp <= 'F') time +=4;
			else if(tmp >='G' && tmp <='I') time +=5;
			else if(tmp >='J' && tmp <='L') time +=6;
			else if(tmp >='M' && tmp <='O') time +=7;
			else if(tmp >='P' && tmp <='S') time +=8;
			else if(tmp >='T' && tmp <='V') time +=9;
			else if(tmp >='W' && tmp <='Z') time +=10;
		}
		System.out.println(time);
		
		
	}
	
}
