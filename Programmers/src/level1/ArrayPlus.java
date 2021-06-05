package level1;

public class ArrayPlus {
	public int[][] solution (int[][] arr1, int[][]arr2){
		int[][] answer =new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				answer[i][j]=arr1[i][j]+arr2[i][j];
			}
		} 
	
		for(int[] tmp :answer) {
			for(int e :tmp )
			System.out.print(e);
			System.out.println();
		}System.out.println();

		
		return answer;
	}
	public static void main(String[] args) {

		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{5}};
		
		ArrayPlus e = new ArrayPlus();
		e.solution(arr1, arr2);
		
	
	}

}


