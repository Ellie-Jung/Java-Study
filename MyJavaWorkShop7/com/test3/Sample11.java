package com.test3;//class Database{
class Database{
	void open() {
		System.out.println("Database open");
	}
}
class Oracle extends Database{
	void select_oracle() {
		System.out.println("Oracle select");	
	}
	void open() {System.out.println("Oracle open");}
}
class MySql extends Database{
	void select_mysql() {System.out.println("MySql select");}
	void open() {System.out.println("MySql open");}
}
public class Sample11 {
	static void openDb(Database db) {
		db.open();
	}
	static Database CreateDatabase(String dbName) {
		Database db= null;
		switch(dbName) {
		case "Oracle" :
			db = new Oracle();
			break;
		case "MySql" :
			db = new MySql();
			break;
		}
		return db;
	}
	public static void main(String[] args) {
//		Database db = new Oracle();
//		db.open();
//		Database a=new MySql();
//		a.open();
		
		openDb(new Oracle());
		openDb(new MySql());
		
		Database db =CreateDatabase("Oracle");
		db.open();
		Database db2 = CreateDatabase("MySql");
		db2.open();
		
	}

}
