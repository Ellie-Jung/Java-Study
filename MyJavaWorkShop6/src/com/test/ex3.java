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
		Account1 customer1 = new Account1("111-222-33333","���", 20000);
		Account1 customer2= new Account1("555-666-77777","�ڹ�",100000);
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		printAccount(customer1);
		customer2.withdraw(30000);
		printAccount(customer2);
		System.out.println("�������� ���");
		Account1.interest = 0.05;
		customer1.addInterest();
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);

	}
	static void printAccount(Account1 customer) {
		System.out.println("���¹�ȣ : " +customer.getAccountNo());
		System.out.println("�������̸� : "+customer.getAccountName() );
		System.out.println("�ܾ� : "+customer.getBalance());
		System.out.println();
	}
}
