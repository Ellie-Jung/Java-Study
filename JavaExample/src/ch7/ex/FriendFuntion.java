package ch7.ex;

import java.util.Scanner;

public class FriendFuntion {

	Friend [] friends;
	int numOfFriend;

	FriendFuntion(int num) { //메인에서 호출해서 이 인스턴스에 정보를 저장한다. 
		friends= new Friend[num];
		numOfFriend = 0;
	}

	//데이터의 입력처리
	//사용자로부터 친구의 정보를 입력 받아서 -> 인스턴스를 생성 -> 배열에 저장
	void add(int choice) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 >>");
		String name = sc.nextLine();
		System.out.print("번호를 입력하세요 >>");
		String phonNum = sc.nextLine();
		System.out.print("주소를 입력하세요 >>");
		String address = sc.nextLine();

		if (choice ==1) {
			System.out.print("직업을 입력하세요 >>");
			String job = sc.nextLine();
//			friends [numOfFriend++]=new HighFriend(name, phonNum, address, job);
			addFriendInfo(new HighFriend(name, phonNum, address, job));

		}else {
			System.out.print("전공을 입력하세요 >>");
			String major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phonNum, address, major));
		}
	}

	//Friend 클래스를 상속하는 타입의 인스턴스를 받아 배열에 저장
	public void addFriendInfo(Friend f) {
		friends [numOfFriend++] = f; //배열에 요소 추가
		System.out.println("정보가 저장되었습니다.");
	}

	void showAllData() {
		System.out.println("====================");
		System.out.println("모든 정보를 출력합니다 .");
		if(numOfFriend>0) {
			for(int i=0; i<numOfFriend;i++) {
				friends[i].showData();
				System.out.println("-------------------");
			}
		}else {
			System.out.println("입력된 정보가 없습니다.");
		}
		System.out.println("-------------------");
	}
	void showBasicData() {
		System.out.println("====================");
		System.out.println("모든 기본 정보를 출력합니다 .");
		if(numOfFriend>0) {
			for(int i=0; i<numOfFriend;i++) {
				friends[i].showBasicInfo();
				System.out.println("-------------------");
			}
		}else {
			System.out.println("입력된 정보가 없습니다.");
		}
		System.out.println("-------------------");
	}
}

