package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckYear {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요");
		
		try {
			int year = sc.nextInt();
			if(year<1900|| year>2021) {
				throw new BadInputException("년도를 잘못입력하셨습니다.");
				
			}
			
		}catch (InputMismatchException  e) {
			
			System.out.println("잘못입력하셨습니다.");
		
		
		}catch (BadInputException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
