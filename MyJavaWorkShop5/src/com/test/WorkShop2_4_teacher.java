package com.test;
public class WorkShop2_4_teacher {

	public static void main(String[] args) {
		
		String[][]students= {
				{"A","B","A","C","C","D","E","F","A","D"},
				{"D","B","A","B","C","A","E","F","A","D"},
				{"E","D","D","A","C","B","E","E","A","D"},
				{"C","B","A","E","D","D","E","F","A","D"},
				{"A","B","D","C","C","D","E","E","A","D"}
		};
		 
		String[] answer = {"D","B","D","C","C","D","A","E","A","D"};
		
		
		for (int i = 0; i< students.length; i++) {
			int count= 0;
			for( int j = 0;j <students[i].length;j++) {
				
				if(students[i][j]==answer[j]) {
					count++;
					
				}
				
			}
			System.out.println();
			System.out.printf("student %d는 %d 점입니다.",i+1,count);
		}

	}

}
