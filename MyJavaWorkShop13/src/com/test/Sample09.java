package com.test;
import java.util.*;

abstract class Animal2{
	abstract void breathing();
}
class Dog2 extends Animal2{
	public void breathing() {System.out.println("Dog breathing");}
}
class Cat3 extends Animal2{
	@Override
	public void breathing() {
		System.out.println("Cat breathing");
	}
}
public class Sample09 {
	static void printAnimal(List<? extends Animal2>animals) {
		for(Animal2  a : animals) {
			a.breathing();
		}
	}
	public static void main(String[] args) {
		ArrayList<Dog2> dog2 = new ArrayList<>();
		dog2.add(new Dog2());
		dog2.add(new Dog2());
		printAnimal(dog2);
//		ArrayList<Object> obj = new ArrayList<>();
//		printAnimal(obj); //하위로 제약
		
		

	}

}
