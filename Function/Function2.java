import java.util.*;
public class Function2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int x = sc.nextInt();
		int y = Lianxi3(x);
		int h = Lianxi2(x);
		int g = Lianxi32(x);
		System.out.println("练习3的结果："+y);
		System.out.println("练习2的结果："+h);
		System.out.println("练习3.2的结果："+g);
	}
	public static int Lianxi3(int a){
		return a % 3; 
	}
	public static int Lianxi2(int c){
		int d = c * c - 2 * c + 4;
		return d;
	}
	public static int Lianxi32(int x){
	return x++;
	}
}