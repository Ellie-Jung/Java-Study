package com.test;

public class Sample02 {
	static int add(int x, int y) {
		int z = x +y ;
		return z;
	}
	static int add (int x, int y, int z) {
		int w = x + y+ z;
		return w ;
	}
	public static void main(String[] args) {
		int a = add(1,2,3);
		int b = add(1,2);
		System.out.println(a);
		System.out.println(b);

	}

}
