package com.test.mor;

import java.util.Scanner;

public class Test0901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = sc.next();
		System.out.println("���������룺");
		String password = sc.next();
		boolean checkUser = User.checkUser(username,password);
		System.out.println(checkUser == true?"��½�ɹ�":"��¼ʧ��");
	sc.close();
	}

}
