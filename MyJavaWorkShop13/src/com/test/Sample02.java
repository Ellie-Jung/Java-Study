package com.test;

import java.util.*;

public class Sample02 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //����o �ߺ� o 
		al.add(1);
		al.add("�̼���");
		al.add(12.5);
		al.add(false);
		al.get(0);
		al.get(1);
		Object obj = al.get(0);
		System.out.println(obj.getClass().getName()); //��ü�� ���� Ÿ�� �˰����Ҷ�
		Object obj2 = al.get(3);
		System.out.println(obj2.getClass().getName());
		al.size();
		for(int inx =0; inx<al.size();inx++) {
			Object o = al.get(inx);
			System.out.println(o);
		}
		System.out.println("============");
		
		HashSet h = new HashSet(); //����x �ߺ�x
		h.add("ȫ�浿");
		h.add("�̼���");
		h.add("ȫ�浿");
		
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//map�� ���� x�ߺ� (Űx ��o)
		
		
	}

}
