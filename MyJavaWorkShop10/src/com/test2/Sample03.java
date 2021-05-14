package com.test2;
class MyException extends Exception{
	public MyException(String msg) {
		
	}
}
public class Sample03 {
	static void checkMethod(int num) {
		if( num%2 ==0) {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args) {
		checkMethod(1);
//		checkMethod(2);
		Exception ex = new Exception("Å×½ºÆ®");
		try {
			throw ex;
		} catch (Exception e) {
			System.out.println(ex.getMessage());
		
		}
	}

}
