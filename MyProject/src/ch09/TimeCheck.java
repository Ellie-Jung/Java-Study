package ch09;

public class TimeCheck {

	public static void main(String[] args) {
		int sum =0;

		long start = System.currentTimeMillis(); //����ð� 

		for(int i=0; i<=100000000;i++) { //�۾�����
			sum+=i;
		}

		long end = System.currentTimeMillis();//�۾� ���� �ð�
		System.out.println("�۾����۽ð� : "+start);
		System.out.println("�۾�����ð� : "+end);
		System.out.println("�ҿ�ð� : "+(end-start)/1000.0); //���Ƚð��� �и�������. 1000���� ����� ������ ������ ����


	}

}
