package ch7.ex;
public class Friend {
	String name;
	String phonNum;
	String address;
	
	Friend(String name, String phonNum, String address) {
		this.name= name;
		this.phonNum = phonNum;
		this.address = address;
	}
	
	public void showData() {
		System.out.println("�̸� : "+name);
		System.out.println("��ȣ : "+phonNum);
		System.out.println("�ּ� : "+address);
	}
	public void showBasicInfo() {}
}
