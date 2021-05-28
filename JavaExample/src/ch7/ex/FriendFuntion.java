package ch7.ex;

import java.util.Scanner;

public class FriendFuntion {

	Friend [] friends;
	int numOfFriend;

	FriendFuntion(int num) { //���ο��� ȣ���ؼ� �� �ν��Ͻ��� ������ �����Ѵ�. 
		friends= new Friend[num];
		numOfFriend = 0;
	}

	//�������� �Է�ó��
	//����ڷκ��� ģ���� ������ �Է� �޾Ƽ� -> �ν��Ͻ��� ���� -> �迭�� ����
	void add(int choice) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ��� >>");
		String name = sc.nextLine();
		System.out.print("��ȣ�� �Է��ϼ��� >>");
		String phonNum = sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ��� >>");
		String address = sc.nextLine();

		if (choice ==1) {
			System.out.print("������ �Է��ϼ��� >>");
			String job = sc.nextLine();
//			friends [numOfFriend++]=new HighFriend(name, phonNum, address, job);
			addFriendInfo(new HighFriend(name, phonNum, address, job));

		}else {
			System.out.print("������ �Է��ϼ��� >>");
			String major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phonNum, address, major));
		}
	}

	//Friend Ŭ������ ����ϴ� Ÿ���� �ν��Ͻ��� �޾� �迭�� ����
	public void addFriendInfo(Friend f) {
		friends [numOfFriend++] = f; //�迭�� ��� �߰�
		System.out.println("������ ����Ǿ����ϴ�.");
	}

	void showAllData() {
		System.out.println("====================");
		System.out.println("��� ������ ����մϴ� .");
		if(numOfFriend>0) {
			for(int i=0; i<numOfFriend;i++) {
				friends[i].showData();
				System.out.println("-------------------");
			}
		}else {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		System.out.println("-------------------");
	}
	void showBasicData() {
		System.out.println("====================");
		System.out.println("��� �⺻ ������ ����մϴ� .");
		if(numOfFriend>0) {
			for(int i=0; i<numOfFriend;i++) {
				friends[i].showBasicInfo();
				System.out.println("-------------------");
			}
		}else {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		System.out.println("-------------------");
	}
}

