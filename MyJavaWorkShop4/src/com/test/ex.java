package com.test;

public class ex {

	public static void main(String[] args) {
		int [][] std_score = {
				{1,3,1,4,3,1,4,3,5,4},
				{3,5,2,1,2,5,4,5,2,1},
				{1,3,4,4,3,1,1,1,3,3},
				{4,1,2,2,2,1,4,2,4,2},
				{1,3,2,4,5,2,3,4,5,1}
		};
		int [] std = {0,0,0,0,0};
		
		if(args.length == 10) {
			int in1 = Integer.parseInt(args[0]);
			int in2 = Integer.parseInt(args[1]);
			int in3 = Integer.parseInt(args[2]);
			int in4 = Integer.parseInt(args[3]);
			int in5 = Integer.parseInt(args[4]);
			int in6 = Integer.parseInt(args[5]);
			int in7 = Integer.parseInt(args[6]);
			int in8 = Integer.parseInt(args[7]);
			int in9 = Integer.parseInt(args[8]);
			int in10 = Integer.parseInt(args[9]);
			int in[]= {in1,in2,in3,in4,in5,in6,in7,in8,in9,in10};
			
			for(int i =0;i<5;i++) {
				for (int j=0;j<10;j++) {
					if (in[j]==std_score[i][j])
						std[i]++;
				}
			}
			int num = 1;
			for(int score : std) {
				System.out.println("학생"+ num +"의 점수"+score+"점");
				num++;
			}
		}
		else
			System.out.println("정답의 개수가 맞지 않습니다.");
	}

}
