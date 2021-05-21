package com.test2;
//반복문
public class Sample04 {

	public static void main(String[] args) {

		int sum =0;	
		for (int jnx = 0; jnx <10 ; jnx++) {
			sum += jnx;
		}
		System.out.println(sum);
		int inx = 0;
		int sum2 = 0;
		while (inx <=10) {
			sum2 += inx;
			inx++;
		}
		System.out.println(sum2);
		System.out.println();
		for(int knx =0; knx <=100; knx++) {
			if (knx ==55) {
				break; //루프를 빠져나감  //continue를 쓰면 55만 수행안하고 처음으로 돌아가서 다시 루프 수행. 
			}
			System.out.println(knx);
		}
		
	}
	

}
