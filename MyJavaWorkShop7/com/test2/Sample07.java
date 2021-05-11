package com.test2;
class Animal{
	void breathing () {System.out.println("Animal breathing");}
}
class Dog extends Animal{
	void barking() {System.out.println("Dog barking");}
}
class Cat extends  Animal{
	void meowing() {System.out.println("Cat meowing");}
}
public class Sample07 {
	static void test1 (Dog d) {} // ���� Ÿ�Ը� ����
	static void test2 (Cat c) {} //Ĺ Ÿ�Ը� ����
	static void test3(Animal d) {} //�̷��� ������ �ڵ� �ϳ��� ��� ������ �ٹ������ִ�.(�ڵ差�� ���̱�����) �б�ó���� �ϸ鳡
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.barking();
		dog.breathing();
		Animal animal =dog;// ���׿��� �ִϸַ�  �ٲ� (Animal)dog=> implicit cast
		animal.breathing(); //��ӵ� ���������� ����. Ÿ���� ����. �ִϸ�Ÿ�Ը� ����(��ŷ ��)
		Dog dog2 = (Dog)animal;//�ִϸֿ��� ���׷� �ٲ�
		dog2.barking();
		dog2.breathing();
		
		Object obj = dog; //������Ʈ�� ��� Ÿ�� �� ������ �ִ�. but ������
		Dog obj2=(Dog)obj;
		obj2.barking();
		obj2.breathing();

	}

}
