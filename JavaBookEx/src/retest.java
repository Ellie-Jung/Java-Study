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
			System.out.println("########�޴�########");
			System.out.println("#1. ��Ģ����");
			System.out.println("#2. ����");
			System.out.println("#################");
			System.out.println("# �׸��� �������ּ���. : ");
			menu = Input.inputInt();

			if(menu==2) {
				System.out.println("����");
				break;
			}else if(menu==1) { 
				System.out.println("�����ڸ� �������ּ���. (+,-,*,/)");
				select  = Input.inputString();
				System.out.println("ù ��° ���ڸ� �Է����ּ��� : ");
				num1=Input.inputInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ��� : ");
				num2 =Input.inputInt();

				if(select.equals("+")) {
					int result = num1+num2;
					System.out.printf("����� %d %s %d = %d\n",num1,select,num2,result);
				}else if(select.equals("-")) {
					int result = num1-num2;
					System.out.printf("����� %d %s %d = %d\n",num1,select,num2,result);
				}else if(select.equals("*")) {
					int result = num1*num2;
					System.out.printf("����� %d %s %d = %d\n",num1,select,num2,result);
				}else if(select.equals("/")){
					double result = num1/num2;
					System.out.printf("����� %d %s %d = %.0f\n",num1,select,num2,result);
				}else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}


			}
		}
	}


}
