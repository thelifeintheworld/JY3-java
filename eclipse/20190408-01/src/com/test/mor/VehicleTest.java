package com.test.mor;

import java.util.Scanner;

/*
 * 19.�붨��һ����ͨ����(Vehicle)����������: 
 * �����ٶ�(speed)���(size)�ȵ� �����ƶ�(move())
 * �����ٶ�(setSpeed(int speed))��. 
 * ����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶���
 * ��ͨ������������ʼ��speed,size��ֵ����ͨ����ӡ������
 * ������ü��ټ��ٵķ������ٶȽ��иı�
 * */
public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		v1.name = "�ɻ�";
		v1.size = 776.0;
		v1.speed = 3657;
		System.out.println("�ɻ����ٶ�Ϊ��"+v1.speed);
		System.out.println("�ɻ��Ĵ�СΪ��"+v1.size);
		v1.speed = Vehicle.setSpeed(300);
		System.out.println("�ɻ����ٶ�Ϊ��"+v1.speed);
		 v1.speed=Vehicle.add(200);
		System.out.println("�ɻ����ٶ�Ϊ��"+v1.speed);
		v1.speed=Vehicle.del(100);
		System.out.println("�ɻ����ٶ�Ϊ��"+v1.speed);
	}
};
class Vehicle{
	String name;
	static int speed;
	double size;
	public static int setSpeed(int speed1) {
	speed = speed1;		
	return speed;
	}
	public static int add(int speed2) {
		speed += speed2;
		return speed;
	}
	public static int del(int speed2) {
		speed -= speed2;
		return speed;
	}
	public int move(int speed,int i) {
		System.out.print("���뽻ͨ���߹���ʱ�䣺");
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		int s = i*speed;
		return s;
	}
}