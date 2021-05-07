package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Ex5s_fileIO {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	
		File myfile= new File("c:\\temp\\number.txt");
		Scanner sc = new Scanner(myfile);
		
		int num ;
		while(sc.hasNextInt()==true)
		{
			num=sc.nextInt();
			System.out.println("결과="+num*1000);
		
		}
			
		System.out.println("바이바이")	;
			
	}

}
