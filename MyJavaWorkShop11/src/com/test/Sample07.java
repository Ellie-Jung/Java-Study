package com.test;

public class Sample07 {

	public static void main(String[] args) {
		String msg1 = "이순신";
		String msg2 = "강감찬";
		String msg3 = msg1 + msg2;
		System.out.println(msg3);
		
		StringBuffer sb = new  StringBuffer("이순신");
		System.out.println(sb.capacity());
		sb.append("강감찬");//위에거를 이렇게 가능 .더편함
		System.out.println(sb.toString());
		sb.insert(1,"세종대왕"); //비집고 들어가기
		System.out.println(sb.toString());
		sb.replace(1, 3, "안녕");//1번부터 2번까지 변경 안녕으로
		System.out.println(sb.toString());
		sb.delete(1,4); //1번부터 3번까지 삭제하기
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
	}

}
