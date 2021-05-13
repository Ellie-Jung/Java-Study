package com.test3;
interface IDatabase{
	public void open();
}
interface IQuery{
	public void select();
}
class Oracle implements IDatabase, IQuery{ //다중가능
	public void open(){
		System.out.println("Oracle open");
	}
	public void select() {
		System.out.println("Oracle query");
	}
}
class MySql implements IDatabase{
	public void open() {
		System.out.println("MySql open");
	}
}
public class Sample03 {
	static void openDb(IDatabase db) {
		db.open();
	}
	public static void main(String[] args) {
//		IDatabase dbDatabase = new IDatabase(); 이건안됨
		Oracle oracle=new Oracle();
		oracle.open();
		IDatabase db = new Oracle();
		db.open();
		IDatabase db2= new MySql();
		db2.open();

	}

}
