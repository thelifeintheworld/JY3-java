import java.util.*;
public class Work0203{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String a = sc.next();
		int c1 = 0;
		int c2 = 0;
		for(int i=0; i<a.length(); i++){
		int tmp = Integer.parseInt(a.charAt(i) + "");
		if(i % 2 == 0){
		c1 += tmp;
		System.out.println(i+"次偶数位相加为：c1="+a.charAt(i));
		}else{
		c2 += tmp;
		System.out.println(i+"次奇数为相加为：c2="+a.charAt(i));
		}	
		}
		System.out.println("奇数和: " + c1);
		System.out.println("偶数和: " + c2);

}
}