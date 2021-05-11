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
	static void test1 (Dog d) {} // 도그 타입만 받음
	static void test2 (Cat c) {} //캣 타입만 받음
	static void test3(Animal d) {} //이렇게 받으면 코드 하나로 모든 종류를 다받을수있다.(코드량을 줄이기위해) 분기처리만 하면끝
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.barking();
		dog.breathing();
		Animal animal =dog;// 도그에서 애니멀로  바뀜 (Animal)dog=> implicit cast
		animal.breathing(); //상속된 구조에서만 가능. 타입이 제한. 애니멀타입만 가능(바킹 노)
		Dog dog2 = (Dog)animal;//애니멀에서 도그로 바뀜
		dog2.barking();
		dog2.breathing();
		
		Object obj = dog; //오브젝트는 모든 타입 다 받을수 있다. but 못받음
		Dog obj2=(Dog)obj;
		obj2.barking();
		obj2.breathing();

	}

}
