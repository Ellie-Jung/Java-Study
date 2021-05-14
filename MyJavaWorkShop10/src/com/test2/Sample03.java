package com.test2;
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
		 
	}
}
public class Sample03 {
	static void checkMethod(int num) {
		try {
			throw new MyException("나의 오류입니다.");
		} catch (MyException e) {
			
			System.out.println("오류입니다.");
		}
		
//		if( num%2 ==0) {
//		
//			throw new MyException("나의 예외처리입니다.");
//		}
	}
	public static void main(String[] args) {
		checkMethod(1);
//		checkMethod(2);
		Exception ex = new Exception("테스트");
		try {
			throw ex;
		} catch (Exception e) {
			System.out.println(ex.getMessage());
		
		}
	}

}
