package cafe.test;
import java.util.Scanner;

class ConsoleEx2 {

	static String[] argArr;       // 입력한 매개변수를 담기위한 문자열배열
	public static void main(String[] args) {
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);

			// 화면으로부터 라인단위로 입력받는다.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();

			//입력받은 값에서 앞뒤 공백 제거후, 명령라인의 내용을 공백을 구분자로해서 argArr에 담는다
			//이때 공백이 하나 이상인 경우에도 하나의 공백으로 간주해야함 
			argArr= input.trim().split(" +");  // +는 정규식표현중 +앞의 문자가 하나이상을 뜻한다. 이렇게하면 공백이하나이상인경우도 다 제거됨

			if(input.equalsIgnoreCase("Q")) { // q 또는 Q를 입력하면 실행종료한다.
				System.exit(0);
			} else {
				for(int i=0; i < argArr.length;i++) {
					System.out.println(argArr[i]);
				}
				/* 위의 코드를 향상된 for문으로 변경하면 다음과 같다.
                      for(String arg : argArr) {
                            System.out.println(arg);                                                      
                      }
				 */
			}
		} // while(true)
	} // main
} // class