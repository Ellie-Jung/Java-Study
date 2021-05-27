package ch4;
import java.util.Scanner;
public class ArrayMaxMin {
	public static int miniValue(int[] arr) {
		int min =arr[0];
		for(int i =0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int maxValue(int[] arr) {
		int max =arr[0];
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];//사용자에게 받을 숫자 배열
		for(int i=0;i<arr.length;i++) {
			System.out.println("숫자를 입력하세요.");
			arr[i]= sc.nextInt();
		}
		System.out.println("입력하신 숫자중에 최대값 : "+ ArrayMaxMin.maxValue(arr));
		System.out.println("입력하신 숫자중에 최소값 : "+ArrayMaxMin.miniValue(arr));
		
	}
}