import java.util.*;
public class Work03020202{
	public static void main(String[] args){
//work3
/*	double a = 30000;
	double sum = 0;
	for (int i=1;i<=10 ;i++ )
	{	
	     a = a*(6/100+1);
		 sum = sum + a;
	System.out.println(i+"��������Ϊ"+sum);
	System.out.println(i+"�깤��Ϊ"+a);
	}*/
//work4
	/*	int t=1;
		for (int i=0;i <10; i++)
		{	t=(t+1)*2;}
			System.out.println(t);
*/
//work12
	/*	Scanner scanner = new Scanner(System.in);
		System.out.print("����������:");
		double x = scanner.nextDouble();
		double a =0;
		if (x>5000)
		{a=50;
		}else if (x>100)
		{a=x*1/100;
		}else if (x<0)
		{System.out.print("������������");
		}else{a=1;}
		System.out.print("������Ϊ��"+a);
		*/
//work13

//work14
	//int sum=0;
/*1	for (int i=0;i<101 ;i++ )
	{
	if (i%3==0)
	{sum=sum+i;
	}
	}*/
/*2	int i=0;
	while(i<101){
	i++;
	if (i%3==0)
	{sum=sum+i;
	}
	}*/
	/*		int i =0;
			do
			{   
				i++;
				if (i%3==0)
				{sum=sum+i;
				}
			}
			while (i<101);
			*/
		//	System.out.print(sum);

//work4.4

//work4.7 
/*
int[] a ={0,1,2,3,4,5,6,7,8,9};
for (int i=0;i<a.length/2 ;i++ )
{int t;
t=a[i];
a[i]=a[a.length-i-1];
a[a.length-i-1]=t;
}
for (int i=0;i<a.length ;i++ )
{System.out.print(a[i]);
}	
	}
	}*/
//work4.8 
/*	Object[] a = {1,2,2,2,2,2,44,55,66,77,22,66,9999,0,8};
	Object[] newa = Reprat(a);
	System.out.print(newa);
		}
	public static Object[] Reprat(Object[] a){
	int t=0;
	Object[] tempa = new Object[a.length];
	for (int i=0;i<a.length ;i++ )
	{boolean isTrue = true;
	for (int j=i+1;j<a.length ;j++ )
	{if (a[i]==a[j])
	{isTrue = false;
	break;
	}
	}
	if (isTrue)
	{tempa[t]=a[i];
	t++;
	}
	}
	Object[]newa = new Object[t];
	System.arraycopy(tempa,0,newa,0,t);
	return newa;
	}
}*/
//work4.9
/*
double[] d= new double[]{-10,2,3,246,-100,0,5};
double max = Max(d);
double min = Min(d);
double mid = Mid(d);
System.out.println("���ֵ��"+max);
System.out.println("��Сֵ��"+min);
System.out.println("ƽ��ֵ��"+mid);

}
public static double Max(double[] doubleArray){
double temp = doubleArray[0];
for (int i=0;i< doubleArray.length;i++ )
{if (temp<doubleArray[i])
{temp=doubleArray[i];
}
}
return temp;
}
public static double Min(double[] doubleArray){
double temp = doubleArray[0];
for (int i=0;i< doubleArray.length;i++ )
{if (temp>doubleArray[i])
{temp=doubleArray[i];
}
}
return temp;
}
public  static double Mid(double[] doubleArray){
double temp = 0;
for (int i=0;i< doubleArray.length;i++ )
	{temp+=doubleArray[i];
}
return temp/doubleArray.length;
}
}*/
