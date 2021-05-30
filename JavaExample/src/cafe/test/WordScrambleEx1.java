package cafe.test;

public class WordScrambleEx1 {

	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);

		System.out.println("Question:"+question);
		System.out.println("Answer:"+answer);
	} // main

	public static String getAnswer(String[] strArr) { 
		int n = (int)(Math.random()*strArr.length);
		return strArr[n];
	}

	public static String getScrambledWord(String str) { 
		char [] ch = str.toCharArray();
		for(int i=0; i<ch.length;i++) {
			int n =(int)(Math.random()*ch.length);
			char tmp = ch[i];
			ch[i] = ch[n];
			ch[n]= tmp;
		}
		//String s = new String(ch); //char[]배열을 다시 문자열로 만들기
		return new String(ch);
	}

}
