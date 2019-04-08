import java.util.*;
public class Test040301{
	public static void main(String[] args){
	for(int a = 0;a<10;a++){
	for(int b = 0;b<10;b++){	
	int num = a*1000 + a*100 + b*10 + b;//表示出x
	double y = Math.sqrt(num);//开平方验证
	if(y%1 == 0)
	{	 
	System.out.println("a的值为："+a);
	System.out.println("b的值为："+b);
	System.out.println("y的值为："+y);
	System.out.println("所求结果为："+num);//输出所得
	}
		}
	 }
	}
}