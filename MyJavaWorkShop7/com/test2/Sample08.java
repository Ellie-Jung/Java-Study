package com.test2;
class BlackDog extends Dog{
	void  running() {System.out.println("BlackDog running");}
}
public class Sample08 {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		Animal animal = dog;
//		Dog dog2 = (Dog)animal;
		
//		Dog dog3= new Dog();
//		Animal animal2 = dog3;
//		Cat cat = (Cat)animal2; //����. ����ȯ�� �Ҽ������� �� Ÿ���� ��ü�� ���� ����. �ᱹ�� ������ (�������� ĳ���� ���)
	
//		Animal animal3  = new Animal();
//		Dog dog4 = (Dog)animal3; //����.Ÿ��üŷ�������� ���� ����ÿ� ���� ��ü�� ���»���. ����(��ü �������� �ʴ°�� ���� x)

		//blackdog
		BlackDog bkdog = new BlackDog();
		Dog dog5 = bkdog;
		Animal animal3 = dog5;
		dog5.breathing();
		BlackDog bkDog2 =(BlackDog)animal3;
		Dog  dog6 = (Dog)animal3;
		dog6.barking();
		dog6.breathing();
		
		
		BlackDog bkDog3=new BlackDog();
		Animal obj2 =bkDog3;
		//������ �ؿ� ó������ ����
		Animal obj = new BlackDog();
		
		Dog dog7 = new Dog();
		Animal obj4 =dog7; //�� �ΰ� �ؿ�ó�� ǥ�� ����
		Animal obj3 = new Dog();
	}

}
