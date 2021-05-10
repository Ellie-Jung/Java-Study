package com.test;

public class Sample03 {

	public static void main(String[] args) {
		
//		for ( int i = 0; i<=10; i++) {
//			System.out.println(i);
//		}
//		for (int j = 2; j < 10; j++) {
//			System.out.println(j);
//			System.out.println();
//			for (int k = 1; k <=9; k++) {
//				System.out.println(k);
//			}
//			System.out.println();
//		}
		//구구단
		for (int i =1; i<=9; i++) {
			System.out.println("1단");
			for(int j=1; j<=9;j++) {
	//			System.out.println(i +"*"+ j +"="+ i*j);
				System.out.printf("%d * %d = %d%n",i,j,i*j);
			}
			System.out.println();
		}
		
		
	}

}
