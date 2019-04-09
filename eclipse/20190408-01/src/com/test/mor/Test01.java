package com.test.mor;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.name =  "《红楼梦》";
		b1.pages = 800;
		b1.price = 55.3;
		b1.writer = "曹雪芹 高额";
		b1.ISBN = "978 666666 8888";
		b1.type = "古典文学、人生哲理";
		b1.foundation = "社会科学出版社";
		b1.iscollection = true;
		System.out.println("书名："+b1.name);	
		System.out.println("书页："+b1.pages);
		System.out.println("价格："+b1.price);
		System.out.println("作者："+b1.writer);
		System.out.println("出版编号："+b1.ISBN);
		System.out.println("分类："+b1.type);
		System.out.println("出版社："+b1.foundation);
		b1.Watch();
		b1.iscollection=true;
		System.out.println("所需价格为："+Book.Shop());
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
			System.out.println("正在被看。。。");
		}
		public boolean Collection() {
			return iscollection;
		}
		public static   double Shop() {
			System.out.print("输入购买数量：");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			double x = i * price;
			return x;
		}
	}
	
