import java.util.*;
public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // -> 기본길이 (용량)10인 ArrayList생성
		//ArrayList에는 객체만 저장 가능
		list1.add(new Integer(5)); //list1.add(5); 가능. autoboxing에 의해 기본형이 참조형으로 자동 변환
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//List subList(int from,int to); ->지정된 범위에 있는 객체를 반환한다.
		List sub = list1.subList(1, 4); //sub는 읽기만 가능,1.2.3번째값 -> [4,2,0]
		ArrayList list2 = new ArrayList(sub); //한줄로ArrayList list2 = new ArrayList(list1.subList(1,4));
		
		//Collections.sort(List l) 이용해서 정렬
		Collections.sort(list1);  //list1과 list2를 정렬한다. list1= [0,1,2,3,4,5]
		Collections.sort(list2);  // list2 = [0,2,4]
		System.out.println(list1.contains(list2)); //true. list1이 list2의 모든 요소 포함하고 있다.
		
		list2.add("B");  
		list2.add("C");   
		list2.add(3,"A"); //list2 = [0,2,4,A,B,C] //add(Object obj)를 이용해서 새로운 객체를 저장함
		list2.set(3,"AA"); //list2 = [0,2,4,AA,B,C] //set(int index, Object obj)를 이용해서 다른 객체로 변경
		list1.add(0,"1"); //list1 = [1,0,1,2,3,4,5]
		
		//indexOf()는 지정된 객체의 위치를 알려준다. indexOf("1");ok.
		System.out.println(list1.indexOf(new String("1")));  //0번째 저장.
		list1.remove(new Integer(1)); //1을 삭제 list1 = [1,0,2,3,4,5]
		list1.remove(1);   //인덱스가 1인 객체를 삭제 list1 = [1,2,3,4,5]

		System.out.println(list1.retainAll(list2)); //list1,list2 겹치는 부분만 남기고 나머지는 삭제한다
		//list1 =[2,4]
		
		
	}
}
