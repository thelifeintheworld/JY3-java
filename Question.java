package com.test.mor;

import java.util.Arrays;

public class Question {
int id;
String text;
String [] options;
public Question() {}
public boolean checkAnswer() {
	return false;
}
public void outout(Question q) {
	System.out.println("��ţ�"+q.id+",��ɣ�"+q.text+"\n"+"ѡ�"+Arrays.toString(q.options));
}
}
