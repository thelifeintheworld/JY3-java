import java.util.*;
public class Work03020201{
	public static void main(String[] args){
		//work 1
/*企业发放的奖金根据利润提成。
利润低于或等于10万元时，奖金可提10%；
利润高于10万元，低于或等于20万元时，高于10万元的部分，可提成7.5%；
高于20万，低于或等于40万时，高于20万元的部分，可提成5%；
高于40万，低于或等于60万时，高于40万元的部分，可提成3%；
高于60万，低于或等于100万时，高于60万元的部分，可提成1.5%，
高于100万元时，超过100万元的部分按1%提成，
在程序中设定一个变量为当月利润，求应发放奖金总数？（知识点：条件语句） [必做题]*/
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("请输入利润（万元）：");
		double a = sc.nextDouble();
		double b = 0;
		if(a>100.0){
			b = (a-b)*1/100+40*1.5/100+10*0.1+10*7.5/100+20*5/100+20*3/100;
		}else if(a<0){
		System.out.println("亏损了居然还想要奖金*—*'!");
		}else if(a>60){
		b = (a-60)*1.5/100+10*0.1+10*7.5/100+20*5/100+20*3/100;
		}else if(a>40){
		b = (a-40)*3/100+10*0.1+10*7.5/100+20*5/100;
		}else if(a>20){
		b = (a-20)*5/100+10*0.1+10*7.5/100;
		}else if(a>10){
		b = (a-10)*7.5/100+10*0.1;
		}else{
		b = a*10/100;
		}
	System.out.println("当月的奖金为："+b+"万元");  */
//work2


//有问题
/* 、给定一个成绩a，使用switch结构求出a的等级。
A：90-100，B：80-89，C：70-79，D：60-69，E：0~59
（知识点：条件语句switch） [必做题]*/
	/*	String info = "";
		String num = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入成绩:");
		int a = scanner.nextInt();
		if(a<0){
			System.out.println("输入有误....");
		}
		else if(a<60) {
		 num = "x";
		}else if(a<70) {
		 num = "6";
		}else if(a<80) {
		 num = "7";
		}else if(a<90) {
		 num = "8";
		}else if(a<=100) {
		 num = "9";
		}else{
		System.out.println("超神了！");
		}
			
		switch(num){
			case"9":
				info="您的等级为：A";
			case"8":
				info="您的等级为：B";
			case"7":
				info="您的等级为：C";
			case"6":
				info="您的等级为：D";
			default:
				info="您的等级为：E";
			}
		System.out.println(info);
		*/

	//work5
/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数字:");
		int a = scanner.nextInt();
		if(a%2==0){
		System.out.println("输入的数字时偶数");
		}
		else{System.out.println("输入的数字时奇数");}
		*/

	//work6
	/*	Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数字:");
		int x = scanner.nextInt();
		if (x==1)
		{x=1;
		}else if (x==5)
		{x=5;
		}else if (x==10)
		{ x=10;
		}else 
		{x = (int)"none";
		}
		System.out.print("x的值为"+x); 
		*/
		//work7
	/*	Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数字:");
		int x = scanner.nextInt();
		if(x%5==0&&x%6==0){
		System.out.print(x+"可以被5和6整除");
		}
		else if (x%5==0)
		{System.out.print(x+"可以被5整除");
		}else if (x%6==0)
		{System.out.print(x+"可以被6整除");
		}else{
		System.out.print(x+"不可以被5和6整除");
		}*/
		//work8
	/*	Scanner scanner = new Scanner(System.in);
		System.out.print("请输入年份:");
		int x = scanner.nextInt();
		if (x%100==0 && x%4 == 0 ||x%400==0)
		{System.out.print(x+"是闰年。");
		}*/
		//work9
/*		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入成绩:");
		int x = scanner.nextInt();
		if(x>100){System.out.print("输入数据有误...");}
		else if (x>90)
		{System.out.print("成绩等级为：A");
		}else if (x>80)
		{System.out.print("成绩等级为：B");
		}else if (x>70)
		{System.out.print("成绩等级为：C");
		}else if (x>60)
		{System.out.print("成绩等级为：D");
		}else if (x<0)
		{System.out.print("输入数据有误...");
		}else{System.out.print("成绩等级为：E");}
		*/
		//4.1
	/*	int[] arr = {10,20,30,40,50};
		System.out.print(Arrays.toString(arr));		
		*/
		//work4.2
		String[] s1={"n","e","u","s","o","f","t","d","d","u","c","a","t","i","o","n"};
		String[] s2 = new String[s1.length];
		System.arraycopy(s1,0,s2,0,s1.length);
		System.out.println("s2:"+Arrays.toString(s2));
		
		//work4.3
/*		int[] num = {1,6,2,3,9,4,5,7,8};
		int[] num2 = bubblesort(num);
	    System.out.println(Arrays.toString(num2));
	}
	public static int[] bubblesort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
			if(array[j]>array[j+1]){
			int temp = array[j];
			array[j] = array[j+1];
			array[j+1] = temp;
			}
			}
			//System.out.println(Arrays.toString(array));
		}
		return array;
	}
}*/
		//4.5
	/*	double[][] arr= new double[5][4];
		arr = {{11.2,33,555},{666,99.0,1,4},{34.21,55.55,3.214},{0.222,34,57},{99,44}};
		System.out.println(Arrays.toString(arr));
		*/
		//4.6
/*		int[] arr = {18,25,7,36,13,2,89,63};
			int i;
		print(arr);
		System.out.println("最大元素为："+max(arr));
		System.out.println("最大元素索引为："+maxIndex(arr));
	}
		public static void print(int[] arr){
		for (int i=0;i<arr.length ;i++ )
		{System.out.print(arr[i]+"\t");
		}
		System.out.println();
		}
				public static int max(int[] arr){
				int max=arr[0];
				for (int i=0;i<arr.length ;i++ )
				{if (arr[i]>max)
				{max=arr[i];
				}
				}
				return max;
				}
				public static int maxIndex(int[] arr){
				int maxIndex=0;
				for (int i=0;i<arr.length ;i++ )
				{if (arr[i]<arr[maxIndex])
				{maxIndex=i;
				}
				}
				return maxIndex;
				}

		*/
}
}