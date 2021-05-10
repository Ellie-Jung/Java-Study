package com.test;
class Account{
	public static double interest;
	private String accountNo;
	private String name;
	private double balance;
//	public int deposit;
	
	public Account() {}
	public Account(String accountNo, String name, int balance) { //������
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
		
		Account customer1 = new Account("111-222-33333333","������",20000);
		Account customer2 = new Account("555-666-77777777","���ſ�",100000);
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000); //�Ա�
		customer2.withdraw(30000); //���
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�������� ���");
		Account.interest = 0.05;
		customer1.addInterest(); //����� �ݾ� = ���� +���� *������
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);
		
//		
		

	}

	static void printAccount(Account customer) {
		System.out.println("���¹�ȣ : " +customer.getAccountNo());
		System.out.println("�������̸� : "+customer.getAccountName() );
		System.out.println("�ܾ� : "+customer.getBalance());
		System.out.println();
	}

	

	

}
