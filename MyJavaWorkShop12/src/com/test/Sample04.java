package com.test;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample04 {

	public static void main(String[] args) {
		LinkedList  ll = new LinkedList();
		ll.add(1);
		ll.add("�̼���");
		ll.add(1.3);
		for (Object o : ll) {
			System.out.println(o);
		}
		System.out.println();
		ll.add(0,"�������");
		ll.addFirst("��Ȳ");
		ll.addLast("�����");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
