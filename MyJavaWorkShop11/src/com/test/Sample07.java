package com.test;

public class Sample07 {

	public static void main(String[] args) {
		String msg1 = "�̼���";
		String msg2 = "������";
		String msg3 = msg1 + msg2;
		System.out.println(msg3);
		
		StringBuffer sb = new  StringBuffer("�̼���");
		System.out.println(sb.capacity());
		sb.append("������");//�����Ÿ� �̷��� ���� .������
		System.out.println(sb.toString());
		sb.insert(1,"�������"); //������ ����
		System.out.println(sb.toString());
		sb.replace(1, 3, "�ȳ�");//1������ 2������ ���� �ȳ�����
		System.out.println(sb.toString());
		sb.delete(1,4); //1������ 3������ �����ϱ�
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
	}

}
