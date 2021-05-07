package day1;

import java.util.Scanner;

public class Ex4s_CheckGradeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------------");
		System.out.println("학점알리미");
		System.out.println("--------------------");
		
		Scanner sc  = new Scanner(System.in);
		
		int num;
		while(true)
		
			{System.out.println("점수를 입력하시요(0점이면 종료)");
			
		   num = sc.nextInt();
		    
		   if(num==0)
			   {System.out.println("0점입니다. 바이바이");
			   break;
			   }
		   if(num>=90)
		    	System.out.println("A학점입니다.");
		    else if(num>=80)
		    	System.out.println("B학점입니다.");
		    else if(num>=70)
		    	System.out.println("C학점입니다.");
		    else if(num>=60)
		    	System.out.println("D학점입니다.");
		    else
		    	System.out.println("F학점입니다.");
			
			}
	}

}
