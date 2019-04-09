package com.test.mor;

public class Test02 {
public Test02() {
	name = "¡¶ºìÂ¥ÃÎ¡·";
	wirter = "²ÜÑ©ÇÛ";	
}
public  Test02(String name2,String wirter2) {
	name =name2;
	wirter = wirter2;
}
String name ;
String wirter;
public static void main(String[] args) {
	Test02 b1 = new Test02();
System.out.println(b1.name);
Test02 b2 = new Test02("shuihuzhuan","shinaian");
System.out.println(b2.name);
}
}