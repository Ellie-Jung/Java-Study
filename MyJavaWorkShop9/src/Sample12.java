
public class Sample12 {

	public static void main(String[] args) {
		try {
		throw new ArithmeticException(); //���ܸ� �߻���Ŵ
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}

	}

}
