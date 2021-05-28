package ch7.ex;

public class UnivFriend extends Friend{
	
	String major;

	UnivFriend(String name, String phonNum, String address,String major) {
		super(name, phonNum, address);
		this.major = major;
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("전공 : "+major);
	}

	@Override
	public void showBasicInfo() {
		System.out.printf("이름은 %s, 번호는 %s, 전공은 %s 입니다.",name,phonNum,major);
		System.out.println();
	}

	
	
	
}
