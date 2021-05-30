package ch6;

public class Ex6_20 {
	static int[] shuffle(int []arr) { //주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게한다
		if(arr==null || arr.length==0)
			return arr;
		for(int i=0;i<arr.length;i++) {
			int n = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i]= arr[n];
			arr[n]=tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
