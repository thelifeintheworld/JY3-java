package com.test.mor;

public class YB {
	String name;
	String miaoshu;
	int height;
	double weight;
	public YB() {	
	}
	public void mao() {
		System.out.println("ÓÐÃ«£¡");
	}
	public void jiao() {
		System.out.println("ÓÐ½Ç£¡");
	}
	public void eat() {
		System.out.println("³Ô²Ý£¡");
	}
}
class Yang extends YB{
	public Yang() {
		super();
	}
	public Yang(String name,int height,double weight) {
		this.height = 178;
		this.name = "Ñò";
		this.weight = 99.99;
	}
	public void maoz() {
		System.out.println("Ö¯Ã«ÒÂ£¡");	
	}
} 
class shan extends Yang{
	public shan() {}
}