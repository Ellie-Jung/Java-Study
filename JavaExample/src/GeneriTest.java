import java.util.ArrayList;

public class GeneriTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add("30"); //��Ʈ���� �߰�
//		
//		Integer i = (Integer)list.get(2); //����ȯ. ������ OK // �޾ƿ��� ���� �� Ȯ������ ����. �����Ϸ��� �Ѱ�
//		
//		System.out.println(list); //�̴�� ����� ���� �߻� ( ����ù߻��ϴ� �������� �����Ͽ����� �� ����. �̸�Ȯ�ΰ���.
//		                          //�����  ���� �߻��ϸ� ���α׷��� ����.ġ����
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //Ÿ���� ����
		list2.add(50);
//		list2.add(g); //�߸��� Ÿ���� ������ �����Ϸ��� �����
		list2.add(40);
		list2.add(30);
		//����ȯ �������� 
		Integer i = list2.get(0);
		System.out.println(list2);
		System.out.println(i);
		
	}

}
