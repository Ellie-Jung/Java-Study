package cafe.test;

import java.util.Scanner;

public class WordScrambleEx3 {

	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
		Scanner sc = new Scanner(System.in);

		// �ڵ带 �־� �ϼ��ϼ���.
		while(true) {
			String answer = getAnswer(strArr);
			String question = getScrambledWord(answer);
			while(true) {

				System.out.println("Question : " +question);
				System.out.print("Your answer is : " );
				String input = sc.nextLine();
				if(input.equalsIgnoreCase("Q")) {
					System.exit(0); //��� �ݺ��� �� �����ϰ� ����������
				}
				if(input.equalsIgnoreCase(answer)) {
					System.out.println("�����Դϴ�. ");
					break;
				}else {
					System.out.println(input+"��/�� ������ �ƴմϴ�. �ٽ� �õ����ּ���.");
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
