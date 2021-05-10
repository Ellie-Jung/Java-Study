package com.test;

public class Sample11 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][];
		arr[0] = new int[] {1,2,3};
		arr[1] = new int [] {1,2,3,4};
		arr[2] = new int [] {1,2};
		arr[3] = new int [] {1};
		arr[4] = new int [] {1,2,3,4,5};
		
		int[][] arr2 = {
				{1,2,3},
				{1,2,3,4},
				{1,2},
				{1},
				{1,2,3,4,5}
				
		};
		for (int i=0; i<arr2.length;i++) {
			for(int j =0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}

	}

}
