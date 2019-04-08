import java.util.*;
public class Work0303{
	public static void main(String[] args){
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("请输入数字:");
		//int x = scanner.nextInt();
		//System.out.println(Jiecheng(x));
		//System.out.println(Year(x));
		//System.out.println(x+Pan(x));
		System.out.println("最小质数"+Zhinum(200));
	}
	//work5.1
	public static long Jiecheng(int x){
	long i=0;
	if (x==0||x==1)
	{i=1;
	}else{
	i=x*Jiecheng(x-1);
	}
	return i;
	}
	//work5.2
public static boolean Year(int x){
	return(x%4==0&&x%100==0)||(x%400==0);
	}
/*	public static String Pan(int x){
	int x ;
	String s = "";
	if (x%4==0&&x%100==0)||(x%400==0)
	{s="是闰年";
	}else{s="是平年";
	}*/


	//5.3 work16
public static int Zhinum(int x){
int i=200;
while (i>=200)
{for (int j=2;j<i ;j++ )
{while (i%j==0)
{break;
}
if (j ==i-1)
{break;
}
}
i++;
}
return i;
}

	//5.4  maopao test
	public static int[] bubblesort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
			if(array[j]>array[j+1]){
			int temp = array[j];
			array[j] = array[j+1];
			array[j+1] = temp;
			}
			}
			System.out.println(Arrays.toString(array));
		}
		return array;
	}
	}