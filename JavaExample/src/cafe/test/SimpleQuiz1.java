package cafe.test;

public class SimpleQuiz1 {

	public static void main(String[] args) {
		String [] data = {
				"���� �� Ű���尡 �ƴ� ����? `2`final`True`if`public",
				"���� �� �ڹ��� �����ڰ� �ƴ� ����?`5`&`|`++`!=`/`^",
				"���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����? `1`void`null`false",
		};
		for(int i =0; i<data.length; i++) {
			
			//1. StringŬ������ String[] split(String regex, int limit)�� ����ؼ� ������ �������� ��������.
			String[] tmp = data[i].split("`", 3);
			String question = tmp[0];
			String anwer = tmp[1];
			String []choice = tmp[2].split("`");
			
			//2. ������ ����ϼ���
			System.out.println("["+(i+1)+"]" + question);

			//3. �������� ������ ���� String[]split(String regex)�� ����ϼ���.
			for(int j =0; j<choice.length;j++) {
				System.out.print((j+1)+"."+choice[j]+"\t");
			}System.out.println();
		}
		System.out.println();
	}
}


