package com.test;

public class Sample05 {

	public static void main(String[] args) {
		for( int i =1; i <=5; i++) {
			for( int j =1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		
		for (int k =1; k<=5;k++) {
			for (int h=5;h>=k;h--) {
				System.out.print(h);
			}
			System.out.println();
		}
	}

}
