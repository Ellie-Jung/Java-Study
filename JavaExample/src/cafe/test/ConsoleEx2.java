package cafe.test;
import java.util.Scanner;

class ConsoleEx2 {

	static String[] argArr;       // �Է��� �Ű������� ������� ���ڿ��迭
	public static void main(String[] args) {
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);

			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();

			//�Է¹��� ������ �յ� ���� ������, ��ɶ����� ������ ������ �����ڷ��ؼ� argArr�� ��´�
			//�̶� ������ �ϳ� �̻��� ��쿡�� �ϳ��� �������� �����ؾ��� 
			argArr= input.trim().split(" +");  // +�� ���Խ�ǥ���� +���� ���ڰ� �ϳ��̻��� ���Ѵ�. �̷����ϸ� �������ϳ��̻��ΰ�쵵 �� ���ŵ�

			if(input.equalsIgnoreCase("Q")) { // q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
				System.exit(0);
			} else {
				for(int i=0; i < argArr.length;i++) {
					System.out.println(argArr[i]);
				}
				/* ���� �ڵ带 ���� for������ �����ϸ� ������ ����.
                      for(String arg : argArr) {
                            System.out.println(arg);                                                      
                      }
				 */
			}
		} // while(true)
	} // main
} // class
