package ch10;

import java.util.Scanner;

public class CheckID {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է����ּ��� (���� �Ǵ� ���ڸ� ���)");
		String id = sc.nextLine();
		id = id.trim();

		try {
			if(!(id.length()==0)){
				char chk = 0;
				for(int i =0; i<id.length(); i++) {
					chk = id.toLowerCase().charAt(i);
				}
				if(!(chk>='a'&&chk<='z'  || chk>='A'&&chk<='Z'|| chk>='0' && chk<='9')){
					throw new BadInputException("���̵�� ���ڳ� ������ �����մϴ�.");
				}else {
					System.out.println("���̵�� "+ id+"�Դϴ�.");
				}
			}else 
				System.out.println("��ĭ�� �Է��ϼ̽��ϴ�.");
			
		} catch (BadInputException e) {
			System.out.println(e.getMessage());
		}

	}

}
