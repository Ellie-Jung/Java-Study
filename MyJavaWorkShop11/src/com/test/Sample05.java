package com.test;

import java.lang.reflect.Method;

class MyClass{
	String name;
	void myMethod() {}
}
public class Sample05 {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		Class c = m.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());

		Method[] methods = c.getMethods();
		for(int inx= 0;inx<methods.length;inx++) {
			System.out.println(methods[inx].getName());
		}
	}

}
