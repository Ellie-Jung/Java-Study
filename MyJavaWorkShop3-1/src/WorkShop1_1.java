import java.util.Scanner;

public class WorkShop1_1 {
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {
		
		
		System.out.println("=======메뉴=======");
		System.out.println("1. 아메리카노 2000원");
		System.out.println("2. 카페라떼  3000원");
		System.out.println("3. 베이글   1500원");
		System.out.println("4. 크림치즈   500원");
		System.out.println("=================");
		
		System.out.println("주문수량을 입력하세요");
		
		System.out.println("=======주문=======");
		System.out.print("아메리카노 주문 수량 : ");
		int num = getUserInput();
		System.out.print("카페라떼 주문 수량 : ");
		int num2 = getUserInput();
		System.out.print("베이글 주문 수량 : ");
		int num3 = getUserInput();
		System.out.print("크림치즈 주문 수량 : ");
		int num4 = getUserInput();
		
		System.out.println("========금액=======");
		int b1 = 2000;
		System.out.printf("아메리카노 : %d원%n", num*b1);
		int b2 = 3000;
		System.out.printf("카페라떼 : %d원%n", num2*b2);
		int b3 = 1500;
		System.out.printf("베이글 : %d원%n", num3*b3);
		int b4 = 500;
		System.out.printf("크림치즈 :%d원%n", num4*b4);
		System.out.println("=======================");
		
		double point;
		int total = (num*b1)+ (num2*b2)+ (num3*b3)+(num4*b4);
		
		System.out.printf("총 구매금액 :%d원\n ",total);
		
//		if (total >=30000) {
//			point = total*0.02;
//			System.out.printf("포인트적립 : %.0f원",point);
//		}else if(total>12000) {
//			point= total*0.01;
//			System.out.printf("포인트적립 : %0.f원",point);
//		} else
//			System.out.println("포인트 적립 :0원");
		
		if (total >=30000) {
			point = total*0.02;
			
		}else if(total>12000) {
			point= total*0.01;
			
		} else
			point = 0;
		
		System.out.printf("포인트적립 : %d원",(int)point);
		
		
	}

}
