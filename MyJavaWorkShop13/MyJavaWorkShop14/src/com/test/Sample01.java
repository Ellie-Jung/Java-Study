package com.test;

import java.util.*;

class Animal {
	void breathing() {
		System.out.println("Animal");
	}
}
class Dog extends Animal{
	void breathing() {
		System.out.println("Dog");
	}
}
public class Sample01 {
	static void testMethod(List<? extends Animal>list) {
		for(Animal animal : list) {
			animal.breathing();
		}
	}
	public static void main(String[] args) {
		testMethod(new ArrayList<Animal>());
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		testMethod(dogs);
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Animal());
	}

}
