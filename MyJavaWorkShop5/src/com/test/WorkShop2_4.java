package com.test;
public class WorkShop2_4 {

	public static void main(String[] args) {
		
//		String[][]mark= {
//				{"A","B","A","C","C","D","E","F","A","D"},
//				{"D","B","A","B","C","A","E","F","A","D"},
//				{"E","D","D","A","C","B","E","E","A","D"},
//				{"C","B","A","E","D","D","E","F","A","D"},
//				{"A","B","D","C","C","D","E","E","A","D"},
//				{"D","B","D","C","C","D","A","E","A","D"}
//		};
//		
		char[][]mark= {
				{'A','B','A','C','C','D','E','F','A','D'},
				{'D','B','A','B','C','A','E','F','A','D'},
				{'E','D','D','A','C','B','E','E','A','D'},
				{'C','B','A','E','D','D','E','F','A','D'},
				{'A','B','D','C','C','D','E','E','A','D'},
				{'D','B','D','C','C','D','A','E','A','D'}
		};
		
		int [] std = {0,0,0,0,0};
//	if (args.length==10) {}
		
		
		for(int i =0; i<mark.length-1; i++ ) {
			for(int j=0;j <mark[i].length-1;j++) {
				if(mark[5][j]==mark[i][j]) {
					std[i]++;
				}
			}
		}
		int num=1;
		for(int score : std) {
			System.out.println("학생"+ num +"의 점수"+score+"점");
			num++;
		}
	
	}

}
