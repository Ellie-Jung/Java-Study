package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Adler32;

public class Sample03 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("ÀÌ¼ø½Å");
		al.add(12.3);
		al.get(0);
//		System.out.println(al.get(0));
//		System.out.println(al.get(1));

		for (int inx = 0; inx< al.size();inx++) {
			System.out.println(al.get(inx));
			System.out.println(al.get(inx).getClass().getName());
			System.out.println(al.get(inx).toString());
		}
		System.out.println("==========");
		 Iterator itr= al.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		}
	

}
