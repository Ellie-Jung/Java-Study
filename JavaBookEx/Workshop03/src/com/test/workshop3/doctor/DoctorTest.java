package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.Object;

public class DoctorTest {
	

	public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("홍길동"));
        dent.add(new Dentist("전우치"));
        surg.add(new Surgeon("임꺽정"));
        surg.add(new Surgeon("홍길순"));
        surg.add(new Surgeon("광개토"));
//        System.out.println(dent.get(0));
//        dent.get(0).pullOutTooth();
//        System.out.println(dent.get(1));
//        dent.get(1).pullOutTooth();
//        
//        System.out.println(surg.get(0));
//        surg.get(0).performSurgery();
//        System.out.println(surg.get(1));
//        surg.get(1).performSurgery();
//        System.out.println(surg.get(2));
//        surg.get(2).performSurgery();
//        이렇게 출력가능. 밑에처럼 간단하게 출력할수있음
        
        for(Dentist d : dent) {
        	System.out.println(d);
        	d.pullOutTooth();
        }
        for(Surgeon s : surg) {
        	System.out.println(s);
        	s.performSurgery();
        }
//
        //TODO 의사 정보 출력
    
		
    }
}