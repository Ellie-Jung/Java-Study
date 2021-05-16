package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {
    
    public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
       
        dent.add(new Dentist("È«±æµ¿"));
        dent.add(new Dentist("Àü¿ìÄ¡"));
        
        surg.add(new Surgeon("ÀÓ²©Á¤"));
        surg.add(new Surgeon("È«±æ¼ø"));
        surg.add(new Surgeon("±¤°³Åä"));
        
//        System.out.println(dent.get(0));
//        dent.get(0).pullOutTooth();
        //ÇÏ³ª¾¿ »Ì±â. ¹Ø¿¡Ã³·³ °¡´É
        
        for (Dentist d : dent) {
        	System.out.println(d);
        	d.pullOutTooth();
        }
        for(Surgeon s : surg) {
        	System.out.println(s);
        	s.performSurgery();
        }
    }
}