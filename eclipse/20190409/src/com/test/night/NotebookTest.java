package com.test.night;

public class NotebookTest {
public static void main(String[] args) {
	Notebook b1 = new Notebook('ºì',44);
	Notebook b2 = new Notebook();
	b2.color ='»Æ';
	b2.cpu = 22;
	b1.output(b1);
	b2.output(b2);
}
}
