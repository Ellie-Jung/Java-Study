package cafe.test;

import java.util.Scanner;

public class SimpleQuiz3 { //문제 2에서 완성된 코드를 이용해서, 문제의 순서를 임의로 바꾸고, 선택지도 임의로 바꾸어 출력되도록.

	public static void main(String[] args) {
		String [] data = {
				"다음 중 키워드가 아닌 것은? `2`final`True`if`public",
				"다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^",
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는? `1`void`null`false",
		};

		Scanner sc = new Scanner(System.in);
		int score = 0;

		shuffle(data); //문제를 섞는다.

		for(int i =0; i<data.length; i++) {
			String[] tmp = data[i].split("`", 3);
			String question = tmp[0];
			String anwer = tmp[1];
			String []choices = tmp[2].split("`");

			anwer = choices[Integer.parseInt(anwer)-1];

			shuffle(choices);//선택지를 섞는다.

			System.out.println("["+(i+1)+"]" + question);

			for(int j =0; j<choices.length;j++) {
				if(anwer.equals(choices[j])) {
//					anwer = Integer.toString(j+1);
//					anwer = String.valueOf(j+1);
					anwer = ""+(j+1);
				}
				System.out.print((j+1)+"."+choices[j]+"\t");
			}System.out.println();

			System.out.print("[답]");
			String input = sc.nextLine();
			input = input.trim();
			System.out.println();

			if(anwer.equals(input)) {
				score++;
			}


		}
		System.out.println();
		System.out.println();
		System.out.println("정답개수 / 전체 문항수"+score +"/"+ data.length);
	}

	public static void shuffle(String[] data) {
		//코드를 완성하세요.
		//1. 배열 data의 개수가 0보다 같거나 적으면 메서드 전체를 빠져나간다.
		//2. 선택지의 순서를 뒤바꾼다. 반복문과 Math.random() 사용
		if(data.length<=0) {
			return;
		}
		int n = (int)(Math.random()*data.length);
		String tmp;
		for(int i =0; i<data.length; i++) {
			tmp= data[i] ;
			data[i] = data[n];
			data[n] = tmp;
		}
	}
}

