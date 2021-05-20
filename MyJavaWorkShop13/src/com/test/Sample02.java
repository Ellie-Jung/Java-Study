package com.test;

import java.util.*;

public class Sample02 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //순서o 중복 o 
		al.add(1);
		al.add("이순신");
		al.add(12.5);
		al.add(false);
		al.get(0);
		al.get(1);
		Object obj = al.get(0);
		System.out.println(obj.getClass().getName()); //객체에 대한 타입 알고자할때
		Object obj2 = al.get(3);
		System.out.println(obj2.getClass().getName());
		al.size();
		for(int inx =0; inx<al.size();inx++) {
			Object o = al.get(inx);
			System.out.println(o);
		}
		System.out.println("============");
		
		HashSet h = new HashSet(); //순서x 중복x
		h.add("홍길동");
		h.add("이순신");
		h.add("홍길동");
		
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//map은 순서 x중복 (키x 값o)
		
		
	}

}
