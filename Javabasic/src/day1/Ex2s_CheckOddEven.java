package day1;

import java.util.Scanner;

public class Ex2s_CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------------");
		System.out.println("Ȧ�� ¦�� ������");
		System.out.println("------------------");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		int num= sc.nextInt();
		
		if(num%2==0)
			System.out.println("�� ¦���Դϴ�.");
		else
			System.out.println("�� Ȧ���Դϴ�.");
	}

}
