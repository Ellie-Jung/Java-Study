package level5;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		for(int i=0; i<num;i++) {
			
			int student= sc.nextInt();
			int sum = 0;
			int t=0;
			 int[] z = new int[student];
			 
			 for(int j=0; j<student; j++) {
				 int point = sc.nextInt();
				 z[j]= point;
				 sum+=point;
				 
			 }
			 double y= sum/student;
			 
			 for(int k=0; k<student; k++) {
				 if(z[k]>y) {
					 t++;
				 }
			 }
			 double p=(double)t/student*100;
			 System.out.printf("%.3f%%\n",p); // %% 해야 %라는 문자열 출력
		}
	
	}
}