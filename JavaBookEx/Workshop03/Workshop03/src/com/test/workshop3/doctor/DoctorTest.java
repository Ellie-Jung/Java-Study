package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.Object;

public class DoctorTest {
	

	public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("ȫ�浿"));
        dent.add(new Dentist("����ġ"));
        surg.add(new Surgeon("�Ӳ���"));
        surg.add(new Surgeon("ȫ���"));
        surg.add(new Surgeon("������"));
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
//        �̷��� ��°���. �ؿ�ó�� �����ϰ� ����Ҽ�����
        
        for(Dentist d : dent) {
        	System.out.println(d);
        	d.pullOutTooth();
        }
        for(Surgeon s : surg) {
        	System.out.println(s);
        	s.performSurgery();
        }
//
        //TODO �ǻ� ���� ���
    
		
    }
}