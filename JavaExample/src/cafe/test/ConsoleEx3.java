package cafe.test;
import java.util.*;

public class ConsoleEx3 {
	static String[] argArr;                         // 입력한 매개변수를 담기위한 문자열배열
	static LinkedList q = new LinkedList(); // 사용자가 입력한 내용을 저장할 큐(Queue) -> 데이터의 추가삭제가 쉬운 링크드리스트이용
	static final int MAX_SIZE = 5;              // q(큐)에 저장될 수 있는 값의 개수

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); // 한번만 생성해서 재사용하면 되므로 반복문 밖으로 이동

		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			String input = s.nextLine();// 화면으로부터 라인단위로 입력받는다. 

			save(input);

			input = input.trim();        // 입력받은 값에서 불필요한 앞뒤 공백을 제거한다.
			argArr = input.split(" +");  // 엔터를 기준으로 나눠서 argArr배열에 담는다. (여러개의 공백처리를 위해 +사용)

			String command = argArr[0].trim();

			if("".equals(command)) continue;

			command = command.toLowerCase(); // 명령어를 소문자로 바꾼다.

			if(command.equals("q")) { // q 또는 Q를 입력하면 실행종료한다.
				System.exit(0);
			} else if(command.equals("history")) {  // equalsIgnoreCase대신 equals를 사용.
				history();
			} else {
				for(int i=0; i < argArr.length;i++) {
					System.out.println(argArr[i]);
				}
			}
		} // while(true)
	} // main

	public static void save(String input) {
		if(input==null || "".equals(input)) return;
		
		q.offer(input); //1. queue에 저장한다.
		if(q.size()>MAX_SIZE) { //2. queue의 최대크기(MAX_SIZE)를 넣으면 제일 오래된 저장값을 삭제한다. 
			q.remove();
		}
	}

	// 사용자가 입력한 최근 명령을 보여주는 메서드
	public static void history() {
		int i=0;
		//LinkedList에 저장된 내용(최근 MAZ_SIZE개의 명령어)을 보여준다.
		ListIterator it = q.listIterator();//저장된 요소들 읽어오기.
		while(it.hasNext()) { //읽어올 요소가 남았는지확인
			System.out.println(++i+"."+it.next()); //다음요소 읽어오기.
		}
	
		
	}
} // class