package com.test;
class Card {
	String kind;
	int num;
	static int width= 100;
	static int height = 250;
}

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.height ="+ Card.height);
		
		Card c1 =new Card();
		c1.kind = "Heart";
		c1.num = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.num = 4;
		
		System.out.println("c1��"+ c1.kind + ","+ c1.num+ "�̸�,ũ��� ("+c1.width +","+c1.height+")");
		System.out.println("c2��"+ c2.kind + ","+ c2.num+ "�̸�,ũ��� ("+c2.width +","+c2.height+")");
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		
		c1.width = 50;
		c1.height= 80;
		
		System.out.println("c1��"+c1.kind+","+c1.num+"�̸�, ũ��� ("+c1.width +","+c1.height+")");
		System.out.println("c2��"+ c2.kind + ","+ c2.num+ "�̸�,ũ��� ("+c2.width +","+c2.height+")");
		
	}

}
