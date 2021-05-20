package ch7;
class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	void buy(Product p) {
		if (money<p.price) {
			System.out.println("�ܾ��� �����Ͽ�"+p+"�� ��� �����ϴ�.");
			return;
			}
		money -= p.price;
		add(p);
	}
	void add(Product p) {
		if(i>= cart.length) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp,0, cart.length); //������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�.
			cart = tmp; //���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�.
		}
		cart[i++] =p; //������ īƮ�� �����Ѵ�. �׸��� i �� ���� 1�� ������Ų��.
	}
	void summary() {
		String itemList = "";
		int sum = 0;
		for(int i = 0; i<cart.length;i++) {
			if (cart[i]==null) break;
			itemList += cart[i] +","; //��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�.
			sum += cart[i].price;  //��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�.
		}
		System.out.println("�����ѹ��� : "+itemList);
		System.out.println("����� �ݾ� : "+sum);
		System.out.println("���� �ݾ� : "+ money);
	}

}
class Product {
	int price;
	Product(int price) {
		this.price = price;
	}
}
class Tv extends Product{
	Tv(){super(100);}
	public String toString() {return "Tv";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}
public class Ex7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	}

}
