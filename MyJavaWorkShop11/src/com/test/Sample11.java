package com.test;

import java.util.*;

public class Sample11 {

	public static void main(String[] args) {
		ArrayList al =  new ArrayList();
//		List al2= new ArrayList(); //�������̽�Ÿ��
		al.add(100); //���� ������
		al.add(200);
		al.add(300);
		
		al.get(0); //�̾Ƴ��� ����Ҷ��� �̷��� ���
		al.get(1);
//		int size() // �÷��ǿ� ����� ������ ������ ��ȯ�Ѵ�..
		for(int inx = 0; inx < al.size();inx++) {
			al.get(inx);
			int a= (int)al.get(inx);
			System.out.println(a);
		}
		System.out.println("------------");
//		Iterator iterator �÷����� ���ͷ����ͻ���ؼ� �̾Ƴ�.�����ϰ� ����������
		Iterator itr = al.iterator();//ũ�⸦ ���� �̾Ƴ�������
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==========");
		LinkedList ll = new LinkedList();
		ll.add(300);
		ll.add(400);
		ll.add(500);
		Iterator itr2 = ll.iterator();//ũ�⸦ ���� �̾Ƴ�������
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}