package com.test;
class Member {
	private String name;
	private String id;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setID(String id) {
		this.id = id;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public int getAge() {
		return this.age;
	}
}
public class Quiz01 {

	public static void main(String[] args) {
		Member m = new Member();
		m.setName("Á¤¿ì¼º");
		m.setID("1");
		m.setAge(30);
		String name = m.getName();
		String id = m.getId();
		int age = m.getAge();
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}

}
