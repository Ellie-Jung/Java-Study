package com.test.workshop3.doctor;

public class Dentist extends Doctor{
   
	public Dentist(String name) {
		super(name);
	}
	public Dentist(String name, String department){
    	super(name, department);
    }
    public void pullOutTooth() {
    	this.toString();
    	super.treatPatient();
    	System.out.println("�̸� �̽��ϴ�.");
    }
    public String toString() {
        return "ġ��  : " + getName() + " ������";
    }
    //TODO Doctor Ŭ���� ��� ���� ��, Ŭ���� �ϼ�
}