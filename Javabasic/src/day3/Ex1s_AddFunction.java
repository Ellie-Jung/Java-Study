package day3;

import java.util.Scanner;

public class Ex1s_AddFunction {
	
		static int addNum(int a, int b) 
		{
			System.out.println("더하기함수");
			int result;
			result = a+b;
			return result;
		}
	
		static int subNum(int a, int b)
		{
			System.out.println("빼기함수");
			int result;
			result = a-b;
			return result;
		}
		
		static int multipleNum(int a, int b)
		{
			System.out.println("곱하기함수");
			int result;
			result = a*b;
			return result;
		}
		
		static float devideNum(float a, float b)
		{
			if (b==0)
			{
				System.out.println("0으로 나눌수 없습니다.");
			}
			System.out.println("나누기함수");
			float result;
			result = a/b;
			return result;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 System.out.println("------------");
	 System.out.println("종합계산기");
	 System.out.println("------------");
	 
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("첫번째 숫자를 입력하세요.");
	 int x = sc.nextInt();
	
	 System.out.println("두번째 숫자를 입력하세요.");
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
