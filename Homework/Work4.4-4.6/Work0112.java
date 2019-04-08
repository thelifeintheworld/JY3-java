import java.util.*;
public class Work0112{
	public static void main(String[] args){
	int i,j,k; 
	int c = 0;
	double b =0.0;
	double a = 100.0;
	 for(i=20;i>=0;i--){
		 b =i*5;
		 for(j=0;j<=33;j++){
			 b += j*3;
		 for(k=0;k<=300;k++){
			  b += k*(1/3);
		if(a == b){
				c++;
			System.out.println("可以买公鸡"+i+"只，母鸡"+j+"只，小鸡"+k+"只。");
		}
		 }
		 }
	 }
	 System.out.println("共有"+c+"种方案");
}
}