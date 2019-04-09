package com.test.night;

public class Notebook {
char color;
int cpu;
public Notebook() {}
public Notebook(char color,int cpu) {
	this.color = color;
	this.cpu = cpu;
}
public void output(Notebook b) {
	System.out.println("笔记本的颜色为："+b.color+"笔记本的CPU型号为："+b.cpu);
}
}
