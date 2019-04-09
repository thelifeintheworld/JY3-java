package com.test.night;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.x = 0;
		p1.y = 0;
		Point p2 = new Point(22,44);
		p2.movePoint(p2.x,p2.y);
		p1.movePoint(p1.x,p1.y);
	}

}
