
public class ExceptionEx11 {
	public static void main(String[] args) {
		throw new RuntimeException();  //RuntimeException�� ���Ƿ� �߻���Ų��. 
	}
}
class MyException extends Exception{
	private final int ERR_CODE ; //�����ڵ� ���� �����ϱ� ���� �ʵ� �߰�. �����ڸ� ���� �ʱ�ȭ��
	MyException(String msg,int errCode) {  //������
		super(msg);     
		ERR_CODE =errCode;
	}
	MyException(String msg) { //������
		this(msg, 100);
	}
	public int getErrCode() { //�����ڵ带 ���� �� �ִ� �޼��嵵 �Բ� �߰�
		return ERR_CODE;      //�� �޼���� �ַ� getMessage()�� �Բ� ���ɰ��̴�.
	}
}