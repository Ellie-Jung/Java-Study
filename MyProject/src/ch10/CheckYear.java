package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckYear {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("�¾ �⵵�� �Է��� �ּ���");
		
		try {
			int year = sc.nextInt();
			if(year<1900|| year>2021) {
				throw new BadInputException("�⵵�� �߸��Է��ϼ̽��ϴ�.");
				
			}
			
		}catch (InputMismatchException  e) {
			
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		
		
		}catch (BadInputException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
