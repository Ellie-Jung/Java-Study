package com.test;
class Account{
	public static double interest;
	private String accountNo;
	private String name;
	private double balance;
//	public int deposit;
	
	public Account() {}
	public Account(String accountNo, String name, int balance) { //생성자
		this.accountNo=accountNo;
		this.name = name;
		this.balance=balance;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setAccountName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
//		balance = balance + deposit;
		this.balance = balance;
		
	}
	public String getAccountNo() {
		return this.accountNo;
	}
	public String getAccountName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance  ;
	}
	public void deposit(int price) {
		this.balance +=price;
		//this.balance = this.balance + price ; 	
	}
	public void withdraw(int price) {
		this.balance -=price;	
	}
	public void addInterest() {
		balance = balance + (balance*interest);
	}
}
public class Workshop2_1 {

	public static void main(String[] args) {
		
		Account customer1 = new Account("111-222-33333333","최은희",20000);
		Account customer2 = new Account("555-666-77777777","남매월",100000);
		System.out.println("기본 적립금");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000); //입금
		customer2.withdraw(30000); //출금
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("이자율의 계산");
		Account.interest = 0.05;
		customer1.addInterest(); //저축된 금액 = 원금 +원금 *이자율
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);
		
//		
		

	}

	static void printAccount(Account customer) {
		System.out.println("계좌번호 : " +customer.getAccountNo());
		System.out.println("예금주이름 : "+customer.getAccountName() );
		System.out.println("잔액 : "+customer.getBalance());
		System.out.println();
	}

	

	

}
