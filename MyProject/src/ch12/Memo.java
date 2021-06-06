package ch12;

import java.io.File;
import java.util.Scanner;

public class Memo {
	
	Scanner sc;
	File saveDir;
	File[] newList;
	
	public Memo() {//생성자
		sc= new Scanner(System.in);
		saveDir = new File("C:\\Users\\xhdnt\\OneDrive\\문서\\test");
	}

	void viewMemolist() {
		if(!saveDir.exists()) {
			System.out.println("저장 폴더가 존재하지 않아 폴더를 생성합니다.");
			saveDir.mkdir();
		}else {
			newList = saveDir.listFiles(); //디렉토리의 파일목록(디렉토리포함)을 File배열로 반환한다.
			
			System.out.println("=====메모리스트=====");
			if(newList.length>0) {
				for(File file : newList) {
					
				}
			}
		}
	}
	
	void writeMemo() {
		System.out.println("메모의 제목을 작성해 주세요.");
		String head = sc.nextLine();
		
	}
	
	void viewMemo() {}

	public static void main(String[] args) {

		File file = new File("C:\\Users\\xhdnt\\OneDrive\\문서\\test\\Mymemo");//디렉토리 위치정보
		file.mkdir();// 디렉토리 생성
		System.out.println(file.exists());


		System.out.println("----------------------메모장-----------------------");
		System.out.println("[1] 메모 목록보기  [2] 메모 등록  [3] 메모 보기   [4] 종료");
		System.out.println("-------------------------------------------------");
		System.out.println("원하시는 항목을 선택해 주세요.");

		int select = sc.nextInt();

		switch (select) {

		case 1:

			break;
		case 2:

			break;
		case 3 :

			break;
		case 4 :
			break;

		default:
			break;
		}


	}

}
