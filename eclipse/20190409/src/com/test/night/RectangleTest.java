package com.test.night;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle re = new Rectangle(4,6);
		int s = Rectangle.getArea(4,6);
		int c = Rectangle.getPer(4,6);
		System.out.println(s);
		System.out.println(c);
		re.showAll(re.length, re.width);
	}

}
