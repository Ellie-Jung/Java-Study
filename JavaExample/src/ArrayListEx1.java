import java.util.*;
public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // -> �⺻���� (�뷮)10�� ArrayList����
		//ArrayList���� ��ü�� ���� ����
		list1.add(new Integer(5)); //list1.add(5); ����. autoboxing�� ���� �⺻���� ���������� �ڵ� ��ȯ
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//List subList(int from,int to); ->������ ������ �ִ� ��ü�� ��ȯ�Ѵ�.
		List sub = list1.subList(1, 4); //sub�� �б⸸ ����,1.2.3��°�� -> [4,2,0]
		ArrayList list2 = new ArrayList(sub); //���ٷ�ArrayList list2 = new ArrayList(list1.subList(1,4));
		
		//Collections.sort(List l) �̿��ؼ� ����
		Collections.sort(list1);  //list1�� list2�� �����Ѵ�. list1= [0,1,2,3,4,5]
		Collections.sort(list2);  // list2 = [0,2,4]
		System.out.println(list1.contains(list2)); //true. list1�� list2�� ��� ��� �����ϰ� �ִ�.
		
		list2.add("B");  
		list2.add("C");   
		list2.add(3,"A"); //list2 = [0,2,4,A,B,C] //add(Object obj)�� �̿��ؼ� ���ο� ��ü�� ������
		list2.set(3,"AA"); //list2 = [0,2,4,AA,B,C] //set(int index, Object obj)�� �̿��ؼ� �ٸ� ��ü�� ����
		list1.add(0,"1"); //list1 = [1,0,1,2,3,4,5]
		
		//indexOf()�� ������ ��ü�� ��ġ�� �˷��ش�. indexOf("1");ok.
		System.out.println(list1.indexOf(new String("1")));  //0��° ����.
		list1.remove(new Integer(1)); //1�� ���� list1 = [1,0,2,3,4,5]
		list1.remove(1);   //�ε����� 1�� ��ü�� ���� list1 = [1,2,3,4,5]

		System.out.println(list1.retainAll(list2)); //list1,list2 ��ġ�� �κи� ����� �������� �����Ѵ�
		//list1 =[2,4]
		
		
	}
}
