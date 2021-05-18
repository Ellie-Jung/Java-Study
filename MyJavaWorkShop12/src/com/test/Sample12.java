package com.test;
class MyData{
	private Object a;
	MyData(Object a){
		this.a = a;
	}
	public Object getA(){
		return this.a;
	}
}
public class Sample12 {

	public static void main(String[] args) {
		MyData m = new MyData(11);
		m.getA();
		MyData m1 = new MyData(new String("Ç×"));
		String o1 = (String)m1.getA();
	}

}
