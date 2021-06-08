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
			//URLConnection인스턴스는 URL인스턴스의 openConnection()메소드를 이용해서 얻을 수 있음.   
			URLConnection conn = url.openConnection(); //URL과 연결된 URLConnection을 얻는다.
			
			System.out.println("conn.toString() : "+conn); //->sun.net.www.protocol.https.DelegateHttpsURLConnection:https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=056&aid=0011057945
			System.out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction());//UserInteraction의 허용여부를 반환 ->false
			System.out.println("getConncetTimeout() : "+ conn.getConnectTimeout());//연결종료시간을 천분의 일초로 반환 ->0
			System.out.println("getContent() : "+ conn.getContent());//content객체 반환 ->sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@6f27a732
			System.out.println("getContentEncoding() : "+conn.getContentEncoding()); //content의 인코딩을 반환한다. ->null
			System.out.println("getContentLength() : "+ conn.getContentLength());//content의 크기를 반환한다 ->-1
			System.out.println("getContentType() : "+conn.getContentType());//content의 type을 반환 ->text/html;charset=EUC-KR
			System.out.println("getDate() : "+ conn.getDate());//헤더의(header) date필드의 값 반환 ->1622902284000
			System.out.println("getDefaultAllUserInterction() : "+ conn.getDefaultAllowUserInteraction());//defaultAllowUserInteraction의 값을 반환 ->false
			System.out.println("getDefaultUseCaches() : "+ conn.getDefaultUseCaches());//useCache의 디폴드 값을 얻는다. ->true
			System.out.println("getDoInput() : "+ conn.getDoInput());//doInput필드값을 얻는다 ->  true
			System.out.println("getDoOutput() : "+ conn.getDoOutput()); //doOutput필드값을 얻는다. -> false
			System.out.println("getExpiration() : "+conn.getExpiration()); //자원(URL)의 만료일자를 얻는다. (천분의 일초단위) ->0
			System.out.println("getHeaderFields() : "+conn.getHeaderFields());//헤더의 모든 값이 저장된 Map을 반환 ->  {date=[Sat, 05 Jun 2021 14:11:24 GMT], null=[HTTP/1.1 200 200], server=[nfront], set-cookie=[JSESSIONID=973D0FE2B449B6FC1093F4040727CCBC; Path=/main; HttpOnly], expires=[Thu, 01 Jan 1970 00:00:00 GMT], transfer-encoding=[chunked], vary=[Accept-Encoding], referrer-policy=[unsafe-url], content-type=[text/html;charset=EUC-KR], cache-control=[no-cache], content-language=[ko-KR]}
			System.out.println("getIfModifiedSince() : "+conn.getIfModifiedSince());//ifModifiedSince(변경여부)필드의 값을 반환한다. ->0
			System.out.println("getLastModified() : "+conn.getLastModified()); //LastModified(최종변경일) 필드의 값을 반환한다.->0
			System.out.println("getReadTimeout() : "+ conn.getReadTimeout()); //읽기제한시간의 값을 반환한다.(천분의 일초)->0
			System.out.println("getURL() : "+conn.getURL()); //URLConnetion의 URL을 반환한다. -> https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=056&aid=0011057945
			System.out.println("getUseCaches() : "+conn.getUseCaches()); //캐쉬의 사용여부를 반환한다 ->true
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
