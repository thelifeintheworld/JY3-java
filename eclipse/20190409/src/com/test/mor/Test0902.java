package com.test.mor;

public class Test0902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//无参构造器 默认值
		 Point p1 = new Point();
		 System.out.println(p1.x);
		 System.out.println(p1.y);
		 //有参构造器 1 变量
		 Point p2 = new Point(2);
		 System.out.println(p2.x);
		 System.out.println(p2.y);
		 //有参构造器 2 变量
		 Point p3 = new Point(2,4);
		 System.out.println(p3.x);
		 System.out.println(p3.y);
		 Point p4 = new Point('中',4);
		 System.out.println(p4.x);
		 System.out.println(p4.y);
	}

}
