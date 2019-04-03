import java.util.*;
public class Ketanglian1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String inputname = sc.next();
		char username = inputname.charAt(0);
		char Usern = 'a';
		System.out.println("请输入密码：");
		String inputpassword = sc.next();
		char userpsw = inputpassword.charAt(0);
		char Psw = 'c';
	if(username == Usern && userpsw == Psw){
		System.out.println("登录成功....");
	}
	
	}
}