import java.io.Serializable;

public class ChainedException {

	public static void main(String[] args) {


	}

}

class Throwable implements Serializable{
	private Throwable cause =this;   //��ü �ڽ��� ���ο��ܷ� ���
	public synchronized Throwable initCase(Throwable cause) {
		this.cause= cause;   //cause�� ���ο��ܷ� ���
		return this;
	}
}