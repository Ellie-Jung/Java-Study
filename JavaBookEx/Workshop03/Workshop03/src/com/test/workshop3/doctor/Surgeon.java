package com.test.workshop3.doctor;

public class Surgeon extends Doctor {
	 
	public Surgeon(String name) {
		super(name);
	}
	public Surgeon(String name, String department){
	    super(name, department);
	    }
	public void performSurgery() {
		this.toString();
		super.treatPatient();
		System.out.println("수술을 집도하다.");
	}
	public String toString() {
        return  " 외과 : " + getName()+ " 선생님";
    }
    //TODO Doctor 클래스 상속 받은 후, 클래스 완성
}