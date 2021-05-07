package day3;

public class Ex4s_MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor1= 100;
		int kor2=  96;
		int kor3=  80;
		
		int sum = kor1 + kor2 + kor3;
		
		System.out.println("합계는 :"+sum);
		
		///////배열로 써보자
		
		int kor[]= new int[]{100,96,80};
		//int kor[]= {100,96,80};
		//int kor[] = new int[3];
		
		sum = 0;
		for (int i=0;i<3;i++)
		{
			sum = sum + kor[i];
			System.out.println("중간합계는 :" + sum);
		}
		
		System.out.println("최종합계는 ?"+sum );
		
		
	}

}
