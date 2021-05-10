package com.test;
 class BBSItem {
	static int lastSeqNo = 0; 
	int seqNo; //일련번호 필드
//	int seqNo = 0;
//	int seqNo = i++;
	String writer; //작성자 필드
	String writtenDate; //작성일자필드
	String title; //제목필드
	String content; //내용필드
	
	BBSItem(){}
	BBSItem(int seqNo, String writer, String writtenDate, String title, String content){ //생성자
		this.seqNo = ++lastSeqNo;
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;
	}
}
public class Workshop2_3 {

	public static void main(String[] args) {
	
		BBSItem a = new BBSItem(3,"s","s","g","s");
		int A =a.seqNo;
		System.out.println(A);
		BBSItem b = new BBSItem();
		int B = b.seqNo;
		System.out.println(B);
		

	}

}
