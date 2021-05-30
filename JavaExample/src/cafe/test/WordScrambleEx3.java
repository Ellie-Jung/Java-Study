package cafe.test;

import java.util.Scanner;

public class WordScrambleEx3 {

	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
		Scanner sc = new Scanner(System.in);

		// 코드를 넣어 완성하세요.
		while(true) {
			String answer = getAnswer(strArr);
			String question = getScrambledWord(answer);
			while(true) {

				System.out.println("Question : " +question);
				System.out.print("Your answer is : " );
				String input = sc.nextLine();
				if(input.equalsIgnoreCase("Q")) {
					System.exit(0); //모든 반복문 다 종료하고 빠져나가기
				}
				if(input.equalsIgnoreCase(answer)) {
					System.out.println("정답입니다. ");
					break;
				}else {
					System.out.println(input+"은/는 정답이 아닙니다. 다시 시도해주세요.");
				}
			}
		}
	} // main

	public static String getAnswer(String[] strArr) {
		int idx = (int)(Math.random()*strArr.length);
		return strArr[idx];
	}

	public static String getScrambledWord(String str) {
		char[] chArr = str.toCharArray();
		for(int i=0;i < str.length();i++) {
			int idx = (int)(Math.random()*str.length());
			char tmp = chArr[i];
			chArr[i] = chArr[idx];
			chArr[idx] = tmp;
		}
		return new String(chArr);
	}
}
