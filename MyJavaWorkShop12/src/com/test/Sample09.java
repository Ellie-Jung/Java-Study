package com.test;

public class Sample09 {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		a.compareTo(b); //a와 b를 비교. 왼쪽이 크면 -1(음수), 같으면 0, 오른쪽이 크면 1(양수)
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(a));
		System.out.println(b.compareTo(a));
		String c = "c";
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		
		
	}
	

}
