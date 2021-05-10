package com.test2;

public class MyClass {
	public int add(int a, int b) {
		return a+b ;
	}
	int add(int a, int b, int c ) {
		return a + b;
	}
	private String add (String s, String t) {
		return s + t;
	}
	private void testMethod() {
		add("안녕하세요", "이순신");
	}

}
