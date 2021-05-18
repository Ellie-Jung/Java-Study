package com.test;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class MyElement implements Comparable{
	private int i;
	public MyElement(int i) {
		this.i = i;
	}
	public int getI() {
		return this.i;
	}
	public int compareTo(Object o) {
		MyElement m = (MyElement)o;
		if(this.i < m.getI()) {
			return -1;
		}else if(this.i > m.getI()) {
			return 1;
		}else {
			return 0;
		}
	}
}
public class Sample11 {
	static void BubbleSortArrayList(ArrayList al) {
		MyElement temp;
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for (int inx = 0; inx<al.size()-1;inx++) {
				MyElement m3 = (MyElement)al.get(inx);
				MyElement m4 = (MyElement)al.get(inx+1);
				if(m3.compareTo(m4)<0){
					temp = m3;
					al.set(inx, m4);
					al.set(inx+1, temp);
					sorted = false;	
					}
			}
		}


	for(Object m: al){
		System.out.println(((MyElement)m).getI());}}
	public static void main(String[] args) {
		MyElement e = new MyElement(10);
		MyElement e2 = new MyElement(20);
		System.out.println(e.compareTo(e2));

		ArrayList aList = new ArrayList();
		aList.add(new MyElement(2));
		aList.add(new MyElement(1));
		aList.add(new MyElement(3));
		aList.add(new MyElement(4));
		
		BubbleSortArrayList(aList);
	}

}
