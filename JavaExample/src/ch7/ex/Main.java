package ch7.ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FriendFuntion f = new FriendFuntion(100);
		for(;;) {
			System.out.println("##### 메뉴선택 #####");
			System.out.println("1. 고교동창 저장");
			System.out.println("2. 대학동창 저장");
			System.out.println("3. 저장된 정보 보기");
			System.out.println("4. 저장된 정보 간단히 보기");
			System.out.println("5. 종료");
			System.out.println("###################");

			Scanner sc = new Scanner(System.in);

			System.out.println();
			System.out.print("번호를 입력해주세요");
			int choice = sc.nextInt();

			switch(choice) {
			case 1 :
			case 2 :
				f.add(choice);
				break;
			case 3 :
				f.showAllData();
				break;
			case 4 :
				f.showBasicData();
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
