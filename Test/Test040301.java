import java.util.*;
public class Test040301{
	public static void main(String[] args){
	for(int a = 0;a<10;a++){
	for(int b = 0;b<10;b++){	
	int num = a*1000 + a*100 + b*10 + b;//��ʾ��x
	double y = Math.sqrt(num);//��ƽ����֤
	if(y%1 == 0)
	{	 
	System.out.println("a��ֵΪ��"+a);
	System.out.println("b��ֵΪ��"+b);
	System.out.println("y��ֵΪ��"+y);
	System.out.println("������Ϊ��"+num);//�������
	}
		}
	 }
	}
}