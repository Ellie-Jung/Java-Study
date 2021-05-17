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
	public int hashCode() { //equals()�� �������̵��ϸ� hashCode()�� �������̵� �ؾ��Ѵ�.
		return Objects.hash(kind,number); //objectsŬ������ ��ü�� ���õ� ������ �޼��带 �����ϴ� ��ƿ Ŭ����
		//�Ű������� �������ڶ� ȣ��� �����ϴ� ���� ������ �����������ʴ�.
	}
	
	public boolean equals(Object obj) { //equals �������̵�
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind)&& this.number ==c.number;
	}
	
	public String toString() { //object Ŭ������ toString  �������̵�
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
