package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetList {

	public static void main(String[] args) {

		Set <FootballPlayer> slist = new HashSet<>();
		
		slist.add(new FootballPlayer("��",7,"�ѱ���",49));
		slist.add(new FootballPlayer("��",2,"������",35));
		slist.add(new FootballPlayer("��",3,"�ѱ���",33));
		slist.add(new FootballPlayer("��",4,"������",20));
		slist.add(new FootballPlayer("��",9,"������",20));
		
		Iterator itr = slist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
