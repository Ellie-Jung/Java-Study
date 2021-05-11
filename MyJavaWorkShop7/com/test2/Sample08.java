package com.test2;
class BlackDog extends Dog{
	void  running() {System.out.println("BlackDog running");}
}
public class Sample08 {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		Animal animal = dog;
//		Dog dog2 = (Dog)animal;
		
//		Dog dog3= new Dog();
//		Animal animal2 = dog3;
//		Cat cat = (Cat)animal2; //오류. 형변환은 할수있지만 켓 타입은 객체가 없는 상태. 결국엔 오류남 (형제관계 캐스팅 노노)
	
//		Animal animal3  = new Animal();
//		Dog dog4 = (Dog)animal3; //오류.타입체킹은되지만 실제 수행시에 도그 객체가 없는상태. 오류(객체 존재하지 않는경우 하위 x)

		//blackdog
		BlackDog bkdog = new BlackDog();
		Dog dog5 = bkdog;
		Animal animal3 = dog5;
		dog5.breathing();
		BlackDog bkDog2 =(BlackDog)animal3;
		Dog  dog6 = (Dog)animal3;
		dog6.barking();
		dog6.breathing();
		
		
		BlackDog bkDog3=new BlackDog();
		Animal obj2 =bkDog3;
		//위에거 밑에 처럼많이 쓴다
		Animal obj = new BlackDog();
		
		Dog dog7 = new Dog();
		Animal obj4 =dog7; //이 두개 밑에처럼 표현 가능
		Animal obj3 = new Dog();
	}

}
