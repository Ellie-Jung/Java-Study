package com.test.workshop3.doctor;

public class Dentist extends Doctor {
	
	public Dentist( String name) {
		super(name,"ġ��");
	}
//	Dentist d = new Dentist(name);
	public void pullOutTooth(){
		super.treatPatient();
		System.out.println("�̸� �̽��ϴ�.");
	}
	
}