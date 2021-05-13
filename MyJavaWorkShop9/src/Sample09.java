
public class Sample09 {

	public static void main(String[] args) {
		try{
			int a =1/0;
		}catch(OutOfMemoryError ex) {
			System.out.println("OutOfMemoryError 오류 발생함");
		}catch(ArithmeticException ex) {
			String name = ex.getMessage();
			System.out.println(name);
			System.out.println("ArithmeticException오류 발생");
		}catch(Exception ex) {
			System.out.println("Exception오류 발생");
		}
		System.out.println("종료합니다.");
	}

}
