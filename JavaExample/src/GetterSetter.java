class Singleton{
	private static Singleton s = new Singleton(); //Ŭ���� ���ο����� �ν��Ͻ� ��������.//getInstance()���� ���ɼ� �ֵ��� �ν��Ͻ��� �̸� �����Ǿ� �־�������� static�̾���Ѵ�.
	private Singleton() {} //�������� ���� �����ڸ� private���� ������, �ܺο��� �����ڿ� ���ٺҰ�, �ν��Ͻ� ��������.
	//�ν��Ͻ��� �������� �ʰ� ȣ�� �� �� �־�� �ϹǷ� static�̾���Ѵ�. 
	public static Singleton getInstance() { //�ν��Ͻ��� �����ؼ� ��ȯ���ִ� public �޼��� ����. �ܺο��� �� Ŭ������ �ν��Ͻ��� ����� �� �ְԵ�
		return s;                           
	}
}

public class GetterSetter {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
