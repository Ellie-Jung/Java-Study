package level5;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int arr[] = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}

	
		int max = arr[0];
		int x = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(max<=arr[i]) {
				max=arr[i];
				x=i+1;
			}
		}
		System.out.println(max);
		System.out.println(x);
		
		
	}
}
