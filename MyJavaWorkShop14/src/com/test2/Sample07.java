package com.test2;
class A{
	public int a;
	public static int b;
}
public class Sample07 {

	public static void main(String[] args) {
		A obj= new A();
		obj.b = 20; //�������� ���ؼ� �����ϱ� //����ƽ ������ Ŭ���� ���ؼ� �����Ҽ� �ְ� �������� ���ؼ� �����Ҽ��� �ִ�. �ΰ��� �� ����
		A.b = 10; //Ŭ���� ���ؼ� �����ϱ�
		System.out.println(A.b);

	}

}
