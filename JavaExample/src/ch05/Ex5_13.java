package ch05;

import java.util.Scanner;

public class Ex5_13 {

	public static void main(String[] args) {
		String [] words = {"television", "computer","mouse","phone"};
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<words.length;i++) {
			char[] question = words[i].toCharArray(); //String�� char[]�� ��ȯ
			/*char�迭 question �� ��� ������ ��ġ�� ���Ƿ� �ٲ۴�*/
			char tmp;
			for(int j =0; j<question.length ;j++) {
				int n = (int)(Math.random()*4);
				tmp = question[n];
				question[n]=question[i];
				question[i]=tmp;
			}


			System.out.printf("Q%d/ %s�� ������ �Է��ϼ���. >",i+1,new String(question));
			String answer = sc.nextLine();

			//trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if(words[i].equals(answer.trim())) {
				System.out.printf("�¾ҽ��ϴ�. %n%n");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. %n%n");
			}


		}

	}

}