package ch16;
import java.net.*;

public class NetworkEx2 {

	public static void main(String[] args) throws Exception {
		
			//������ ���ڿ� ������ URL ��ü�� �����Ѵ�.
			URL url = new URL ("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747");
			
			System.out.println("url.getAuthority() : "+url.getAuthority()); //ȣ��Ʈ��� ��Ʈ�� ���ڿ��� ��ȯ ->news.naver.com
			System.out.println("url.getContent() : "+ url.getContent()); //URL�� Content��ü�� ��ȯ-> sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@6f27a732
			System.out.println("url.getDefaultPort() : "+ url.getDefaultPort()); //URL�� �⺻ ��Ʈ�� ��ȯ(http�� 80) -> 443
			System.out.println("url.getPort() : " + url.getPort()); //��Ʈ��ȣ�� ��ȯ�Ѵ� -> -1
			System.out.println("url.getFile() : " + url.getFile()); //���ϸ��� ��ȯ�Ѵ� -> /main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747
			System.out.println("url.getHost() : " + url.getHost()); //ȣ��Ʈ���� ��ȯ�Ѵ� ->news.naver.com
			System.out.println("url.getPath() : " + url.getPath()); //��θ��� ��ȯ�Ѵ�.(�����Ϸ��� �ڿ��� ����� �������� ��ġ) -> /main/read.nhn
			System.out.println("url.getProtocol() : "+ url.getProtocol()); //���������� ��ȯ�Ѵ� ->  https
			System.out.println("url.getQuery() : "+ url.getQuery()); //������ ��ȯ�Ѵ�.(URL���� ?���ĺκ�) -> mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747
			System.out.println("url.getRef() : "+ url.getRef()); //����(anchor)�� ��ȯ�Ѵ�.(URL���� #���ĺκ�) -> null;
			System.out.println("url.getUserInfo() : "+ url.getUserInfo()); //����� ������ ��ȯ�Ѵ�. -> null;
			System.out.println("url.toExternalForm() : " + url.toExternalForm()); //URL�� ���ڿ��� ��ȯ�ؼ� ��ȯ ->https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747
			System.out.println("url.toURI() : "+ url.toURI()); //URL�� URI�� ��ȯ�ؼ� ��ȯ ->https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=103&oid=215&aid=0000962747
		
	
		

	}

}
