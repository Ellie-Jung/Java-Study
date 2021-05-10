package com.test;
class GoodsInfo{
	String code ; 
	String name;
	String maker;
	int price ;
	double discountRate;
	
	public void updatediscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getSellingPrice() {
		return price - (price*discountRate);
	}
	
	GoodsInfo(String code, String name, String maker, int price){
		this(code,name,maker,price,0);
		
	}
	GoodsInfo(String code, String name, String maker, int price, double discountRate){
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discountRate = discountRate;
		
	}
	
}
public class ex1 {

	public static void main(String[] args) {
		

	}

}
