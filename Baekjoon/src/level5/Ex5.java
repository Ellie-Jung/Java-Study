package level5;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		float arr[] = new float[count];
		float max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
			if(max<=arr[i]) {
				max=arr[i];
			}
			
		}
		float sum =0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]/max*100;
			sum+=arr[i];
		}
		System.out.println(sum/count);
		
	}
}
