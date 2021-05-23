abstract class Player{
	int currentPos; 	// 현재 play 되고 있는 위치 저장하기 위한 변수
	
	Player(){ currentPos = 0;}   		//추상 클래스도 생성자가 있어야 한다.
	
	abstract void play(int pos);       //추상 메서드
	abstract void stop();				//추상메서드

	void play() { play(currentPos); } 		//추상 메서드를 사용할 수 있다.
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
