package ch12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Memo {
	
	Scanner sc;
	File saveDir;
	File[] newList;
	
	public Memo() {//생성자
		sc= new Scanner(System.in);
		saveDir = new File("C:\\Users\\xhdnt\\OneDrive\\문서\\test\\Memo");
	}

	void viewMemolist() {
		if(!saveDir.exists()) {
			System.out.println("저장 폴더가 존재하지 않아 폴더를 생성합니다.");
			saveDir.mkdir();
		}else {
			newList = saveDir.listFiles(); //디렉토리의 파일목록(디렉토리포함)을 File배열로 반환한다.
			System.out.println("=====메모리스트=============");

			if(newList.length>0) {
				int cnt = 0;
				for(File file : newList) {
					
					System.out.println("["+ ++cnt + "]"+ file.getName());
				}
			}
			else {
				System.out.println("저장폴더에 파일이 존재하지 않습니다.");
			}
			System.out.println("==========================");
		}
	}
	
	void writeMemo() {
		
		BufferedWriter out = null;
		
		try {
			System.out.println("메모의 제목을 작성해 주세요.");
			String subject = sc.nextLine();
			
			System.out.println();
			
			System.out.println("메모내용을 입력해주세요.");
			String memo = sc.nextLine();
			
			Date now = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd-hh-mm-dd");
			
			String writeDate = format.format(now);
			System.out.println(writeDate);
			
			String newFileName = writeDate + "_" + subject;
			out = new BufferedWriter(new FileWriter(new File(saveDir, newFileName+".txt")));
			
			System.out.println(subject);
			System.out.println(memo);
			out.write(subject);
			out.newLine();
			out.newLine();
			out.write(writeDate);
			out.newLine();
			out.newLine();
			out.write(memo);
			out.close();
			
			System.out.println("메모 입력 완료.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	void viewMemo() {
		
		viewMemolist();
		System.out.println("파일의 번호를 입력해주세요.");
		
		int select= Integer.parseInt(sc.nextLine());
		String fileName = newList[select-1].getName();
		
		File viewFile = new File(saveDir,fileName);
		
		BufferedReader in = null;
		String str = null;
		
		System.out.println("----------파일읽기-------------");
		try {
			
			in = new BufferedReader(new FileReader(viewFile));
			while(true) {
				str = in.readLine();
				if(str ==null) {
					break;
				}
				System.out.println(str);
			}
			System.out.println("---------------------------------");
			in.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		Memo memoNote = new Memo();

		while(true) {
			System.out.println("----------------------메모장-----------------------");
			System.out.println("[1] 메모 목록보기  [2] 메모 등록  [3] 메모 보기   [4] 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("원하시는 항목을 선택해 주세요.");

			int select = Integer.parseInt(memoNote.sc.nextLine());

			switch (select) {

			case 1:
				memoNote.viewMemolist();
				break;
			case 2:
				memoNote.writeMemo();
				break;
			case 3 :
				memoNote.viewMemo();
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				return;

			}

		}
		

	}

}
