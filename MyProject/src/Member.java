import java.util.Calendar;

public class Member {
	Calendar cal = Calendar.getInstance();
	int thisyear = cal.get(Calendar.YEAR);

	void vaccin(int year) {

		if((thisyear-year)<15 || thisyear-year>=65) {
			System.out.println("무료 예방접종이 가능합니다.");
		}
		else System.out.println("무료 접종 대상이 아닙니다.");
	}
	void checkup (int year) {
		if((thisyear-year)>=20) {
			System.out.println("2년마다 무료로 건강검진을 받을 수 있습니다.");
			if(year%2==0 && thisyear%2==0) {System.out.println("올해 검사대상입니다.");}
			else if(year%2==1 && thisyear%2==1) {System.out.println("올해 검사대상입니다.");}
			if((thisyear-year)>=40){
				System.out.println("암검사도 무료로 할수 있습니다.");
			}
		}
		else System.out.println("건강검진 대상이 아닙니다.");
	}
	
	public static void main(String[] args) {
		String className = new Object() {}.getClass().getEnclosingClass().getName();// 자기 자신의 클래스 이름 출력
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
