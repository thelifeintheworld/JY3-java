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
		System.out.print("���������֣�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.print("a��ֵΪ��"+a+"\t");
		System.out.print("b��ֵΪ��"+b);
		*/
		//work2
		Scanner sc = new Scanner(System.in);
		System.out.print("���������֣�");
		int i = sc.nextInt();
		if(i<1000){
		int a = i/100;
		int b = (i-a*100)/10;
		int c = i-a*100-b*10;
		int d = a+b+c;
		System.out.println("��λ��֮��Ϊ��"+d);
		System.out.print(i+"�İ�λ��Ϊ��"+a+"��ʮλ��Ϊ��"+b+",��λ��Ϊ��"+c);
		}else if(i<0){
			System.out.println("��������Ч���֣�");
		}else{
			System.out.println("��������Ч���֣�");
		}
}
}