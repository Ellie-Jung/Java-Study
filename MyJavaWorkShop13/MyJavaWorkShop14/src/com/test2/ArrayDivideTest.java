package com.test2;

public class ArrayDivideTest {

	public static void main(String[] args) {

		int[] arrayOne = {10, 20,13,25};
		int [] arrayTwo = {2,5,0,3,1,7};
		
		int length = (arrayOne.length > arrayTwo.length)? arrayOne.length: arrayTwo.length;
		for (int i =0 ; i < length; i++) {
		try {
			
//			for (int i =0 ; i < length; i++) {
					if( arrayTwo[i] ==0) { throw new ArithmeticException("나누기 연산시 에러가 발생하였습니다."); }
					System.out.println(arrayOne[i]/arrayTwo[i]);
				
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("인덱스 범위를 벗어나는 값에 접근하였습니다.");
		}
	}
	}

}
