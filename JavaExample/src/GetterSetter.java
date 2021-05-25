class Singleton{
	private static Singleton s = new Singleton(); //클래스 내부에서는 인스턴스 생성가능.//getInstance()에서 사용될수 있도록 인스턴스가 미리 생성되어 있어야함으로 static이어야한다.
	private Singleton() {} //생성자의 접근 제어자를 private으로 지정시, 외부에서 생성자에 접근불가, 인스턴스 생성못함.
	//인스턴스를 생성하지 않고도 호출 할 수 있어야 하므로 static이어야한다. 
	public static Singleton getInstance() { //인스턴스를 생성해서 반환해주는 public 메서드 제공. 외부에서 이 클래스의 인스턴스를 사용할 수 있게됨
		return s;                           
	}
}

public class GetterSetter {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
