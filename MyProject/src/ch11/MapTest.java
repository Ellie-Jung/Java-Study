package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map <Integer, FootballPlayer> map = new HashMap<>();

		map.put(3, new FootballPlayer("��", 3, "�ѱ�", 30));
		map.put(4, new FootballPlayer("��", 4, "�ѱ�", 33));
		map.put(8, new FootballPlayer("��", 8, "�ѱ�", 19));
		map.put(9, new FootballPlayer("Ŵ", 9, "�ѱ�", 53));

		Iterator itr = map.entrySet().iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}



		Set<Integer> set = map.keySet();
		Iterator <Integer> itr2 = set.iterator();
		while(itr2.hasNext()) {
			System.out.println(map.get(itr2.next()));
		}

	}

}
