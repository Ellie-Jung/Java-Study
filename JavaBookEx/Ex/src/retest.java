import java.util.Scanner;

class Cal{
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	double div(int a, int b) {
		return a/b;
	}
}
class  Input{
	static Scanner scanner = new Scanner(System.in);
	static int inputInt() {
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	static String inputString() {
		return scanner.nextLine();
	}
}
public class retest {

	public static void main(String[] args) {
		int menu,num1,num2;
		String select;

		for(;;) {
			System.out.println("########메뉴########");
			System.out.println("#1. 사칙연산");
			System.out.println("#2. 종료");
			System.out.println("#################");
			System.out.println("# 항목을 선택해주세요. : ");
			menu = Input.inputInt();

			if(menu==2) {
				System.out.println("종료");
				break;
			}else if(menu==1) { 
				System.out.println("연산자를 선택해주세요. (+,-,*,/)");
				select  = Input.inputString();
				System.out.println("첫 번째 숫자를 입력해주세요 : ");
				num1=Input.inputInt();
				System.out.println("두 번째 숫자를 입력해주세요 : ");
				num2 =Input.inputInt();

				if(select.equals("+")) {
					int result = num1+num2;
					System.out.printf("결과는 %d %s %d = %d\n",num1,select,num2,result);
				}else if(select.equals("-")) {
					int result = num1-num2;
					System.out.printf("결과는 %d %s %d = %d\n",num1,select,num2,result);
				}else if(select.equals("*")) {
					int result = num1*num2;
					System.out.printf("결과는 %d %s %d = %d\n",num1,select,num2,result);
				}else if(select.equals("/")){
					double result = num1/num2;
					System.out.printf("결과는 %d %s %d = %.0f\n",num1,select,num2,result);
				}else {
					System.out.println("잘못입력하셨습니다.");
				}


			}
		}
	}


}
