abstract class Unit{
	int x, y;
	abstract void move (int x, int y);
	void stop() {System.out.println("����ϴ�.");}
}

interface Fightable{
	void move(int x, int y);  //public abstract ������
	void attack(Fightable f); //public abstract ������
}

class Fighter extends Unit implements Fightable{
	//�������̵� ��Ģ : ���󺸴� ���� �����ڰ� ������ �ȵȴ�.
	public void move(int x, int y) { //public�Ⱦ��� ����Ʈ�ϱ� �������. �������̽� ��� �޼ҵ�� public abstract.
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	public void attack (Fightable f) {
		 System.out.println(f+"�� ����");
	}
	//�ο�� �ִ� ��븦 �ҷ��´�
	Fightable getFighterble() { //Fighter �����ؼ� ��ȯ
		Fighter f = new Fighter();
		return f; //(Fighterble)f �� ��������
	}
}
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
//	 ���� ��ſ� Fightable ��밡��
		//Fightable f = new Fighter();
// Unit f = new Fighter(); //Unit 2���� attack()��� ȣ�� �Ұ�		
		f.move(100,200);
		f.attack(new Fighter());
		// Fighter f2 = new Fighter();
		// f.attack(f2);
	
		Fighter f1 = new Fighter();
		Fightable f2 = f.getFighterble();
	}

}
