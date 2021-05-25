
public class ExceptionEx11 {
	public static void main(String[] args) {
		throw new RuntimeException();  //RuntimeException을 고의로 발생시킨다. 
	}
}
class MyException extends Exception{
	private final int ERR_CODE ; //에러코드 값을 저장하기 위한 필드 추가. 생성자를 통해 초기화함
	MyException(String msg,int errCode) {  //생성자
		super(msg);     
		ERR_CODE =errCode;
	}
	MyException(String msg) { //생성자
		this(msg, 100);
	}
	public int getErrCode() { //에러코드를 얻을 수 있는 메서드도 함께 추가
		return ERR_CODE;      //이 메서드는 주로 getMessage()와 함께 사용될것이다.
	}
}