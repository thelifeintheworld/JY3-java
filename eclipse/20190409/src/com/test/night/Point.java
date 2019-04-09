package com.test.night;

public class Point {
int x;
int y;
public Point() {
	System.out.println(x);
	System.out.println(y);
}
public Point(int x0,int y0) {
	this.x = x0;
	this.y = y0;
	System.out.println(x);
	System.out.println(y);
}
public void movePoint(int dx,int dy) {
	x += dx;
	y += dy;
	System.out.println("x:"+x+"y:"+y);
}
}
