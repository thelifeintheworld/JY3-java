package com.test.mor;

import java.util.Scanner;

/*
 * 19.请定义一个交通工具(Vehicle)的类其中有: 
 * 属性速度(speed)体积(size)等等 方法移动(move())
 * 设置速度(setSpeed(int speed))等. 
 * 最后在测试类Vehicle中的main()中实例化一个交通工具对象
 * 并通过方法给它初始化speed,size的值并且通过打印出来。
 * 另外调用加速减速的方法对速度进行改变
 * */
public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		v1.name = "飞机";
		v1.size = 776.0;
		v1.speed = 3657;
		System.out.println("飞机的速度为："+v1.speed);
		System.out.println("飞机的大小为："+v1.size);
		v1.speed = Vehicle.setSpeed(300);
		System.out.println("飞机的速度为："+v1.speed);
		 v1.speed=Vehicle.add(200);
		System.out.println("飞机的速度为："+v1.speed);
		v1.speed=Vehicle.del(100);
		System.out.println("飞机的速度为："+v1.speed);
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
		System.out.print("输入交通工具工作时间：");
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		int s = i*speed;
		return s;
	}
}