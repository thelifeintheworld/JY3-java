package com.test.mor;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(123456,"章鱼","女",23,false,"1233214566544456","深海","0351-227236",null);
		Person p2 = new Person(123446,"带鱼","男",23,false,"1233214566588856","深海","0351-227886",p1);
		p1.wh = p2;
		System.out.println(p1.ismarry);
		System.out.println(p2.ismarry);
		  boolean marry= p1.marry(p2);
		  System.out.println(p1.ismarry);
			System.out.println(p2.ismarry);
			System.out.println(marry);
		System.out.println(p1.name+"的伴侣是："+p1.wh.name);
	}

}
//
