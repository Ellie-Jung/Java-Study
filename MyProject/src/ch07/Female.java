package ch07;

public class Female extends Person{
	double height;
	double weight;
	@Override
	void sayHi() {
		System.out.println("�ȳ��ϼ���. ���� "+getName()+" �Դϴ�. "+age()+ "�� �����Դϴ�.");
	}
	void sleeping() {
		System.out.println(getName() + "�� ���� ��ϴ�.");
	}
}
