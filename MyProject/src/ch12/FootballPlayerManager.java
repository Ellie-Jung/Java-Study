package ch12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballPlayerManager {
	List<FootballPlayer> players;
	File file;
	Scanner scanner;

	public FootballPlayerManager() {
		scanner = new Scanner(System.in);
		
		file = new File("palyer.ser");
		if(file.exists()) {
			loadFile();
		}else {
			players = new ArrayList<FootballPlayer>();
		}
	}
	
	public void displayPlayer() {
		
		if(players.isEmpty()) {
			System.out.println("����� ���� �����Ͱ� �����ϴ�.");
		}else {
			for(FootballPlayer footballPlayer : players) {
				System.out.println(footballPlayer);
			}
		}
	}
	
	public void addPlayer() {
		System.out.println("�̸��� �Է����ּ���.");
		String name = scanner.nextLine();
		System.out.println("���ȣ�� �Է����ּ���. ");
		String number = scanner.nextLine();
		System.out.println("�� �̸��� �Է����ּ���.");
		String team = scanner.nextLine();
		System.out.println("���̸� �Է����ּ���");
		String age = scanner.nextLine();
		
		players.add(new FootballPlayer(name, Integer.parseInt(number), team, Integer.parseInt(age)));
	}
	
	public void saveFile() {
		ObjectOutputStream outputStream = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			outputStream= new ObjectOutputStream(fos);
			outputStream.writeObject(players);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void loadFile() {
		
		if(file.exists()) {
			ObjectInputStream inputStream = null;
			FileInputStream fis;
			
			try {
				System.out.println("���Ϸκ��� �����͸� �о�ɴϴ�.");
				
				fis = new FileInputStream(file);
				inputStream = new ObjectInputStream(fis);
				players = (List<FootballPlayer>)inputStream.readObject();
				
				displayPlayer();
						
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void main(String[] args) {

		FootballPlayerManager manager = new FootballPlayerManager();
		
		while(true) {
			System.out.println("Java Memo ---------------------");
			System.out.println("[1] ���� ����Ʈ ����  [2] �������  [3] �������� [4] ����");
			System.out.println("=====================================");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			
			int select = Integer.parseInt(manager.scanner.nextLine());
			
			switch (select) {
			case 1:
				manager.displayPlayer();
				break;
			case 2 :
				manager.addPlayer();
				break;
			case 3:
				manager.saveFile();
				break;
			case 4 : 
				System.out.println("���α׷��� �����մϴ�.");
				return;
			
			}
			
			
		}
		
	}

}
