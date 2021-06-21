package dept;

import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {

		DeptManager manager = new DeptManager(DeptDao.getInstance());
		Scanner sc = new Scanner(System.in);


		//1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			while(true) {

				System.out.println("�μ� ���� ���α׷�");
				System.out.println("--------------------------------------------------");
				System.out.println(" 1. �μ� ����Ʈ ");
				System.out.println(" 2. �μ� ���� �Է� ");
				System.out.println(" 3. �μ� ���� ���� ");
				System.out.println(" 4. �μ� ���� ���� ");
				System.out.println(" 5. ���α׷� ���� ");
				System.out.println("--------------------------------------------------");
				System.out.println("���Ͻô� ����� ��ȣ�� �Է����ּ���.");

				int num = Integer.parseInt(sc.nextLine());

				switch(num) {

				case 1 :
					manager.deptList();
					break;
				case 2 :
					manager.inputData();
					break;
				case 3 :
					manager.editData();
					break;
				case 4 :
					manager.delData();
					break;
				case 5 :
					System.out.println("���α׷��� �����մϴ�.");
					return ;

				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

}
