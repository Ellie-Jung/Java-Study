
public class Sample04 {

		//method 메소드, 함수, 프로시져 => swap
	public static void main(String[] args) {
		int price = 1000;
		float rate = 10.2f;
		float total = price * rate ;
		System.out.println(total);
		String LastName = "Dennis";
		String FirstName = "Lee";
		String FullName = LastName + " , " + FirstName;
	//	String FullName = LastName + FirstName;
		System.out.println(FullName);
	
		boolean check = true ;
		boolean check2 = false ; 
		System.out.println(check);
		System.out.println(check2);
		byte a2 = 10;
		//byte a3 = 100000;
		double a3 = 10.000d;
		System.out.println(a3);
		char a4 = 'd';
		System.out.println(a4);
		char a5 = '한';
		System.out.println(a5);
		
		String a6= "7"+7;
		System.out.println(a6);
		String a7= 7 + 7 +"8";
		System.out.println(a7);
		String name1 = "강감찬";
		String name2 = "세종대왕";
		String str = name2 + "이 " + name1+"보다 훌륭하다.";
		System.out.println(str);
		String str2 = "%s이 %s보다 훌륭하다.\n";
		
		System.out.printf(str2, "세종대왕", "강감찬");
		System.out.printf("%s이 %s보다 훌륭하다.", "세종대왕", "강감찬");
		
		
	}

}
