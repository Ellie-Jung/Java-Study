package ch4;

public class ForeachEx {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		int[] score = {100,88,100,100,90};
		
//		for(int i =0; i<score.length;i++) {
//			sum += score[i];
//		}
//		System.out.println("총점 : "+sum);
//		System.out.println("평균 : "+average);
//	
		//위에거를 for each문으로 바꾸기
		for( int e : score) {
			sum +=e;
		}
		average = sum/(float)score.length;
		System.out.println(sum);
		System.out.println(average);
		
	}
	

}
