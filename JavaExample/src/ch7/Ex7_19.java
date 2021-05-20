package ch7;
class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	void buy(Product p) {
		if (money<p.price) {
			System.out.println("잔액이 부족하여"+p+"를 살수 없습니다.");
			return;
			}
		money -= p.price;
		add(p);
	}
	void add(Product p) {
		if(i>= cart.length) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp,0, cart.length); //기존의 장바구니의 내용을 새로운 배열에 복사한다.
			cart = tmp; //새로운 장바구니와 기존의 장바구니를 바꾼다.
		}
		cart[i++] =p; //물건을 카트에 저장한다. 그리고 i 의 값을 1씩 증가시킨다.
	}
	void summary() {
		String itemList = "";
		int sum = 0;
		for(int i = 0; i<cart.length;i++) {
			if (cart[i]==null) break;
			itemList += cart[i] +","; //장바구니에 담긴 물건들의 목록을 만들어 출력한다.
			sum += cart[i].price;  //장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
		}
		System.out.println("구입한물건 : "+itemList);
		System.out.println("사용한 금액 : "+sum);
		System.out.println("남은 금액 : "+ money);
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
