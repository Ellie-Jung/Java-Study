package com.test2;

import java.util.ArrayList;

class Database{
	void open() {
		System.out.println("Database open");
	}
}
class Oracle extends Database{
	void select_oracle() {
		System.out.println("Oracle select");
	}
}
class MySql extends Database{
	void select_mysql() {System.out.println("MySql select");}
}
public class Sample09 {

	public static void main(String[] args) {
		Oracle oracle = new Oracle();
		oracle.open();
		oracle.select_oracle();
//		Oracle oracle2 = new Oracle();
//		Database database2 = oracle2;
		Database database2  = new Oracle();
		database2.open();
		
		MySql mysql = new MySql();
		mysql.select_mysql();
		mysql.open();
		Database database3 = new MySql();
		ArrayList al = new  ArrayList();
		al.add(1);
		al.add("ÀÌ¼ø½Å");
		al.add(new Oracle());
		Object o = al.get(2);
		Oracle o2 = (Oracle)o;
		o2.open();
		
		openDb(new Oracle());
		openDb(new MySql());

	}
	static void openDb(Database db) {
		//Database db = new Oracle()
		//Database db = new MySql()
		db.open();
	}
}
