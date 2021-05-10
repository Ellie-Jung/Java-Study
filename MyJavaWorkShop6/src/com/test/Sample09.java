package com.test;
import com.test2.MyClass;
public class Sample09 {

	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		m.add(1, 2);
		int r = m.add(1, 2);
		System.out.println(r);
		
	}

}
