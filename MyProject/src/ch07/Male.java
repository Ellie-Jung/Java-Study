package ch07;

public class Male extends Person{
	double height;
	double weight;
	@Override
	void sayHi() {
		System.out.println("안녕하세요. 저는 "+getName()+" 입니다. "+age()+ "살 남자입니다.");
	}
	void dancing() {
		System.out.println(getName() + "는 춤을 춥니다.");
	}
}
