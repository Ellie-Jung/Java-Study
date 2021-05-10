package com.test;
class Account1{
	private String accountNo;
	private String accountName;
	private double balance ;
	public static double interest;
	
	Account1(String accountNo, String accountName, double balance){
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}
	public String getAccountNo() {
		return this.accountNo;

	}
	public String getAccountName() {
		return this.accountName;
	}
	double getBalance() {
		return this.balance;
	}
	public void deposit(int price) {
		this.balance +=price;
		
	}
	public void withdraw(int price) {
		this.balance -=price;
		
	}
	public void addInterest() {
		this.balance = this.balance+(this.balance *interest);
		
	}
	
}
public class ex3 {

	public static void main(String[] args) {
		Account1 customer1 = new Account1("111-222-33333","김김", 20000);
		Account1 customer2= new Account1("555-666-77777","박박",100000);
		System.out.println("기본 적립금");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000);
		printAccount(customer1);
		customer2.withdraw(30000);
		printAccount(customer2);
		System.out.println("이자율의 계산");
		Account1.interest = 0.05;
		customer1.addInterest();
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);

	}
	static void printAccount(Account1 customer) {
		System.out.println("계좌번호 : " +customer.getAccountNo());
		System.out.println("예금주이름 : "+customer.getAccountName() );
		System.out.println("잔액 : "+customer.getBalance());
		System.out.println();
	}
}
