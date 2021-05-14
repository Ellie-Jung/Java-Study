package com.test2;
class MyException2 extends Exception{
	public MyException2(String msg) {
		super(msg);
	}
}
public class Sample04 {

	public static void main(String[] args) {
		try {
			throw new MyException2("æ»≥Á«œººø‰");
		}catch(MyException2 e){
			System.out.println(e.getMessage());
		}

	}

}
