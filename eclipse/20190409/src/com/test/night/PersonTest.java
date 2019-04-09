package com.test.night;

public class PersonTest {
	public static void main(String[] args) {
		PersonCreate p1 = new PersonCreate();
		p1 = PersonCreate.PersonCreate("zhangsan",33,1.73);
		PersonCreate p2 = new PersonCreate();
		p1 = PersonCreate.PersonCreate("lishi", 44, 1.74);
		p1.Person.sayHello(p1);
		p2.Person.sayHello(p2);
	}
}
