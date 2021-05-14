package com.test2;
class Test extends Exception{
	Test(String msg){
		super(msg);
	}
}
public class Sample06 {

	public static void main(String[] args) {
		int a = 0;
		try {
			//		int a = 10/0;
			if( a==0) {
//				throw new Test();
				throw new Test("오류에요");
			}
		}catch(Test e) {
			System.out.println("Test");
			System.out.println(e.getMessage());
		}


	}

}
