package com.test;

import java.util.ArrayList;
import java.util.Iterator;

class MyList implements Iterable{
	ArrayList al;
	MyList(){
		al = new ArrayList();
	}
	public void addItem(Object o) {
		al.add(o);
	}
	@Override
	public Iterator iterator() {
		
		return new MyListIterator();
	}
	class MyListIterator implements Iterator{
		int currentIndex = 0;
	
		@Override
		public boolean hasNext() {
			if(currentIndex >= al.size()) {return false;}
			return true;
		}
		@Override
		public Object next() {
			
			return al.get(currentIndex++);
		}
		
	}
}

public class Sample06 {
	public static void main(String[] args) {
		
		MyList mList = new MyList();
		mList.addItem(1);
		mList.addItem(2);
		Iterator ltr = mList.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		
		}
	}
}
