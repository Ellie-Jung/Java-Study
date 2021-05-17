package com.test;

public class Sample08 {

	public static void main(String[] args) {
		//value -> reference 타입으로 바꿔즘(boxing)
		int a = 10;
		Integer i =  Integer.valueOf(a);
		Object o = i;
		
		i.toString();
		i.hashCode();
		System.out.println(a);
		System.out.println(i);
		System.out.println(o);
		Integer i2 = new Integer(100);
		System.out.println(i2.toString());
		///reference -> value  (unboxing)
		int c  = i.intValue();
		System.out.println(c);
		
		
	}

}
