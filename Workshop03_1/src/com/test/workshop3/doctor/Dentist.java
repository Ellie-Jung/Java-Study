package com.test.workshop3.doctor;

public class Dentist extends Doctor {
	
	public Dentist( String name) {
		super(name,"치과");
	}
//	Dentist d = new Dentist(name);
	public void pullOutTooth(){
		super.treatPatient();
		System.out.println("이를 뽑습니다.");
	}
	
}