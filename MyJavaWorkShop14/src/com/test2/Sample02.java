package com.test2;
//���������� //���׿����� ���׿�����
public class Sample02 {

	public static void main(String[] args) {
		int a = 0;
		int c = a++;
		
		int b = a;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		a++;
		System.out.println(a);
		System.out.println(b);
		
		int d= 0;
		int e= ++d + d++;
		System.out.println(d);
		System.out.println(e);
		
		int f = 0;
		int g = f--;
		System.out.println(f);
		System.out.println(g);
		
		int a1 = 10;
		int b1 =20;
		if((a1>b1)&& (b1>10)) { //true �̸� �ȿ� ���� ���� //and������ �Ѵ� �ش��ؾ� ���̵ȴ�
		 System.out.println("a1�� 20���� ũ�� b1�� 10���� Ů�ϴ�.");
		}else {
			System.out.println("a1�� 20���� ũ�� b1�� 10���� ũ���ʽ��ϴ�.");
		}
		//|| �̰Ŵ� or ������. ���� �ϳ��� Ʈ��� ����
		if((a1>20)|| (b1>20)) {
			System.out.println("a1�� 20���� ũ�ų� b1�� 10���� ũ��.(�ϳ��� ��ġ�� ó��)");
		}
		
		int c1 = (a1==b1)? 100: 200; //���׿�����. ?���� ������ ���̸� 100, �����̸� 200 ����ȴ�.
		System.out.println(c1);
		
		int sum = 0; 
		for (int inx =0; inx <10; inx++) {
			sum += inx ; //���Կ����� sum = sum+ inx 
		}
		System.out.println(sum);
	}

}
