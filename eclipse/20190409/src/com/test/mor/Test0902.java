package com.test.mor;

public class Test0902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޲ι����� Ĭ��ֵ
		 Point p1 = new Point();
		 System.out.println(p1.x);
		 System.out.println(p1.y);
		 //�вι����� 1 ����
		 Point p2 = new Point(2);
		 System.out.println(p2.x);
		 System.out.println(p2.y);
		 //�вι����� 2 ����
		 Point p3 = new Point(2,4);
		 System.out.println(p3.x);
		 System.out.println(p3.y);
		 Point p4 = new Point('��',4);
		 System.out.println(p4.x);
		 System.out.println(p4.y);
	}

}
