package ch08;
class UnsupportedFunctionException extends RuntimeException{

	final private int ERR_CODE;
	
	
	UnsupportedFunctionException(String message, int ERR_CODE) {
		super(message);
		this.ERR_CODE = ERR_CODE;
	}
	UnsupportedFunctionException(String message) {
		this(message , 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	@Override
	public String getMessage() {
		return "["+getErrorCode()+"]"+super.getMessage();
	}
	
	
}

public class Ex8_9 {
	
public static void main(String[] args) {
	throw new UnsupportedFunctionException ("지원하지 않는 기능입니다. ",100);
}
}
