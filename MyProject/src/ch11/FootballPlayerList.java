package ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FootballPlayerList {

	public static void main(String[] args) {

		List<FootballPlayer> list = new ArrayList<>();
		list.add(new FootballPlayer("��",7,"�ѱ���",49));
		list.add(new FootballPlayer("��",2,"������",35));
		list.add(new FootballPlayer("��",3,"�ѱ���",33));
		list.add(new FootballPlayer("��",4,"������",20));
		
		Iterator<FootballPlayer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
