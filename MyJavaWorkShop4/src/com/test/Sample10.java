package com.test;

public class Sample10 {

	public static void main(String[] args) {
		
		int[] arr;
		arr = new int[3];
		
		int[] arr2 = new int[4];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 100;
		arr2[3] = 300;
		
		for (int i =0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3= {10,20,100,300};
		for(int j : arr3) {
			System.out.println(j);
		}
		
		String[] names = new String[3];
		names[0] = "ÀÌ¼ø½Å";
		names[1] = "À»Áö¹®´ö";
		names[2]= "¼¼Á¾´ë¿Õ";
		
		for (int k =0; k < names.length; k++) {
			System.out.println(names[k]);
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		int[][] arr4 = new int[4][3];
		arr4[0][0] = 10;
		arr4[0][1] = 20;
		arr4[0][2] = 30;
		int[][] arr5 = {{1,2},{3,4}};
		
				
		
	}

}
