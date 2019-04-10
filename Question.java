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
	System.out.println("题号："+q.id+",题干："+q.text+"\n"+"选项："+Arrays.toString(q.options));
}
}
