package com.test.mor;

public class Circle {
	  int r; 
	  Point p1;
	public Circle() {
	} 
	public Circle(Point p,int r) {
		this.p1 =p;
		this.r = r;
	}
	//�����
	public  boolean Contains(Point p) {
	boolean result = Math.pow((p.x-p1.x),2)+Math.pow((p.y-p1.y),2) <= r*r;
	return result;
}
public   boolean Contains(int x,int y) {
boolean result = Math.pow((x-p1.x),2)+Math.pow((y-p1.y),2) <= r*r;
return result;
}
//�����
public  double area(int r){	 
	return Math.PI*r*r;
	}
}
class Point {
int x;
int y;
//����������  ��������ͬ�������б�ͬ
public Point() {
	
}
public Point(int p) {
	this(p,p);
}
public  Point(int x,int y) {
	this.x = x;
	this.y = y;
}				
}

