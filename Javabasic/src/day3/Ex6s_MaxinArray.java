package day3;

import java.util.Scanner;

public class Ex6s_MaxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("------------------------");
		System.out.println("Max �Ǻ���");
		System.out.println("------------------------");
	
		Scanner sc = new Scanner(System.in);
		
		int[ ] nums = new int[5];

		for (int i=0;i<nums.length;i++)
		{
			System.out.print(i+"��° ���ڸ� �Է��ϼ��� : ");
			nums[i] = sc.nextInt();
		}
	

		int max = nums[0];
		for(int i=1;i<nums.length;i++)
		{
			if(max<nums[i])
				max= nums[i];
		}
		
		

		
		System.out.println(">>>>���� ū ���ڴ�?"+max);
	}

}
