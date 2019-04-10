package com.test.mor;

public class Memu {
static String name = "Æ»¹û";
int num;
double price;
public Memu() {
	
}
public static void showname() {
	System.out.print(name);
}
}
class cake extends Memu{
	String name;
	public cake() {
		name = "bridthday";
	}
	public cake(String name,int num,double price) {
		this.name = name;
		this.num = num;
		this.price = price;
	}
	public void showname(cake cake) {
		System.out.print(cake.name);
	}
}