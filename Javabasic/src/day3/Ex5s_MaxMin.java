package day3;

import java.util.Scanner;

public class Ex5s_MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------------------");
		System.out.println("Max �Ǻ���");
		System.out.println("------------------------");
	
		Scanner sc = new Scanner(System.in);
				
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		System.out.print("����° ���ڸ� �Է��ϼ��� : ");
		int c = sc.nextInt();
		
		int max =a;
		if(max <b)
			max = b;
		if (max<c)
			max=c;
		
		System.out.println(">>>>���� ū ���ڴ�?"+max);
		
	}

}
