
public class Sample03 {

	public static void main(String[] args) {
			Dog dog = new Dog();
			dog.breathing();
			dog.barking();
			Cat cat = new Cat();
			cat.breathing();
			cat.meowing();
			
			Animal animal = dog;
			animal.breathing();
			Animal animal2 = cat;
			animal2.breathing();
			checkAnimal(dog);
			checkAnimal(cat);
	}
	static void checkAnimal(Animal animal) {
		animal.breathing();
	}
}
