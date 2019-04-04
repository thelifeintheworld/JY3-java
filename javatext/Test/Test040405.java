import java.util.*;
public class Test040405{
	public static void main(String[] args){
	/*	int i = 100;
		while(i<10000){
		i++;
		int a = i/100;
		int b = (i-a*100)/10;
		int c = (i-a*100)%10;
		int x = a*a*a+b*b*b+c*c*c;
		if(i == x){
		System.out.println("有水仙数为："+i);
		}*/
		for( int i=100;i<1000;i++){
		int a = i/100;
		int b = (i-a*100)/10;
		int c = (i-a*100)%10;
		int x = a*a*a+b*b*b+c*c*c;
		if(i == x){
		System.out.println(i+"是水仙数，百位数为："+a);
		System.out.println(i+"是水仙数，十位数为："+b);
		System.out.println(i+"是水仙数，个位数为："+c);
		}
		}
		}
	}
