package level5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num= scanner.nextInt();
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++) {
			arr[i]=scanner.nextInt();
		}

		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[num-1]);
		
	}
}
