import java.util.StringJoiner;

public class Join {

	public static void main(String[] args) {
		String animal = "dog, cat, bear";  
		String arr[]= animal.split(",");   //문자열을 ','구분자로 나눠서 배열에 저장
		String str = String.join("-",arr); //배열의 문자열 '-'로 구분해서 결합.
		System.out.println(str);    //dog - cat - bear
		
		StringJoiner sj = new StringJoiner(",","[","]");
		String [] strArr = {"aaa","bbb","ccc"};
		for (String s : strArr) 
			sj.add(s.toUpperCase());
		
		System.out.println(sj.toString()); //[AAA,BBB,CCC]
		
	}

}
