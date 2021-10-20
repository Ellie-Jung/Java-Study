package level7;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String x= scanner.next().toUpperCase();
		
		int[] count= new int[26];
		
		int max=0;
		char answer='?';
		for(int i=0; i<x.length(); i++) {
			count[x.charAt(i)-'A']++;
			
			if(max<count[x.charAt(i)-'A']) {
				max=count[x.charAt(i)-'A'];
				answer=x.charAt(i);
			}else if(max==count[x.charAt(i)-'A']) {
				answer='?';
			}
		}
		System.out.println(answer);
		
	}
}

