abstract class Player{
	int currentPos; 	// ���� play �ǰ� �ִ� ��ġ �����ϱ� ���� ����
	
	Player(){ currentPos = 0;}   		//�߻� Ŭ������ �����ڰ� �־�� �Ѵ�.
	
	abstract void play(int pos);       //�߻� �޼���
	abstract void stop();				//�߻�޼���

	void play() { play(currentPos); } 		//�߻� �޼��带 ����� �� �ִ�.
}
class AudioPlayer extends Player{
	void play (int pos) {};
	void stop () {};
}
abstract class AbstratPlayer extends Player{
	void play(int pos) {};
}

interface Movable{ void move(int x, int y);}
interface Attackable{ void attack (Unit u);}
interface Fightable1 extends Movable, Attackable{}

class Fighter1 extends Unit implements Fightable1{
	public void move(int x, int y) {}
	public void attack(Unit u) {}
}

public class ex1 {

}
