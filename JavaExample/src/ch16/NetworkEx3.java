package ch16;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {

	public static void main(String[] args) {
		URL url = null;
		String address = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=056&aid=0011057945";

		try {
			url = new URL (address);
			//URLConnection�ν��Ͻ��� URL�ν��Ͻ��� openConnection()�޼ҵ带 �̿��ؼ� ���� �� ����.   
			URLConnection conn = url.openConnection(); //URL�� ����� URLConnection�� ��´�.
			
			System.out.println("conn.toString() : "+conn); //->sun.net.www.protocol.https.DelegateHttpsURLConnection:https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=056&aid=0011057945
			System.out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction());//UserInteraction�� ��뿩�θ� ��ȯ ->false
			System.out.println("getConncetTimeout() : "+ conn.getConnectTimeout());//��������ð��� õ���� ���ʷ� ��ȯ ->0
			System.out.println("getContent() : "+ conn.getContent());//content��ü ��ȯ ->sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@6f27a732
			System.out.println("getContentEncoding() : "+conn.getContentEncoding()); //content�� ���ڵ��� ��ȯ�Ѵ�. ->null
			System.out.println("getContentLength() : "+ conn.getContentLength());//content�� ũ�⸦ ��ȯ�Ѵ� ->-1
			System.out.println("getContentType() : "+conn.getContentType());//content�� type�� ��ȯ ->text/html;charset=EUC-KR
			System.out.println("getDate() : "+ conn.getDate());//�����(header) date�ʵ��� �� ��ȯ ->1622902284000
			System.out.println("getDefaultAllUserInterction() : "+ conn.getDefaultAllowUserInteraction());//defaultAllowUserInteraction�� ���� ��ȯ ->false
			System.out.println("getDefaultUseCaches() : "+ conn.getDefaultUseCaches());//useCache�� ������ ���� ��´�. ->true
			System.out.println("getDoInput() : "+ conn.getDoInput());//doInput�ʵ尪�� ��´� ->  true
			System.out.println("getDoOutput() : "+ conn.getDoOutput()); //doOutput�ʵ尪�� ��´�. -> false
			System.out.println("getExpiration() : "+conn.getExpiration()); //�ڿ�(URL)�� �������ڸ� ��´�. (õ���� ���ʴ���) ->0
			System.out.println("getHeaderFields() : "+conn.getHeaderFields());//����� ��� ���� ����� Map�� ��ȯ ->  {date=[Sat, 05 Jun 2021 14:11:24 GMT], null=[HTTP/1.1 200 200], server=[nfront], set-cookie=[JSESSIONID=973D0FE2B449B6FC1093F4040727CCBC; Path=/main; HttpOnly], expires=[Thu, 01 Jan 1970 00:00:00 GMT], transfer-encoding=[chunked], vary=[Accept-Encoding], referrer-policy=[unsafe-url], content-type=[text/html;charset=EUC-KR], cache-control=[no-cache], content-language=[ko-KR]}
			System.out.println("getIfModifiedSince() : "+conn.getIfModifiedSince());//ifModifiedSince(���濩��)�ʵ��� ���� ��ȯ�Ѵ�. ->0
			System.out.println("getLastModified() : "+conn.getLastModified()); //LastModified(����������) �ʵ��� ���� ��ȯ�Ѵ�.->0
			System.out.println("getReadTimeout() : "+ conn.getReadTimeout()); //�б����ѽð��� ���� ��ȯ�Ѵ�.(õ���� ����)->0
			System.out.println("getURL() : "+conn.getURL()); //URLConnetion�� URL�� ��ȯ�Ѵ�. -> https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=056&aid=0011057945
			System.out.println("getUseCaches() : "+conn.getUseCaches()); //ĳ���� ��뿩�θ� ��ȯ�Ѵ� ->true
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
