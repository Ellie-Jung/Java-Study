abstract class Unit{
	int x, y;
	abstract void move (int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable{
	void move(int x, int y);  //public abstract 생략됨
	void attack(Fightable f); //public abstract 생략딤
}

class Fighter extends Unit implements Fightable{
	//오버라이딩 규칙 : 조상보다 접근 제어자가 좁으면 안된다.
	public void move(int x, int y) { //public안쓰면 디폴트니깐 적어야함. 인터페이스 모든 메소드는 public abstract.
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack (Fightable f) {
		 System.out.println(f+"를 공격");
	}
	//싸울수 있는 상대를 불러온다
	Fightable getFighterble() { //Fighter 생성해서 반환
		Fighter f = new Fighter();
		return f; //(Fighterble)f 랑 같은거임
	}
}
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
//	 위에 대신에 Fightable 사용가능
		//Fightable f = new Fighter();
// Unit f = new Fighter(); //Unit 2에는 attack()없어서 호출 불가		
		f.move(100,200);
		f.attack(new Fighter());
		// Fighter f2 = new Fighter();
		// f.attack(f2);
	
		Fighter f1 = new Fighter();
		Fightable f2 = f.getFighterble();
	}

}
