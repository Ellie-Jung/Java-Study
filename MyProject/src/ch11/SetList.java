package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetList {

	public static void main(String[] args) {

		Set <FootballPlayer> slist = new HashSet<>();
		
		slist.add(new FootballPlayer("º’",7,"«—±π∆¿",49));
		slist.add(new FootballPlayer("π⁄",2,"¥Î«—∆¿",35));
		slist.add(new FootballPlayer("±Ë",3,"«—±π∆¿",33));
		slist.add(new FootballPlayer("¿Ã",4,"¥Î«—∆¿",20));
		slist.add(new FootballPlayer("¿Ã",9,"¥Î«—∆¿",20));
		
		Iterator itr = slist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
