class Person{
	long id;
	public boolean equals(Object obj) {
		if (obj instanceof Person) 
			return id == ((Person)obj).id; //obj�� ObjectŸ���̹Ƿ� id���� �����ϱ� ���ؼ��� PersonŸ������ ����ȯ �ʿ�
		else {
			return false;
		}
	}
	Person(long id) {
		this.id=id;
	}
}

public class EqualsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
