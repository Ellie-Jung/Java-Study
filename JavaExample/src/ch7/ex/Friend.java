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
		System.out.println("이름 : "+name);
		System.out.println("번호 : "+phonNum);
		System.out.println("주소 : "+address);
	}
	public void showBasicInfo() {}
}
