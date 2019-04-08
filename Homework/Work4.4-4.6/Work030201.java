import java.util.*;
public class Work030201{
	public static void main(String[] args){
//Á·Ï°1
/*
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÊý×Ö£º");
		int x = sc.nextInt();
		if(x%2==0){
		System.out.println("ÊäÈëµÄÊýÖµ"+x+"ÊÇÅ¼Êý");
		}
		System.out.println("ÊäÈëµÄÊýÖµÎª£º"+x);
		*/
		//Á·Ï°2
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÊý×Ö£º");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>y){System.out.println(x);}
		else{System.out.println(y);} */
		//Á·Ï°3.1
	/*	int i = 1;
		int sum = 0;
		while(i<101){
			sum += i;
		i++;}
		System.out.println(sum);  */
		//Á·Ï°3.2
	/*	int i = 1;
		int sum = 0;
		while(i<101){
			if(i%2==0){
			sum = sum;
			}else{
			sum += i;}
			i++;
		}
		System.out.println(sum);  */
		//Á·Ï°3.3
	/*	int i = 0;
		int sum = 0;
		do{	i++;
			sum += i;
		}while(i<100);
		System.out.println(sum);*/
		//Á·Ï°4.1
	/*	int sum = 0;
		for(int i = 1;i<101;i++){
		sum += i;
		}
		System.out.println(sum);*/
		//Á·Ï°4.2
		int sum = 0;
		for(int i = 1;i<101;i++){
			if(i%2==0){ sum = sum;}
			else{sum += i;}
		}
		System.out.println(sum);
}
}