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
	
	public Memo() {//������
		sc= new Scanner(System.in);
		saveDir = new File("C:\\Users\\xhdnt\\OneDrive\\����\\test\\Memo");
	}

	void viewMemolist() {
		if(!saveDir.exists()) {
			System.out.println("���� ������ �������� �ʾ� ������ �����մϴ�.");
			saveDir.mkdir();
		}else {
			newList = saveDir.listFiles(); //���丮�� ���ϸ��(���丮����)�� File�迭�� ��ȯ�Ѵ�.
			System.out.println("=====�޸𸮽�Ʈ=============");

			if(newList.length>0) {
				int cnt = 0;
				for(File file : newList) {
					
					System.out.println("["+ ++cnt + "]"+ file.getName());
				}
			}
			else {
				System.out.println("���������� ������ �������� �ʽ��ϴ�.");
			}
			System.out.println("==========================");
		}
	}
	
	void writeMemo() {
		
		BufferedWriter out = null;
		
		try {
			System.out.println("�޸��� ������ �ۼ��� �ּ���.");
			String subject = sc.nextLine();
			
			System.out.println();
			
			System.out.println("�޸𳻿��� �Է����ּ���.");
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
			
			System.out.println("�޸� �Է� �Ϸ�.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	void viewMemo() {
		
		viewMemolist();
		System.out.println("������ ��ȣ�� �Է����ּ���.");
		
		int select= Integer.parseInt(sc.nextLine());
		String fileName = newList[select-1].getName();
		
		File viewFile = new File(saveDir,fileName);
		
		BufferedReader in = null;
		String str = null;
		
		System.out.println("----------�����б�-------------");
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
			System.out.println("----------------------�޸���-----------------------");
			System.out.println("[1] �޸� ��Ϻ���  [2] �޸� ���  [3] �޸� ����   [4] ����");
			System.out.println("-------------------------------------------------");
			System.out.println("���Ͻô� �׸��� ������ �ּ���.");

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
				System.out.println("���α׷��� �����մϴ�.");
				return;

			}

		}
		

	}

}
