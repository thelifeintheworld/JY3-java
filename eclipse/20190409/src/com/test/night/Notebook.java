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
	System.out.println("�ʼǱ�����ɫΪ��"+b.color+"�ʼǱ���CPU�ͺ�Ϊ��"+b.cpu);
}
}
