package com.test2;
interface ICalculator{
	public int add(int a , int b);
}
public class Sample01 {

	public static void main(String[] args) {

		ICalculator d = 
				new ICalculator() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		int c = d.add(10, 20);
		System.out.println(c);
		///위에거를 밑처럼 변경가능
		ICalculator d2 = (a1,a2) ->{
			return a1+a2;
		};
		int c2 = d2.add(30, 40);
		System.out.println(c2);
	}

}
