package com.test;

import java.util.*;

public class Sample04 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		for(Integer i : al) {
			System.out.println(i);
		}
		List<Integer> al2= new ArrayList<Integer>();
		List<Integer> al3 = new LinkedList<Integer>();
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "김자바");
		mp.put(2, "박자바");
		mp.put(3, "정자바");
		
		for(Integer k : mp.keySet()) {
			System.out.println(k+","+mp.get(k));
		}
		System.out.println(mp.entrySet());
		
		mp.keySet();
		System.out.println(mp.keySet());
		Set <Integer> set = mp.keySet()	;
		mp.entrySet();
		Set <Map.Entry<Integer,String>> set2 = mp.entrySet();
		Iterator itr = set2.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> e = (Map.Entry<Integer,String>)itr.next();
			System.out.println(e.getKey()+","+e.getValue());
		}
	}

}
