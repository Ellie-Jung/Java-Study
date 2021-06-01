package cafe.test;

public class SimpleQuiz1 {

	public static void main(String[] args) {
		String [] data = {
				"다음 중 키워드가 아닌 것은? `2`final`True`if`public",
				"다음 중 자바의 연산자가 아닌 것은?`5`&`|`++`!=`/`^",
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는? `1`void`null`false",
		};
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
		}
		System.out.println();
	}
}


