import java.io.Serializable;

public class ChainedException {

	public static void main(String[] args) {


	}

}

class Throwable implements Serializable{
	private Throwable cause =this;   //객체 자신을 원인예외로 등록
	public synchronized Throwable initCase(Throwable cause) {
		this.cause= cause;   //cause를 원인예외로 등록
		return this;
	}
}