package com_test;

public class Sample02 {

	public static void main(String[] args) {
		//value type ��Ÿ��
		//JVM stack �޸� ������ �Ҵ�ǰ� �ʱ�ȭ��.
		int a = 1;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		
		//reference type ����Ÿ��
		//JVAM stack �޸� ������ e���� �Ҵ�ǰ� 
		//head�޸� ������ Employee ���� �����ǰ� ���� ���� name, age�� �Ҵ��.
		//e������ heap �޸� ������ Employee�� ������.
		Employee e = new Employee();
		e.name = "�̼���";
		e.age = 30;
		System.out.printf("%s,%d\n", e.name, e.age);
		Employee e2= e;
		e2.name = "�������";
		System.out.printf("%s,%d\n", e2.name, e2.age);
		System.out.printf("%s,%d\n", e.name, e.age);
		
		

	}

}
class Employee{
	public String name;
	public int age;
}