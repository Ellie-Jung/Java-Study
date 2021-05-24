class Person{
	long id;
	public boolean equals(Object obj) {
		if (obj instanceof Person) 
			return id == ((Person)obj).id; //obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환 필요
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
