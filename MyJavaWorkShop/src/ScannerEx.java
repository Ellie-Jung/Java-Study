import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //문자로 들어온 숫자를 인티져 숫자로 바꿔줌
		
		System.out.println("입력내용 :" + input);
		System.out.println("숫자는 :" +num); // 문자열로 바뀜. "7"+7 => "77"
		System.out.printf("num=%d%n", num);
	}

}
