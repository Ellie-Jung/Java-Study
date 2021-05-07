
package day1;

import java.util.Scanner;

public class Ex1s_StdIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("안녕하세요, 반가워요");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("당신의 이릉은?");
		String name = sc.nextLine();
		
		System.out.println("당신의 나이는?");
		int age = sc.nextInt();
		
		System.out.println("당신의 키는?");
		double height = sc.nextDouble();
		
		System.out.println(name +"님, 반가워요");
		System.out.println(age + "살 이시군요");
		System.out.println(height + "cm 이시군요");
		
		
	}

}
