package com.test.mor;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(123456,"����","Ů",23,false,"1233214566544456","�","0351-227236",null);
		Person p2 = new Person(123446,"����","��",23,false,"1233214566588856","�","0351-227886",p1);
		p1.wh = p2;
		System.out.println(p1.ismarry);
		System.out.println(p2.ismarry);
		  boolean marry= p1.marry(p2);
		  System.out.println(p1.ismarry);
			System.out.println(p2.ismarry);
			System.out.println(marry);
		System.out.println(p1.name+"�İ����ǣ�"+p1.wh.name);
	}

}
//
