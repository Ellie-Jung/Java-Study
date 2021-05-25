package com.test2;
//배열 //다차원배열
public class Sample05 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		int [] arr2 = new int[] {1,2,3,4};
		int [] arr3 = {1,2,3,4,5};

		String [] names = new String[2];
		names[0] = "이순신";
		names[1] = "세종대왕";
		for(int inx =0; inx< names.length ; inx++) { //뽑아낼때 1.
			System.out.println(names[inx]);
		}
		for (String s : names) { //뽑아낼때 2.
			System.out.println(s);
		}
		
		//다차원배열
		int [][] arr4 = {{1,2},{3,4}};
		for(int i = 0; i < arr4.length ; i ++) { //뽑아내기 
			for(int j =0; j<arr4[i].length; j++) {
				System.out.println(arr4[i][j]);
			}
			
		}
	}

}
