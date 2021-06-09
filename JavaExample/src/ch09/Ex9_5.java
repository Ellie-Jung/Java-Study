package ch09;

public class Ex9_5 {
	public static int count (String src, String target) { //주어진 문자열(src)에 찾으려는 문자열이 몇번 나오는지 세어서 반환
		int count = 0;// 찾은 횟수
		int pos = 0; //찾기 시작할 위치
		
		while(true) {
			//src에서 target을 pos위치부터 찾는다.
			pos = src.indexOf(target, pos);
			//찾으면 count값을 1증가, pos의 값을 target.length 만큼 증가
			if(pos !=-1) {
				count++;
				pos +=target.length(); //pos를 찾은 단어 이후로 옮긴다.
			}
			else break; //indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}

}
