package ch4;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] number = new int[10];
		for(int i =0; i<number.length;i++) {
			number[i]=i;
			System.out.print(number[i]);
		}
		System.out.println();
		for(int i =0; i<100;i++) {
			int n =(int)(Math.random()*10); //0~9�� �� ���� ���Ƿ� ��´�.
			int tmp = number[0];			//number[0]�� number[n]�� ���� ���� �ٲ۴�.
			number[0] = number[n];
			number[n] = tmp;
			
		}	
		for(int i =0; i<number.length;i++) {
			System.out.print(number[i]);
		}
	}

}
