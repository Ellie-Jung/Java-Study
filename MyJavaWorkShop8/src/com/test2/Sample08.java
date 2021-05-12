package com.test2;
import com.test.*; //클래스 여러개를 선택시에 *이라고 함.전체선택. 하나 선택하면 com.test.Calc (클래스이름)
public class Sample08 {

	public static void main(String[] args) {
		int c = Calc.add(1, 2);
		System.out.println(c);
		Calc2 c2;
	}

}
