package com.test.mor;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		//Բ��
		 Point p = new Point(2,3);
		 //Բ
		 Circle c = new Circle(p,6);
		 //�Ƚϵĵ�
		 Point p2 = new Point(4,9); 
		 System.out.println(Circle.Contains(p2) == true?"��Բ��":"��Բ��");
	}
}