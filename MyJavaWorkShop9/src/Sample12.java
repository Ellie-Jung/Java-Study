
public class Sample12 {

	public static void main(String[] args) {
		try {
		throw new ArithmeticException(); //예외를 발생시킴
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}

	}

}
