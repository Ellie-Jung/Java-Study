package com.test.workshop3.doctor;

public class Surgeon extends Doctor {
    
	public Surgeon(String name) {
		super(name,"�ܰ�");
	}
	public void performSurgery() {
		super.treatPatient();
		System.out.println("������ �����մϴ�.");
	}
    //TODO Doctor Ŭ���� ��� ���� ��, Ŭ���� �ϼ�
}