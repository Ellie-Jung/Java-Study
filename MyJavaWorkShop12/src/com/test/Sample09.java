package com.test;

public class Sample09 {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		a.compareTo(b); //a�� b�� ��. ������ ũ�� -1(����), ������ 0, �������� ũ�� 1(���)
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(a));
		System.out.println(b.compareTo(a));
		String c = "c";
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		
		
	}
	

}
