package ch09;

public class Ex9_6 {
	public static String fillZero(String src, int length) { //주어진 문자열(숫자)로 주어진 길이의 문자열로 만들고, 왼쪽 빈 공간은 '0'으로 채운다.
		//만일 주어진 문자열이 null이거나 문자열의 길이가 length의 값과 같으면 그대로 반환한다.// 만일 주어진 length의 값이 0보다 같거나 작은값이면 빈문자열 반환
		
		if(src==null || src.length()==length) {
			return src;
		}else if(length<=0) {
			return "";
		}else if(src.length()>length) {
			return src.substring(0,length); //0부터length까지 
		}
			
			char[] ch= new char[length];
			for(int i=0; i<ch.length;i++) {
				ch[i]='0';
				
			}
			//src에서 문자배열을 뽑아서 4에서 생성한 배열에 복사한다.
			System.arraycopy(src.toCharArray(),0,ch,length-src.length(),src.length());
			
			return new String(ch);
		}
		
		
		
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));

	}

}
