package ch7;
import java.security.PublicKey;

import javax.swing.JWindow;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];
	SutdaDeck() {
		for(int i=0;i < cards.length;i++) {
			int num = i%10+1;
			boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
			cards[i] = new SutdaCard1(num,isKwang);
		}
	}
	void shuffle(){
		for(int i = 0; i<cards.length;i++) {
			int j = (int)Math.random()*cards.length;
			// card[i]와 cards[j]의 값을 서로 바꾼다.
			SutdaCard1 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	SutdaCard1 pick(int index){
		if (index <0|| index >= CARD_NUM) return null;// index의 유효성을 검사한다.
		return cards[index];
	}
	SutdaCard1 pick(){
		int index = (int)(Math.random()*cards.length);
		return pick(index);  //pick(int index)를 호출한다.
	}
}
class SutdaCard1 {
	int num;
	boolean isKwang;
	SutdaCard1() {
		this(1, true);
	}
	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	// info() Object toString() . 대신 클래스의 을 오버라이딩했다
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
class Ex7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}