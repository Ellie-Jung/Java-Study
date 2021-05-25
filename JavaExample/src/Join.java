import java.util.StringJoiner;

public class Join {

	public static void main(String[] args) {
		String animal = "dog, cat, bear";  
		String arr[]= animal.split(",");   //���ڿ��� ','�����ڷ� ������ �迭�� ����
		String str = String.join("-",arr); //�迭�� ���ڿ� '-'�� �����ؼ� ����.
		System.out.println(str);    //dog - cat - bear
		
		StringJoiner sj = new StringJoiner(",","[","]");
		String [] strArr = {"aaa","bbb","ccc"};
		for (String s : strArr) 
			sj.add(s.toUpperCase());
		
		System.out.println(sj.toString()); //[AAA,BBB,CCC]
		
	}

}
