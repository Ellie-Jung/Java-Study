class Time{
	private int hour; //0~23 사이의 값을 가져야함.
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if (isNotValidHour(hour)) return;
		
		this.hour = hour;
	}
	//매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메소드
	private boolean isNotValidHour(int hour) {//이 메소드는 여기클래스 안에서만 사용하므로 private으로 설정하는게좋다
		return hour <0 || hour >23;	 //내부에서만 쓰는 ㅁㅔ서드(테스트의 범위가 줄어드는것) 
	}
	public int getHour() {return hour;}
}
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(21); //hour의 값을 21로 변경
		
		System.out.println(t.getHour());
		

	}

}
