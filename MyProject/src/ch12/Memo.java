package ch12;

import java.io.File;
import java.util.Scanner;

public class Memo {
	
	Scanner sc;
	File saveDir;
	File[] newList;
	
	public Memo() {//������
		sc= new Scanner(System.in);
		saveDir = new File("C:\\Users\\xhdnt\\OneDrive\\����\\test");
	}

	void viewMemolist() {
		if(!saveDir.exists()) {
			System.out.println("���� ������ �������� �ʾ� ������ �����մϴ�.");
			saveDir.mkdir();
		}else {
			newList = saveDir.listFiles(); //���丮�� ���ϸ��(���丮����)�� File�迭�� ��ȯ�Ѵ�.
			
			System.out.println("=====�޸𸮽�Ʈ=====");
			if(newList.length>0) {
				for(File file : newList) {
					
				}
			}
		}
	}
	
	void writeMemo() {
		System.out.println("�޸��� ������ �ۼ��� �ּ���.");
		String head = sc.nextLine();
		
	}
	
	void viewMemo() {}

	public static void main(String[] args) {

		File file = new File("C:\\Users\\xhdnt\\OneDrive\\����\\test\\Mymemo");//���丮 ��ġ����
		file.mkdir();// ���丮 ����
		System.out.println(file.exists());


		System.out.println("----------------------�޸���-----------------------");
		System.out.println("[1] �޸� ��Ϻ���  [2] �޸� ���  [3] �޸� ����   [4] ����");
		System.out.println("-------------------------------------------------");
		System.out.println("���Ͻô� �׸��� ������ �ּ���.");

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
