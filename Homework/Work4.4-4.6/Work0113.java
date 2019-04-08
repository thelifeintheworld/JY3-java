import java.util.*;
public class Work0113{
	/*public static void main(String[] args){
		System.out.print("输入月份");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int i=1;
		for(i=1;i<=m;i++){
			System.out.println("兔子第"+i+"个月的总数为："+f(i));
		}
		}
		public static int f(int x){
			if(x==1||x==2)
				return 1;
			else
				return f(x-1)+f(x-2);
	}*/
			public static void main(String[] args) {
		int amount; //每个月的兔子总数
		int nAmount = 1; //第一个月的兔子数量
		int oAmount = 1; //第二个月的兔子数量
		for(int i=1;i<=2;i++){
		amount=1;
		System.out.println("第" + i + "个月的兔子总是为：" + amount);
		}
		for(int i=3;i<=12; i++) {
		amount = oAmount + nAmount;
		oAmount = nAmount;
		nAmount = amount;
		System.out.println("第" + i + "个月的兔子总是为：" + amount);
		}
		}
	}