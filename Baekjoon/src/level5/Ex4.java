package level5;

import java.util.HashSet;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[10];
		HashSet<Integer> x=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt()%42;
			x.add(arr[i]);
		}
		System.out.println(x.size());
	}
}
