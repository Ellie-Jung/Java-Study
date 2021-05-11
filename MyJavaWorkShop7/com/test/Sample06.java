package com.test;

public class Sample06 {

	public static void main(String[] args) {
		byte a = Byte.MAX_VALUE;
		int b= Integer.MAX_VALUE;
		System.out.println(a+"."+b);
		int c = a;  //byte -> int 형변환 => implicit cast(암시적인 형변환)
		byte d = (byte)c ; //int ->byte => explicit cast(명시적인 형변환)
		//value type type cast
	}

}
