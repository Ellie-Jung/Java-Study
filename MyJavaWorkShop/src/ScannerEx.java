import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �Է����ּ���.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //���ڷ� ���� ���ڸ� ��Ƽ�� ���ڷ� �ٲ���
		
		System.out.println("�Է³��� :" + input);
		System.out.println("���ڴ� :" +num); // ���ڿ��� �ٲ�. "7"+7 => "77"
		System.out.printf("num=%d%n", num);
	}

}
