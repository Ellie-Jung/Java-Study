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
		System.out.println("������ �����ϴ�.");
	}
	public String toString() {
        return  " �ܰ� : " + getName()+ " ������";
    }
    //TODO Doctor Ŭ���� ��� ���� ��, Ŭ���� �ϼ�
}