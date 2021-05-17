package com.test;

import java.util.*;

public class Sample11 {

	public static void main(String[] args) {
		ArrayList al =  new ArrayList();
//		List al2= new ArrayList(); //인터페이스타입
		al.add(100); //값을 넣을때
		al.add(200);
		al.add(300);
		
		al.get(0); //뽑아내서 사용할때는 이렇게 사용
		al.get(1);
//		int size() // 컬렉션에 저장된 개게의 개수를 반환한다..
		for(int inx = 0; inx < al.size();inx++) {
			al.get(inx);
			int a= (int)al.get(inx);
			System.out.println(a);
		}
		System.out.println("------------");
//		Iterator iterator 컬렉션의 이터레이터사용해서 뽑아냄.더편하게 뽑을수있음
		Iterator itr = al.iterator();//크기를 몰라도 뽑아낼수있음
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==========");
		LinkedList ll = new LinkedList();
		ll.add(300);
		ll.add(400);
		ll.add(500);
		Iterator itr2 = ll.iterator();//크기를 몰라도 뽑아낼수있음
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
