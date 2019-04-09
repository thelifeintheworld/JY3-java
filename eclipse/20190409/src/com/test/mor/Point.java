package com.test.mor;

public class Point {
	int x;
	int y;
	//方法的重载  方法名相同，参数列表不同
	public Point() {
		
	}
	public Point(int p) {
		this(p,p);
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public  Point( char x,byte y) {
		this.x = x;
		this.y = y;
	}
	
	
}
