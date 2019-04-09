package com.test.mor;

public class User {

	String username;
	String password;
	static String[] usernames;
	static String[] passwds;
	public User(){
			usernames = new String[] {"hello"};
			passwds = new String[] {"111111"};
	}
	public static boolean checkUser(String username,String password) {
		for(int i=0;i<usernames.length;i++) {
			if(usernames[i].equals(username)&&passwds[i].equals(password)) {
			return true;
		}		
	}
		return false;
}
}