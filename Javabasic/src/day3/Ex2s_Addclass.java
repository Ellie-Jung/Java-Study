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
				System.out.println(name+ "���� �����Դϴ�.");
				System.out.println("����:"+kor);
				System.out.println("����:"+eng);
				System.out.println("����"+math);
				System.out.println("����"+sum);
				System.out.println("���"+avg);
			}
			
}







public class Ex2s_Addclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sungjuk a = new Sungjuk();
		a.name="ȫ�浿";
		a.kor= 90;
		a.eng = 89;
		a.math=76;
		a.culcsungjuk();
		a.displaysungjuk();
		
//		Sungjuk a1= new Sungjuk("��ȣ��",90,89,76);
//		a1.culcsungjuk();
//		a1.displaysungjuk();
			
		
		
	}

}
