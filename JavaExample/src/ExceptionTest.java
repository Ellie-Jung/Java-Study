
public class ExceptionTest {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻� ������");
			throw e;
			// ���� ������ ���ٷ� throw new Exception("���Ƿ� �߻� ������"); 
		}catch(Exception e){
			System.out.println("�����޼���: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���");
	}
}
