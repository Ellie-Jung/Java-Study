class MyString{}
public class Sample06 {

	public static void main(String[] args) {
		//Reference Type- String
		String name = "�̼���";
		String name2 = "�̼���";
		boolean check = (name ==name2)? true : false ;
		System.out.println(check);
		
		String name3  = new String("�̼���"); //new�� ����� ���ο� ��ü ����
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