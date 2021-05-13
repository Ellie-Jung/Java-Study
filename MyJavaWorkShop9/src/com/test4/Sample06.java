package com.test4;
abstract class Database1{
	public void open() {
		System.out.println("Database open");
	}
	abstract void select();
}
class Oracle1 extends Database1{
	public void select() {System.out.println("Oracle open");}
}
class MySql1 extends Database1{
	public void select() {System.out.println("MySql open");}
}
public class Sample06 {

	public static void main(String[] args) {
		Oracle1 o =new Oracle1();
		Database1 d= new Oracle1();
		d.open();
		d.select();

	}

}
