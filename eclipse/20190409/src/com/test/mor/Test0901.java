package com.test.mor;

import java.util.Scanner;

public class Test0901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = sc.next();
		System.out.println("请输入密码：");
		String password = sc.next();
		boolean checkUser = User.checkUser(username,password);
		System.out.println(checkUser == true?"登陆成功":"登录失败");
	sc.close();
	}

}
