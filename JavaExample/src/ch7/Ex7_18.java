package ch7;
class Robot{}
class DanceRobot extends Robot{
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}
class DrawRobot extends Robot{
	void draw () {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
public class Ex7_18 {
	static void action(Robot r) {
//		Robot a = new Robot();
		if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}else if (r instanceof SingRobot) {
			((SingRobot) r).sing();
		}else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for (int i =0; i <arr.length; i++) {
			action(arr[i]);
		}

	}

}
