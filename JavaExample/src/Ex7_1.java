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
			// card[i]�� cards[j]�� ���� ���� �ٲ۴�.
			SutdaCard1 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	SutdaCard1 pick(int index){
		if (index <0|| index >= CARD_NUM) return null;// index�� ��ȿ���� �˻��Ѵ�.
		return cards[index];
	}
	SutdaCard1 pick(){
		int index = (int)(Math.random()*cards.length);
		return pick(index);  //pick(int index)�� ȣ���Ѵ�.
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
	// info() Object toString() . ��� Ŭ������ �� �������̵��ߴ�
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