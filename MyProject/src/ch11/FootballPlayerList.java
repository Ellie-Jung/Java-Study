package ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FootballPlayerList {

	public static void main(String[] args) {

		List<FootballPlayer> list = new ArrayList<>();
		list.add(new FootballPlayer("º’",7,"«—±π∆¿",49));
		list.add(new FootballPlayer("π⁄",2,"¥Î«—∆¿",35));
		list.add(new FootballPlayer("±Ë",3,"«—±π∆¿",33));
		list.add(new FootballPlayer("¿Ã",4,"¥Î«—∆¿",20));
		
		Iterator<FootballPlayer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
