package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample10 {

	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus","cA","ca","co","c.","c0","car","cobat","count"};

		Pattern p = Pattern.compile("c[a-z]*"); //c�� �����ϴ� �ҹ��ڿ��ܾ�

		for (int i =0; i <data.length;i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) 
			{System.out.println(data[i]+",");}
		}
	}
}
