package com.test4;
interface IDatabase{
	public void open();
}
class Oracle implements IDatabase{
	public void open() {System.out.println("Oracle open");}
}
class MySql implements IDatabase{
	public void open() {
		System.out.println("MySql open");
	}
}
class SqlsServer implements IDatabase{
	public void open() {System.out.println("Sql open");}
}
class DbManager{
	IDatabase db;
	public DbManager(IDatabase db) {
		this.db= db;
	}
	public void run() {
		db.open();
	}
}
public class Sample05 {

	public static void main(String[] args) {
		IDatabase db = new Oracle();
		db.open();
		DbManager dbg = new DbManager(new Oracle());
		dbg.run();
		

	} 

}
