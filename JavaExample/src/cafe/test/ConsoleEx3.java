package cafe.test;
import java.util.*;

public class ConsoleEx3 {
	static String[] argArr;                         // �Է��� �Ű������� ������� ���ڿ��迭
	static LinkedList q = new LinkedList(); // ����ڰ� �Է��� ������ ������ ť(Queue) -> �������� �߰������� ���� ��ũ�帮��Ʈ�̿�
	static final int MAX_SIZE = 5;              // q(ť)�� ����� �� �ִ� ���� ����

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); // �ѹ��� �����ؼ� �����ϸ� �ǹǷ� �ݺ��� ������ �̵�

		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			String input = s.nextLine();// ȭ�����κ��� ���δ����� �Է¹޴´�. 

			save(input);

			input = input.trim();        // �Է¹��� ������ ���ʿ��� �յ� ������ �����Ѵ�.
			argArr = input.split(" +");  // ���͸� �������� ������ argArr�迭�� ��´�. (�������� ����ó���� ���� +���)

			String command = argArr[0].trim();

			if("".equals(command)) continue;

			command = command.toLowerCase(); // ��ɾ �ҹ��ڷ� �ٲ۴�.

			if(command.equals("q")) { // q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
				System.exit(0);
			} else if(command.equals("history")) {  // equalsIgnoreCase��� equals�� ���.
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
		
		q.offer(input); //1. queue�� �����Ѵ�.
		if(q.size()>MAX_SIZE) { //2. queue�� �ִ�ũ��(MAX_SIZE)�� ������ ���� ������ ���尪�� �����Ѵ�. 
			q.remove();
		}
	}

	// ����ڰ� �Է��� �ֱ� ����� �����ִ� �޼���
	public static void history() {
		int i=0;
		//LinkedList�� ����� ����(�ֱ� MAZ_SIZE���� ��ɾ�)�� �����ش�.
		ListIterator it = q.listIterator();
		while(it.hasNext()) {
			System.out.println(++i+"."+it.next());
		}
	
		
	}
} // class
