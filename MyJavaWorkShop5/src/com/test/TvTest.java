package com.test;
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power= !power;}
	void channerlUp(){ ++channel;}
	void channelDown() {--channel;}
}
public class TvTest {

	public static void main(String[] args) {

//		Tv t ;
//		t= new Tv();
		Tv t= new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel);

	}

}
