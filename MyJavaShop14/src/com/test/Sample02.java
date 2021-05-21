package com.test;

interface ICalculator {
	abstract int add(int x, int y);
	
}

public class Sample02 {

	public static void main(String[] args) {
		ICalculator calculator = new ICalculator() {
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		int c =calculator.add(30, 50);
		System.out.println(c);
		
		ICalculator calculator2 = (a,b) -> {
			return a+b;
		};
		int d = calculator2.add(30, 100);
		System.out.println(d);
	}

}
