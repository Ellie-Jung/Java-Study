package level7;

import java.util.Random;

public class Ex8 {
	public static void main(String[] args) {
		
		int[]x= {8,3,1,5};
		
		bubbleSort(4,x);
		
		for(int i=0; i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
	static void bubbleSort(int n, int []arr) {
		   for(int i = 0; i < n; i++)
		      for(int j = i + 1; j < n; j++)
		         if(arr[i] > arr[j])
		         {
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		         }
		}
	
}


