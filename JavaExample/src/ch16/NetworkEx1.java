package ch16;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx1 {

	public static void main(String[] args) {

		InetAddress ip = null;
		InetAddress [] ipArr = null;
		
		try {
			//�����θ�(host)�� ���� IP�ּҸ� ��´�. (ȣ��Ʈ����(�����θ�)���� ������ InetAddress��ü�� ��ȯ)
			ip = InetAddress.getByName ("www.naver.com");  
			
			System.out.println("getHostName () : "+ ip.getHostName()); //ȣ��Ʈ�� �̸��� ��ȯ -> www.naver.com 
			System.out.println("getHostAddress() : "+ ip.getHostAddress()); // ȣ��Ʈ�� IP�ּҹ�ȯ -> 223.130.195.200 (IP�ּҸ� ������ �����ϴ� 10���� ���·� ��ȯ)
			System.out.println("toString() : "+ ip.toString()); //-> www.naver.com/223.130.195.200
			
			byte[] ipAddr = ip.getAddress();  //IP�ּҸ� byte�迭�� ��ȯ�Ѵ�.
			System.out.println("getAddress() : "+ Arrays.toString(ipAddr)); //�迭�� ���ڿ��� ���-> [-33, -126, -61, -56]
			
			String result = "";
			for(int i = 0; i <ipAddr.length ; i++) {
				result += (ipAddr[i] <0 ) ? ipAddr[i]+ 256 : ipAddr[i]; //���� ������ 256�� ���ϱ�
				result += ".";			
			}
		
			System.out.println("getAddress() + 256 : "+result); //223.130.195.200.
			System.out.println();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			//���� ��ǻ�͸� ��Ÿ���� InetAddress ��ü�� ��ȯ
			ip= InetAddress.getLocalHost(); 

			System.out.println("getHostName() : "+ip.getHostName()); //ȣ��Ʈ����-> DESKTOP-GNP4CDC
			System.out.println("getHostAddress() : "+ ip.getHostAddress()); //ȣ��Ʈ IP�ּ�->192.168.174.1
			System.out.println();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			//�����θ�(host)�� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ��� ��ȯ(ȣ��Ʈ�� ��� IP�ּҿ� ���� ������ InetAddress�迭�� ��ȯ)
			//�ϳ��� ������ �̸����� �������� ��ǻ�͸� ����ϴ� ��츦 ��Ÿ���� InetAddress ��ü���� �迭�� ��ȯ
			ipArr = InetAddress.getAllByName("www.naver.com"); 
			
			for(int i = 0; i <ipArr.length ; i++) {
				System.out.println("ipArr["+i+"] : "+ ipArr[i]); //->ipArr[0] : www.naver.com/223.130.195.200  ipArr[1] : www.naver.com/125.209.222.142
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
