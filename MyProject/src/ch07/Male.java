package ch07;

public class Male extends Person{
	double height;
	double weight;
	@Override
	void sayHi() {
		System.out.println("�ȳ��ϼ���. ���� "+getName()+" �Դϴ�. "+age()+ "�� �����Դϴ�.");
	}
	void dancing() {
		System.out.println(getName() + "�� ���� ��ϴ�.");
	}
}
