import java.util.*;
public class Ketang0303{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������Ǯ��ݣ�");
		int year = sc.nextInt();
		double baseli = 7.7/100;
		double lilv;
		if(year >0 && year <= 1){
		lilv = baseli *0.5;
		System.out.println("һ���ڵ�����Ϊ��"+lilv);
		}
		else if(year >1 && year <=3){
		lilv = baseli *0.7;
		System.out.println("�����ڵ�����Ϊ��"+lilv);
		}else if(year >3 && year <= 5){
			lilv = baseli ;
		System.out.println("�����ڵ�����Ϊ��"+lilv);
		}else if(year >5){
			lilv = baseli*1.1 ;
		System.out.println("�������ϵ�����Ϊ��"+lilv);
		}else{
		System.out.println("�ȴ�Ǯ��˵*-*��");
		}
		}



	
	}