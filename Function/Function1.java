import java.util.*;
public class Function1{
	public static void main(String[] args){
	/*//int x = 48;
	//char y = f(x);
	//char n = '中';
	//int m = g(n);
	*/
	Scanner sc = new Scanner(System.in);
	/*System.out.println("请输入数字：");
	int x = sc.nextInt();
	char y =  IntToChar(x);
	System.out.println(y);
*/
	System.out.println("请输入字符：");
	String num = sc.next();
	char m = num.charAt(0);
	int n = CharToInt(m);
	System.out.println(n);
	}
	//public static char IntToChar(int c){
	//return (char)c ;
	//}
	public static int CharToInt(char c){
	return c;
	}
}