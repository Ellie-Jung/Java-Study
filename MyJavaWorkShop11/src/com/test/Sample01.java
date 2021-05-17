package com.test;
class MyCustomException extends Exception{
	public MyCustomException(String msg) {
		super(msg);
	}
}
public class Sample01 {

	public static void main(String[] args) throws MyCustomException {
		int a =10;
		if(a==10) {
			try {
			throw new MyCustomException("a ==10¿Ã ∞∞¥Ÿ");
		}catch(MyCustomException e) {
			System.out.println(e.getMessage());}
		}

	}

}
