class MyString{}
public class Sample06 {

	public static void main(String[] args) {
		//Reference Type- String
		String name = "이순신";
		String name2 = "이순신";
		boolean check = (name ==name2)? true : false ;
		System.out.println(check);
		
		String name3  = new String("이순신"); //new로 만들면 새로운 객체 생성
		boolean check2 = (name ==name3)? true : false ;
		System.out.println(check2);
		
		boolean check3 = (name.equals(name3))?true: false;
		System.out.println(check3);
		
		MyClass m = new MyClass();
		MyClass m2 = m ;
		boolean check4 = (m2==m)? true: false;
		System.out.println(check4);
		
		MyClass m3 = new MyClass();
		boolean check5 = (m3==m)? true: false;
		System.out.println(check5);
		
	}

}
class MyClass {}