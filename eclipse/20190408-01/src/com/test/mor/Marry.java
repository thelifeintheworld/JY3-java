package com.test.mor;

public class Marry {
	public static boolean MarryRuler(Person p1, Person p2) {
		if(p1.sex != p2.sex) {
		if(p1.age>=20 && p2.age>=22 && p1.sex == "Ů"||p2.age>=20 && p1.age>=22 && p2.sex == "Ů") {
			if(!p1.ismarry == !p2.ismarry) {
				p1.ismarry =true;
				p2.ismarry = true;
				p1.wh = p2;
				p2.wh = p1;
				return true;
		}
		}
	}
		return false;
	}
}
