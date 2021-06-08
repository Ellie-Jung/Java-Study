package ch16;
import java.net.*;

public class NetworkEx2 {

	public static void main(String[] args) throws Exception {
		
			//지정된 문자열 정보의 URL 객체를 생성한다.
			URL url = new URL ("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747");
			
			System.out.println("url.getAuthority() : "+url.getAuthority()); //호스트명과 포트를 문자열로 반환 ->news.naver.com
			System.out.println("url.getContent() : "+ url.getContent()); //URL의 Content객체를 반환-> sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@6f27a732
			System.out.println("url.getDefaultPort() : "+ url.getDefaultPort()); //URL의 기본 포트를 반환(http는 80) -> 443
			System.out.println("url.getPort() : " + url.getPort()); //포트번호를 반환한다 -> -1
			System.out.println("url.getFile() : " + url.getFile()); //파일명을 반환한다 -> /main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747
			System.out.println("url.getHost() : " + url.getHost()); //호스트명을 반환한다 ->news.naver.com
			System.out.println("url.getPath() : " + url.getPath()); //경로명을 반환한다.(접근하려는 자원이 저장된 서버상의 위치) -> /main/read.nhn
			System.out.println("url.getProtocol() : "+ url.getProtocol()); //프로토콜을 반환한다 ->  https
			System.out.println("url.getQuery() : "+ url.getQuery()); //쿼리를 반환한다.(URL에서 ?이후부분) -> mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747
			System.out.println("url.getRef() : "+ url.getRef()); //참조(anchor)를 반환한다.(URL에서 #이후부분) -> null;
			System.out.println("url.getUserInfo() : "+ url.getUserInfo()); //사용자 정보를 반환한다. -> null;
			System.out.println("url.toExternalForm() : " + url.toExternalForm()); //URL을 문자열로 변환해서 반환 ->https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747
			System.out.println("url.toURI() : "+ url.toURI()); //URL을 URI로 변환해서 반환 ->https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747
		
	
		

	}

}
