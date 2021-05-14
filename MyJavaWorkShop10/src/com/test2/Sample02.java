package com.test2;

public class Sample02 {
	void method1() throws Exception{
//		throw new Exception();
		int a = 10/0;
	}
	void method2() throws Exception{
		method1();
	}
	void method3() throws Exception{
		method2();
	}
	public static void main(String[] args) {
		Sample02 obj = new Sample02();
		try{
			obj.method3();
		}catch(Exception ex){
			System.out.println("Exit");
		}

	}

}
