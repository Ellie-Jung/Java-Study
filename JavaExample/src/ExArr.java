
public class ExArr {
	public static String[] addAllArray(String[] ar, int addVal){
		for(int i=0; i<ar.length; i++)
			ar[i]+=addVal;
		return ar;
	}
	public static void main(String[] args) {
		String[] arr={"1", "2", "3", "4", "5"};
		String[] ref;
		ref=addAllArray(arr, 7);
		if(arr==ref)
			System.out.println("���� �迭 ����");
		else
			System.out.println("�ٸ� �迭 ����");
		for(int i=0; i<ref.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}

