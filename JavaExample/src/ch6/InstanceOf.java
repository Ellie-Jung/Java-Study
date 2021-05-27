package ch6;

import javax.swing.Box;

public class InstanceOf {
	public static void wrapBox(Box box) {
		if (box InstanceOf GoldPaperBox) {
			((PaperBox)box).paperWrap();
		}else if(box instanceof PaperBox) {
			((PaperBox)box).paperWrap();
		}else { 
			box.simpleWrap();
		}
	}
	public static void main(String[] args) {


	}

}
