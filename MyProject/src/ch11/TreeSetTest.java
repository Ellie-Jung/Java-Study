package ch11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		//정렬시켜야함 트리셋
		Set<FootballPlayer> tlist = new TreeSet<>();
		
		tlist.add(new FootballPlayer("손",7,"한국팀",49));
		tlist.add(new FootballPlayer("손",8,"한국팀",49));
		tlist.add(new FootballPlayer("박",2,"대한팀",35));
		tlist.add(new FootballPlayer("김",3,"한국팀",33));
		tlist.add(new FootballPlayer("이",4,"대한팀",20));
		tlist.add(new FootballPlayer("이",9,"대한팀",20));
		
		Iterator itr = tlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
