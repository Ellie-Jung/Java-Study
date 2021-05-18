package com.test;

public class Sample10 {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4};
		int temp;
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for (int inx =0; inx <arr.length-1;inx++) {
				System.out.println(arr[inx]);
				if(arr[inx]>arr[inx+1]) {
					temp = arr[inx];
					arr[inx] = arr[inx+1];
					arr[inx+1]= temp;
					sorted = false;
				}
			}
		}
		for(int a :arr) {
			System.out.println(a);
		}
	}

}
