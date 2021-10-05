package level2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String x= scanner.nextLine();
		
		String[] y=x.split(" ");
		
		
		if(Integer.parseInt(y[1])>=45) {
			System.out.println(y[0]+" "+(Integer.parseInt(y[1])-45));
		}else {
			if((Integer.parseInt(y[0])==0)){
				System.out.println(23+" "+(Integer.parseInt(y[1])+15));
			}else {
				
				System.out.println((Integer.parseInt(y[0])-1)+" "+(Integer.parseInt(y[1])+15));
			}
		}
	}

}
