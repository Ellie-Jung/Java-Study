import java.util.Calendar;

public class Member {
	Calendar cal = Calendar.getInstance();
	int thisyear = cal.get(Calendar.YEAR);

	void vaccin(int year) {

		if((thisyear-year)<15 || thisyear-year>=65) {
			System.out.println("���� ���������� �����մϴ�.");
		}
		else System.out.println("���� ���� ����� �ƴմϴ�.");
	}
	void checkup (int year) {
		if((thisyear-year)>=20) {
			System.out.println("2�⸶�� ����� �ǰ������� ���� �� �ֽ��ϴ�.");
			if(year%2==0 && thisyear%2==0) {System.out.println("���� �˻����Դϴ�.");}
			else if(year%2==1 && thisyear%2==1) {System.out.println("���� �˻����Դϴ�.");}
			if((thisyear-year)>=40){
				System.out.println("�ϰ˻絵 ����� �Ҽ� �ֽ��ϴ�.");
			}
		}
		else System.out.println("�ǰ����� ����� �ƴմϴ�.");
	}
	
	public static void main(String[] args) {
		String className = new Object() {}.getClass().getEnclosingClass().getName();// �ڱ� �ڽ��� Ŭ���� �̸� ���
		System.out.println(className);

		String name;
		int age;
		double height;
		boolean hasBook;

		Member m= new Member();
//		m.vaccin(1991);
//		m.vaccin(2009);
//		m.checkup(1991);
//		m.checkup(2008);
		m.checkup(1950);

	}

}
