class Time{
	private int hour; //0~23 ������ ���� ��������.
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if (isNotValidHour(hour)) return;
		
		this.hour = hour;
	}
	//�Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼ҵ�
	private boolean isNotValidHour(int hour) {//�� �޼ҵ�� ����Ŭ���� �ȿ����� ����ϹǷ� private���� �����ϴ°�����
		return hour <0 || hour >23;	 //���ο����� ���� ���ļ���(�׽�Ʈ�� ������ �پ��°�) 
	}
	public int getHour() {return hour;}
}
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(21); //hour�� ���� 21�� ����
		
		System.out.println(t.getHour());
		

	}

}