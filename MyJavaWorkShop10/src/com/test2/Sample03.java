package com.test2;
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
		 
	}
}
public class Sample03 {
	static void checkMethod(int num) {
		try {
			throw new MyException("���� �����Դϴ�.");
		} catch (MyException e) {
			
			System.out.println("�����Դϴ�.");
		}
		
//		if( num%2 ==0) {
//		
//			throw new MyException("���� ����ó���Դϴ�.");
//		}
	}
	public static void main(String[] args) {
		checkMethod(1);
//		checkMethod(2);
		Exception ex = new Exception("�׽�Ʈ");
		try {
			throw ex;
		} catch (Exception e) {
			System.out.println(ex.getMessage());
		
		}
	}

}
