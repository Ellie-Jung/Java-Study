package day3;

class  Sungjuk 
{

			String name;
			int kor;
			int eng;
			int math;
			int sum;
			float avg;	
			
			void culcsungjuk()
			{
				sum= kor + eng + math;
				avg= sum/3;
			}
			
			void displaysungjuk()
			{
				System.out.println(name+ "님의 성적입니다.");
				System.out.println("국어:"+kor);
				System.out.println("영어:"+eng);
				System.out.println("수학"+math);
				System.out.println("총점"+sum);
				System.out.println("평균"+avg);
			}
			
}







public class Ex2s_Addclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sungjuk a = new Sungjuk();
		a.name="홍길동";
		a.kor= 90;
		a.eng = 89;
		a.math=76;
		a.culcsungjuk();
		a.displaysungjuk();
		
//		Sungjuk a1= new Sungjuk("강호동",90,89,76);
//		a1.culcsungjuk();
//		a1.displaysungjuk();
			
		
		
	}

}
