
public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2= new Thread(r);
		
		t1.start();
		t2.start();
	}

}
class ThreadEx1_1 extends Thread{  //1. Thread Ŭ������ ����ؼ� �����带 ����
	public void run() { //�����尡 �����ؾ��� �۾��� �ۼ�
		for(int i=0; i<5; i++) {
			System.out.println(getName()); //������ Thread�� getName()�� ȣ��
		}
	}
}
class ThreadEx1_2 implements Runnable{ //2. Runnable �������̽��� �����ؼ� �����带 ����
	public void run() { //�����尡 �����ؾ��� �۾��� �ۼ�
		for(int i =0;i<5;i++) {
			//Thread.currentTread() - ���� �������� Thread�� ��ȯ�Ѵ�.
			System.out.println(Thread.currentThread().getName());
		}
	}
}