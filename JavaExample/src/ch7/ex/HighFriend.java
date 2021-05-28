package ch7.ex;

public class HighFriend extends Friend{
	String job ;
	
	HighFriend(String name, String phonNum, String address,String job) {
		super(name, phonNum, address);
		this.job = job;
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("직업 : "+job);
	}

	@Override
	public void showBasicInfo() {
		System.out.printf("이름은 %s이고, 번호는 %s 입니다.",name,phonNum);
		System.out.println();
			
	}
	
}
