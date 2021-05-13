package com.test;

public class Oracle extends Database{
	public Oracle(String connString) {
		this.connString = connString;
	}
	public void  setCoonString(String coString) {
		this.connString = coString;
	}
	public String getCoonString() {
		return this.connString;
	}
	public void open () {
		System.out.println("Oracle open : "+this.connString);
	}
}
