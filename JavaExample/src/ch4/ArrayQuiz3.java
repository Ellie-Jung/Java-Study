package ch4;
public class ArrayQuiz3 {
	static void change(int[][] arr) {
		int[] tmp = arr[arr.length-1];
		for(int i=0 ; i<arr.length-1;i++) {
			tmp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1]=tmp;
		}
	}
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6,4},
				{7,8,9},
				{2,3,4},
				{5,2,3}
		};
		change(arr);
		for(int[] tmp : arr ) {
			for(int e : tmp) {
				System.out.print(e+"");
			}System.out.println();
		}
	}
}
