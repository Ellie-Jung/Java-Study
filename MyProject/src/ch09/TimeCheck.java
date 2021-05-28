package ch09;

public class TimeCheck {

	public static void main(String[] args) {
		int sum =0;

		long start = System.currentTimeMillis(); //현재시간 

		for(int i=0; i<=100000000;i++) { //작업수행
			sum+=i;
		}

		long end = System.currentTimeMillis();//작업 끝난 시간
		System.out.println("작업시작시간 : "+start);
		System.out.println("작업종료시간 : "+end);
		System.out.println("소요시간 : "+(end-start)/1000.0); //계산된시간은 밀리세컨드. 1000으로 나누어서 세컨드 단위로 변경


	}

}
