package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bReader= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter =new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int t = Integer.parseInt(bReader.readLine());
		
		for(int i=0; i<t;i ++) {
			
			String inputString=bReader.readLine();
			String [] tmp= inputString.split(" ");
			int a= Integer.parseInt(tmp[0]); 
			int b= Integer.parseInt(tmp[1]); 
			bWriter.write(a+b+"\n");
		}
				
		bWriter.flush();
		bWriter.close();
	}
	
}
