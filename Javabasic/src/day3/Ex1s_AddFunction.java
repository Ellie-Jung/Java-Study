package day3;

import java.util.Scanner;

public class Ex1s_AddFunction {
	
		static int addNum(int a, int b) 
		{
			System.out.println("���ϱ��Լ�");
			int result;
			result = a+b;
			return result;
		}
	
		static int subNum(int a, int b)
		{
			System.out.println("�����Լ�");
			int result;
			result = a-b;
			return result;
		}
		
		static int multipleNum(int a, int b)
		{
			System.out.println("���ϱ��Լ�");
			int result;
			result = a*b;
			return result;
		}
		
		static float devideNum(float a, float b)
		{
			if (b==0)
			{
				System.out.println("0���� ������ �����ϴ�.");
			}
			System.out.println("�������Լ�");
			float result;
			result = a/b;
			return result;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 System.out.println("------------");
	 System.out.println("���հ���");
	 System.out.println("------------");
	 
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("ù��° ���ڸ� �Է��ϼ���.");
	 int x = sc.nextInt();
	
	 System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
	 int y = sc.nextInt();
		
	 int c= addNum(x,y);
	 System.out.println(c);
	 
	 int d= subNum(x,y);
	 System.out.println(d);
	 
	 int e = multipleNum(x,y);
	 System.out.println(e);
	 
	 float f= devideNum(x,y);
	 System.out.println(f);
	 
		
	
	}
}
