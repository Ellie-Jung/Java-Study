package ch4;

public class ArrayQuiz2 {
	public static void addOneDArr(int[] arr, int add){
		for (int i=0; i<arr.length; i++)
			arr[i] +=add;
	}
	public static void addOneDArr(int[][] arr, int add) { 
		for (int i=0; i<arr.length; i++)
		ArrayQuiz2.addOneDArr(arr[i], add);
	}
	public static void main(String[] args) {
		int [][] arr = new int[4][5];
				addOneDArr(arr, 7);
				addOneDArr(arr, 6);

		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}System.out.println();
		}
	}

}
