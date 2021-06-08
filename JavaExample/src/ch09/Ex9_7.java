package ch09;

public class Ex9_7 {

	static boolean contains (String src, String target) {
//		int index =0;
//		for(int i=0; i<src.length();i++) {
//			if(src.indexOf(target,index)==-1) {
//				return false;
//			}
//		}
//		return true;
		
		return src.indexOf(target)!=-1;
	}
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));

	}

}
