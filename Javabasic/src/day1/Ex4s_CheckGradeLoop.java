package day1;

import java.util.Scanner;

public class Ex4s_CheckGradeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------------");
		System.out.println("�����˸���");
		System.out.println("--------------------");
		
		Scanner sc  = new Scanner(System.in);
		
		int num;
		while(true)
		
			{System.out.println("������ �Է��Ͻÿ�(0���̸� ����)");
			
		   num = sc.nextInt();
		    
		   if(num==0)
			   {System.out.println("0���Դϴ�. ���̹���");
			   break;
			   }
		   if(num>=90)
		    	System.out.println("A�����Դϴ�.");
		    else if(num>=80)
		    	System.out.println("B�����Դϴ�.");
		    else if(num>=70)
		    	System.out.println("C�����Դϴ�.");
		    else if(num>=60)
		    	System.out.println("D�����Դϴ�.");
		    else
		    	System.out.println("F�����Դϴ�.");
			
			}
	}

}
