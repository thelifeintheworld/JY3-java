package com.test.mor;

public class YB {
	String name;
	String miaoshu;
	int height;
	double weight;
	public YB() {	
	}
	public void mao() {
		System.out.println("��ë��");
	}
	public void jiao() {
		System.out.println("�нǣ�");
	}
	public void eat() {
		System.out.println("�Բݣ�");
	}
}
class Yang extends YB{
	public Yang() {
		super();
	}
	public Yang(String name,int height,double weight) {
		this.height = 178;
		this.name = "��";
		this.weight = 99.99;
	}
	public void maoz() {
		System.out.println("֯ë�£�");	
	}
} 
class shan extends Yang{
	public shan() {}
}