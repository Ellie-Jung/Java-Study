
package day1;

import java.util.Scanner;

public class Ex1s_StdIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ȳ��ϼ���, �ݰ�����");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("����� �̸���?");
		String name = sc.nextLine();
		
		System.out.println("����� ���̴�?");
		int age = sc.nextInt();
		
		System.out.println("����� Ű��?");
		double height = sc.nextDouble();
		
		System.out.println(name +"��, �ݰ�����");
		System.out.println(age + "�� �̽ñ���");
		System.out.println(height + "cm �̽ñ���");
		
		
	}

}
