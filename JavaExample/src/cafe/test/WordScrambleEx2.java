package cafe.test;

import java.util.Scanner;

public class WordScrambleEx2 {

	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("Question :" + question);
			System.out.print("Your answer is :"); 
			
			String input = sc.nextLine();
			if(input.toUpperCase().equals("Q"))// 사용자로부터 받은 값을 모두 대문자로 변환하기.
				break;
			
			if(answer.toUpperCase().equals(input)) {
				break;
			}
			// 3. 사용자가 정답을 맞출때까지 반복하다가
			//     사용자가 정답을 맞추면, while문을 빠져나간다.
			
		} // while

	} // main

	public static String getAnswer(String[] strArr) {
		int idx = (int)(Math.random()*strArr.length);
		return strArr[idx];
	}

	public static String getScrambledWord(String str) {
		char[] chArr = str.toCharArray();

		for(int i=0;i<str.length();i++) {
			int idx = (int)(Math.random()*str.length());

			char tmp = chArr[i];
			chArr[i] = chArr[idx];
			chArr[idx] = tmp;
		}

		return new String(chArr);

	}

}
