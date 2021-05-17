package com.test;

import java.util.Objects;

class Card{
	String kind;
	int number;
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public int hashCode() { //equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
		return Objects.hash(kind,number); //objects클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스
		//매개변수는 가변인자라서 호출시 지정하는 값의 개수가 정해져있지않다.
	}
	
	public boolean equals(Object obj) { //equals 오버라이딩
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind)&& this.number ==c.number;
	}
	
	public String toString() { //object 클래스의 toString  오버라이딩
		return "kind : " +kind+", number : "+number;
	}
}
public class CardToString {

	public static void main(String[] args) {
		Card c = new Card();
		Card c1 = new Card("SPADE", 1);
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
	}

}
