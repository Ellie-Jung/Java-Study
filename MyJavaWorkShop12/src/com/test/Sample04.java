package com.test;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample04 {

	public static void main(String[] args) {
		LinkedList  ll = new LinkedList();
		ll.add(1);
		ll.add("이순신");
		ll.add(1.3);
		for (Object o : ll) {
			System.out.println(o);
		}
		System.out.println();
		ll.add(0,"세종대왕");
		ll.addFirst("이황");
		ll.addLast("정약용");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
