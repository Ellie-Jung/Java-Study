package com.test;

public class Sample06 {

	public static void main(String[] args) {
		String msg = "�ȳ��ϼ���. �ݰ�����.";
		char temp = msg.charAt(1);
		System.out.println(temp);
		String msg1 = "abcdegfABCE";
		char c = msg1.charAt(7); //���� �ϳ� �����ö� 
		System.out.println(c);
		int n = (int)c;
		System.out.println(n);
		String msg2 = " �ݰ����� ";
		System.out.println(msg2.length());
		System.out.println(msg2.trim().length());
		System.out.println(msg2.trim()); //������ֱ�
		System.out.println(msg1.startsWith("ab")); //ab�� �����ϸ� true
		int ms2 = 1234;
		String temp2 = String.valueOf(ms2);
		System.out.println(temp2+ 2);
		String msg3 = "ababc";
		String msg4 = msg3.replace("b", "c");//msg3�� ��� b�� c�� �ٲٱ�
		System.out.println(msg4);
		String tel = "010-123-1234";
		tel.substring(0,3); //0��°����  2������ �̾Ƴ��� (������ 3�� ����)
		System.out.println(tel.substring(0,3));
		System.out.println(tel.substring(4,7));
		System.out.println(tel.substring(3)); // 3������ ������ �� �̱� 
		char c3 = "�ݰ�����".charAt(0); //���Ӱ͵� ������. �� ���
		System.out.println(c3); 
	}

}
