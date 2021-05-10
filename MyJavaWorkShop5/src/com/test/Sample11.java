package com.test;
class Calculator2{
	int add(int a, int b){
		return a+b;
	}
	int subtract(int a, int b) {
		return a-b;
	}
	int multiply(int a, int b) {
		return a*b;
	}
	float divide(int a, int b) {
		return a/b;
	}
	
}
public class Sample11 {

	public static void main(String[] args) {
		Calculator2 calc= new Calculator2();
		int x = 10;
		int y= 2;
		int c = calc.add(x,y);
		System.out.println(c);
		int d = calc.subtract(10,7);
		System.out.println(d);
		int e = calc.multiply(x,y);
		System.out.println(e);
		System.out.println(calc.divide(x, y));
	}

}
