package com.test.mor;

public class Point {
	int x;
	int y;
	//����������  ��������ͬ�������б�ͬ
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
