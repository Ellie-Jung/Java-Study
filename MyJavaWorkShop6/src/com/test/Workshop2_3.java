package com.test;
 class BBSItem {
	static int lastSeqNo = 0; 
	int seqNo; //�Ϸù�ȣ �ʵ�
//	int seqNo = 0;
//	int seqNo = i++;
	String writer; //�ۼ��� �ʵ�
	String writtenDate; //�ۼ������ʵ�
	String title; //�����ʵ�
	String content; //�����ʵ�
	
	BBSItem(){}
	BBSItem(int seqNo, String writer, String writtenDate, String title, String content){ //������
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
