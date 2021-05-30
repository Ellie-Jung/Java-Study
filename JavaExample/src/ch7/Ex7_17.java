package ch7;
class Unit{
	int x, y;
	void move(int x, int y) {}
	void stop() {};
}
class Marine extends Unit {
	void move(int x, int y) {}
	void changeMode() {}
}
class Tank extends Unit{
	void move(int x, int y) {}
	void changeMode(){};
}
class Dropship extends Unit{
	void move(int x, int y) {}
	void loda(){}
	void unload() {}
}
public class Ex7_17 {
	public static void main(String[] args) {
		

	}

}
