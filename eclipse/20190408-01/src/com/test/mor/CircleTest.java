package com.test.mor;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		//圆心
		 Point p = new Point(2,3);
		 //圆
		 Circle c = new Circle(p,6);
		 //比较的点
		 Point p2 = new Point(4,9); 
		 System.out.println(Circle.Contains(p2) == true?"在圆内":"在圆外");
	}
}