package com.test2;

class Unit{
	int currentHP;
	int x;
	int y;
}
interface Fightable extends Movable, Attackable{}
interface Movable{void move(int x,int y);}
interface Attackable{void attack (Unit u);}

class Fighter extends Unit implements Fightable{
	public void move(int x,int y) {}
	public void attack(Unit u) {}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f= new Fighter();
		if (f instanceof Unit)
			System.out.println("f�� UnitŬ������ �ڼ��̴�.");
		if (f instanceof Fightable)
			System.out.println("f�� Fightable �������̽��� �����ߴ�.");
		if (f instanceof Movable)
			System.out.println("f�� Movable �������̽��� �����ߴ�.");
		if(f instanceof Attackable)
			System.out.println("f�� Attackable �������̽��� �����ߴ�.");
		if (f instanceof Object)
			System.out.println("f�� ObjectŬ������ �ڼ��̴�.");
	}

}