package ch11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		//���Ľ��Ѿ��� Ʈ����
		Set<FootballPlayer> tlist = new TreeSet<>();
		
		tlist.add(new FootballPlayer("��",7,"�ѱ���",49));
		tlist.add(new FootballPlayer("��",8,"�ѱ���",49));
		tlist.add(new FootballPlayer("��",2,"������",35));
		tlist.add(new FootballPlayer("��",3,"�ѱ���",33));
		tlist.add(new FootballPlayer("��",4,"������",20));
		tlist.add(new FootballPlayer("��",9,"������",20));
		
		Iterator itr = tlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
