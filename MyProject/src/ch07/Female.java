package ch07;

public class Female extends Person{
	double height;
	double weight;
	@Override
	void sayHi() {
		System.out.println("안녕하세요. 저는 "+getName()+" 입니다. "+age()+ "살 여자입니다.");
	}
	void sleeping() {
		System.out.println(getName() + "는 잠을 잡니다.");
	}
}
