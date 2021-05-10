package com.test;

public class Sample09 {
	static int add(int x,int y) {
		return x+y;
	}
	static void test (String msg) {
		if(msg=="ok") {
			return;
		}
		System.out.println("Error");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = add(10,20);
		System.out.println(d);
		test("Error");
		test("ok");
	}

}
