package ch05;

public class Member {
	String name;
	String phonNum;
	String major;
	int grade;
	String emailadd;
	String birthday;
	String address;
	
	void printInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("�޴�����ȣ : "+phonNum);
		System.out.println("���� : "+major);
		System.out.println("�г� : "+grade);
		System.out.println("email : "+emailadd);
		System.out.println("���� : "+birthday);
		System.out.println("�ּ� : "+address);
		
	}
	Member(String name, String phonNum,String major,int grade, String emailadd) {

		this(name,phonNum,major,grade,emailadd,"1��1��","�����");
		
	}
	Member(String name, String phonNum,String major,int grade, String emailadd, String birthday, String address) {
		this.name= name;
		this.phonNum = phonNum;
		this.major=major;
		this.grade = grade;
		this.emailadd = emailadd;
		this.birthday = birthday;
		this.address = address;
	}
	
	
	public static void main(String[] args) {
		Member m = new Member("���ڹ�", "01012341234", "�濵��", 1, "fhdjdj");
		Member m1 = new Member("���ڹ�", "456123456", "������", 3, "sdhfsjkd", "10�� 1��", "����� ������");
		m.printInfo();
		System.out.println();
		m1.printInfo();
	}

}
