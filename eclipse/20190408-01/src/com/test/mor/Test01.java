package com.test.mor;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.name =  "����¥�Ρ�";
		b1.pages = 800;
		b1.price = 55.3;
		b1.writer = "��ѩ�� �߶�";
		b1.ISBN = "978 666666 8888";
		b1.type = "�ŵ���ѧ����������";
		b1.foundation = "����ѧ������";
		b1.iscollection = true;
		System.out.println("������"+b1.name);	
		System.out.println("��ҳ��"+b1.pages);
		System.out.println("�۸�"+b1.price);
		System.out.println("���ߣ�"+b1.writer);
		System.out.println("�����ţ�"+b1.ISBN);
		System.out.println("���ࣺ"+b1.type);
		System.out.println("�����磺"+b1.foundation);
		b1.Watch();
		b1.iscollection=true;
		System.out.println("����۸�Ϊ��"+Book.Shop());
	}
}
	class Book{
		String name;
		int pages;
		static double price;
		String writer;
		String ISBN;
		String type;
		String foundation;
		boolean iscollection;
		public void Watch() {
			System.out.println("���ڱ���������");
		}
		public boolean Collection() {
			return iscollection;
		}
		public static   double Shop() {
			System.out.print("���빺��������");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			double x = i * price;
			return x;
		}
	}
	
