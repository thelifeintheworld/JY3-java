import java.util.*;
public class Work0301{
	public static void main(String[] args){
	//a
	//bde
	/*
	int x = 2;
	int y = 1;
	boolean z = (x!=2 && y==y++);
	System.out.println(z);
	System.out.println("y="+y);
	*/
	/*
	int x = 1;
	int y = 2;
	int z = 3;
	System.out.println(y+=z--/++x);
	*/
	//work1
	/*
	    Scanner sc = new Scanner(System.in);
		System.out.print("请输入数字：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.print("a的值为："+a+"\t");
		System.out.print("b的值为："+b);
		*/
		//work2
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入数字：");
		int i = sc.nextInt();
		if(i<1000){
		int a = i/100;
		int b = (i-a*100)/10;
		int c = i-a*100-b*10;
		int d = a+b+c;
		System.out.println("各位数之和为："+d);
		System.out.print(i+"的百位数为："+a+"，十位数为："+b+",个位数为："+c);
		}else if(i<0){
			System.out.println("请输入有效数字：");
		}else{
			System.out.println("请输入有效数字：");
		}
}
}