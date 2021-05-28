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
		System.out.println("���� : "+major);
	}

	@Override
	public void showBasicInfo() {
		System.out.printf("�̸��� %s, ��ȣ�� %s, ������ %s �Դϴ�.",name,phonNum,major);
		System.out.println();
	}

	
	
	
}
