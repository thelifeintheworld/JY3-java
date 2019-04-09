package com.test.night;

public class Rectangle {
int width;
int length;
public Rectangle() {
	
}
public Rectangle(int width,int length) {
	this.length=length;
	this.width=width;
}
public static int getArea(int x,int y) {
	 return x*2+y*2;
}
public static int getPer(int x,int y) {
	return x*y;
}
public static void showAll(int x,int y) {
	System.out.println("长方形的长为："+x+"长方形的宽为："+y);
}

}
