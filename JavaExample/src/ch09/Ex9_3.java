package ch09;

public class Ex9_3 {

	public static void main(String[] args) {

		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int pos = fullPath.lastIndexOf("\\");
		
		if(pos !=0) {
			path = fullPath.substring(0,pos);
			fileName = fullPath.substring(pos+1); //지정된 위치부터 끝까지 잘라낸다.
		}
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
		
	}

}
