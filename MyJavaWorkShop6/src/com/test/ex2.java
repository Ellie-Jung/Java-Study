package com.test;
class Rectangle{
	private int width, height;
	Rectangle(int width, int height)throws Exception{
		if(width <= 0 || height <=0)
			throw new Exception("���̿� ���̴� ������� �Ѵ�.");
		this.width = width;
		this.height=height;
	}
	int getArea() {
		return width+height;
	}
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}
}
public class ex2 {

	public static void main(String[] args) {
		
	}

}
