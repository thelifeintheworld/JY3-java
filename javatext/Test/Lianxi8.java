import java.util.*;
public class Lianxi8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String a = sc.next();
		int c1 = 0;
		int c2 = 0;
		for(int i=0; i<a.length(); i++){
		int tmp = Integer.parseInt(a.charAt(i) + "");
		if(i % 2 == 0){
		c1 += tmp;
		}else{
		c2 += tmp;
		}
		}
		System.out.println("奇数和: " + c1);
		System.out.println("偶数和: " + c2);
		
		int cc = c1 + c2 * 3;
		int m = cc % 10;
		System.out.println("校验码："+m);
	}
	}