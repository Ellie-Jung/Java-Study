package com.test;

public class Sample06 {

	public static void main(String[] args) {
		byte a = Byte.MAX_VALUE;
		int b= Integer.MAX_VALUE;
		System.out.println(a+"."+b);
		int c = a;  //byte -> int ����ȯ => implicit cast(�Ͻ����� ����ȯ)
		byte d = (byte)c ; //int ->byte => explicit cast(������� ����ȯ)
		//value type type cast
	}

}
