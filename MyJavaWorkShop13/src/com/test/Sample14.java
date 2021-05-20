package com.test;
enum Season{
	winter(10), summer(20);
	private int value;
	Season(int value) {
		this.value =value;
	}
	public int getValue() {
		return this.value;
	}
}
public class Sample14 {

	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s);
			System.out.println(s.getValue());
			
		}

	}

}
