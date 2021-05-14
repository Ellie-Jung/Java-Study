package com.test.workshop3.doctor;

public class Dentist extends Doctor{
   
	public Dentist(String name) {
		super(name, "치과");
	}
//	public Dentist(String name, String department){
//    	super(name, department);
//    }
    public void pullOutTooth() {
    	super.toString();
    	super.treatPatient();
    	System.out.println("이를 뽑습니다.");
    	System.out.println();
    }
//    public String toString() {
//        return "치과  : " + getName() + " 선생님";
//    }
    //TODO Doctor 클래스 상속 받은 후, 클래스 완성
}