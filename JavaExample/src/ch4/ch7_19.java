package ch4;
class Buyer {
	int money = 1000;
	Product [] cart = new Product[3]; //구입한 제품을 저장하기 위한 배열
	int i = 0;					// Product배열 cart에 사용될 index
	void buy(Product p) {
		//		1.3 .장바구니에 구입한 물건을 담는다(add )
		if (p.price>money) {
			System.out.println("잔액이 부족하여 "+p+"을/를 살수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	void add(Product p) {
		if(i >=cart.length ) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart,0,tmp,0,cart.length);
			cart = tmp;
//			for(int i =0; i<cart.length;i++) {
//				tmp[i]= cart[i];
//				cart = tmp;
			}
				cart[i]= p; 
				i++;
		
	}
	void summary() {
		int sum=0;
		String itemList ="";
		for(int i =0; i<cart.length;i++) {
			if(cart[i]==null) break;
			itemList += cart[i]+",";
			sum+= cart[i].price;
		}
		System.out.println("구입한 물건 : "+ itemList);
		System.out.println("물건들의 가격 합 : "+sum);
		System.out.println("남은금액 " +money);
	}
}
public class ch7_19 {

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