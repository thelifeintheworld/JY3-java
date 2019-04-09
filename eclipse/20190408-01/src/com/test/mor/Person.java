package com.test.mor;

class Person{
	int num;
	String name;
	String sex;
	int age;
	boolean ismarry;
	String idno;
	String add;
	String tel;
	Person	wh;
	public Person() {}
	public Person(int num,String name,String sex,int age,boolean ismarry,String idno,
	String add,String tel,Person wh)
	{this.num =num;
	this.name =name;
	this.sex = sex;
	this.age = age;
	this.ismarry = ismarry;
	this.idno = idno;
	this.add = add;
	this.tel = tel;
	this.wh = wh;
	}
	public  boolean marry(Person aPerson) {
		Marry marry	= new Marry();
		boolean result =Marry. MarryRuler( this, aPerson);
		return result;
	}
}

