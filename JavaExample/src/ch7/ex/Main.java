package ch7.ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FriendFuntion f = new FriendFuntion(100);
		for(;;) {
			System.out.println("##### �޴����� #####");
			System.out.println("1. ����â ����");
			System.out.println("2. ���е�â ����");
			System.out.println("3. ����� ���� ����");
			System.out.println("4. ����� ���� ������ ����");
			System.out.println("5. ����");
			System.out.println("###################");

			Scanner sc = new Scanner(System.in);

			System.out.println();
			System.out.print("��ȣ�� �Է����ּ���");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
