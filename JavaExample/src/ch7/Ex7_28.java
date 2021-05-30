package ch7;
import java.awt.*;
import java.awt.event.*;

//익명클래스만들기
public class Ex7_28 {

	public static void main(String[] args) {
		Frame f = new Frame();
		//		f.addWindowListener(new EventHandler());
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});

	}

}
class EventHandler extends WindowAdapter //위에서 익명클래스로 만들기
{
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}