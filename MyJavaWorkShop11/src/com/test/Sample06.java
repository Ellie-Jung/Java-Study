package com.test;

public class Sample06 {

	public static void main(String[] args) {
		String msg = "안녕하세요. 반가워요.";
		char temp = msg.charAt(1);
		System.out.println(temp);
		String msg1 = "abcdegfABCE";
		char c = msg1.charAt(7); //문자 하나 가져올때 
		System.out.println(c);
		int n = (int)c;
		System.out.println(n);
		String msg2 = " 반가워요 ";
		System.out.println(msg2.length());
		System.out.println(msg2.trim().length());
		System.out.println(msg2.trim()); //공백없애기
		System.out.println(msg1.startsWith("ab")); //ab로 시작하면 true
		int ms2 = 1234;
		String temp2 = String.valueOf(ms2);
		System.out.println(temp2+ 2);
		String msg3 = "ababc";
		String msg4 = msg3.replace("b", "c");//msg3의 모든 b를 c로 바꾸기
		System.out.println(msg4);
		String tel = "010-123-1234";
		tel.substring(0,3); //0번째부터  2번까지 뽑아내기 (마지막 3은 제외)
		System.out.println(tel.substring(0,3));
		System.out.println(tel.substring(4,7));
		System.out.println(tel.substring(3)); // 3번부터 끝까지 다 뽑기 
		char c3 = "반가워요".charAt(0); //ㅇㅣ것도 가능함. 반 출력
		System.out.println(c3); 
	}

}
