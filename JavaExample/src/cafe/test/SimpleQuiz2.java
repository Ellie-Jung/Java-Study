package cafe.test;

import java.util.Scanner;

public class SimpleQuiz2 { //문제 1에서 완성된 코드에 사용자 입력을 받아서 정답여부를 판단하여 마지막에 최종점수를 실행결과와같이 출력하도록.

	public static void main(String[] args) {
		String [] data = {
				"다음 중 키워드가 아닌 것은? `2`final`True`if`public",
				"다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^",
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는? `1`void`null`false",
		};
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int count = 0;
		
		for(int i =0; i<data.length; i++) {
			
			//1. String클래스의 String[] split(String regex, int limit)을 사용해서 문제와 선택지를 나누세요.
			String[] tmp = data[i].split("`", 3);
			String question = tmp[0];
			String anwer = tmp[1];
			String []choice = tmp[2].split("`");
			
			//2. 문제를 출력하세요
			System.out.println("["+(i+1)+"]" + question);

			//3. 선택지를 나누기 위해 String[]split(String regex)를 사용하세요.
			for(int j =0; j<choice.length;j++) {
				System.out.print((j+1)+"."+choice[j]+"\t");
			}System.out.println();
			
			System.out.print("[답]");
			String input = sc.nextLine();
			input = input.trim();
			System.out.println();
			
			if(anwer.equals(input)) {
				count++;
			}
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println("정답개수 / 전체 문항수"+count +"/"+ data.length);
	}
}

