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
		System.out.println("���� : "+job);
	}

	@Override
	public void showBasicInfo() {
		System.out.printf("�̸��� %s�̰�, ��ȣ�� %s �Դϴ�.",name,phonNum);
		System.out.println();
			
	}
	
}
