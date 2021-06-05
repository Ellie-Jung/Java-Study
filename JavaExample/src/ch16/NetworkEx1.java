package ch16;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx1 {

	public static void main(String[] args) {

		InetAddress ip = null;
		InetAddress [] ipArr = null;
		
		try {
			//도메인명(host)을 통해 IP주소를 얻는다. (호스트네임(도메인명)으로 지정된 InetAddress객체를 반환)
			ip = InetAddress.getByName ("www.naver.com");  
			
			System.out.println("getHostName () : "+ ip.getHostName()); //호스트의 이름을 반환 -> www.naver.com 
			System.out.println("getHostAddress() : "+ ip.getHostAddress()); // 호스트의 IP주소반환 -> 223.130.195.200 (IP주소를 점으로 구분하는 10진수 형태로 반환)
			System.out.println("toString() : "+ ip.toString()); //-> www.naver.com/223.130.195.200
			
			byte[] ipAddr = ip.getAddress();  //IP주소를 byte배열로 반환한다.
			System.out.println("getAddress() : "+ Arrays.toString(ipAddr)); //배열을 문자열로 출력-> [-33, -126, -61, -56]
			
			String result = "";
			for(int i = 0; i <ipAddr.length ; i++) {
				result += (ipAddr[i] <0 ) ? ipAddr[i]+ 256 : ipAddr[i]; //위의 값에서 256씩 더하기
				result += ".";			
			}
		
			System.out.println("getAddress() + 256 : "+result); //223.130.195.200.
			System.out.println();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			//현재 컴퓨터를 나타내는 InetAddress 객체를 반환
			ip= InetAddress.getLocalHost(); 

			System.out.println("getHostName() : "+ip.getHostName()); //호스트네임-> DESKTOP-GNP4CDC
			System.out.println("getHostAddress() : "+ ip.getHostAddress()); //호스트 IP주소->192.168.174.1
			System.out.println();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			//도메인명(host)에 지정된 모든 호스트의 IP주소를 배열에 담아 반환(호스트의 모든 IP주소에 대한 정보를 InetAddress배열로 반환)
			//하나의 도메인 이름으로 여러대의 컴퓨터를 사용하는 경우를 나타내는 InetAddress 객체들의 배열을 반환
			ipArr = InetAddress.getAllByName("www.naver.com"); 
			
			for(int i = 0; i <ipArr.length ; i++) {
				System.out.println("ipArr["+i+"] : "+ ipArr[i]); //->ipArr[0] : www.naver.com/223.130.195.200  ipArr[1] : www.naver.com/125.209.222.142
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
