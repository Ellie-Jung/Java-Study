package ch16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx4 {

	public static void main(String[] args) {
		
		URL url = null;
		BufferedReader input = null;
		String address = "https://terms.naver.com/entry.naver?docId=5550508&cid=51004&categoryId=51004";
		String line = "";
		
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream())); //읽어올 데이터가 문자데이터. 

//			InputStream in = url.openStream(); //openStream()호출해서 URL의 InputStream을 얻은 이후로는 파일로부터 데이터를 읽는 것과 다르지않다.
			//위의 한줄은 밑의 두줄과 같다.
			//URLConnection conn= url.openConnection();//openStream()은 openConnection()을 호출해서 URLConnection을 얻은 다음 여기에 다시 getInputStream()을 호출한 것과 같다.(URL에 연결해서 InputStream얻어옴)
			//InputStream in = con.getInputStream();
			
			
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
