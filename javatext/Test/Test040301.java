import java.util.*;
public class Test040301{
	public static void main(String[] args){
	int a = 0;//��ʼ��a
	int b = 0;//��ʼ��b
	int i;
	for(i=1;i<10;i++){
		a=a+i;
		}
		System.out.println("a��ֵΪ��"+a);
	
	for(i=0;1<10;i++){
		b=b+i;
}
	 System.out.println("b��ֵΪ��"+b);
	
	int num = a*1000 + a*100 + b*10 + b;//��ʾ��x
	double y = Math.sqrt(num);//��ƽ����֤
	if(y%1 == 0){
	System.out.print(num);//�������
	}
	}
	  
}