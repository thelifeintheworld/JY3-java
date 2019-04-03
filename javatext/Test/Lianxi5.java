import java.util.*;
public class Lianxi5{
	public static void main(String[] args){
		System.out.print("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String a = "";
		if(score >100 ){
		 a = "super man";
		}
		else if(score >=90 && score <=100){
		a = "优秀";
		}
		else if(score >=80 && score <=90){
		a = "良好";
		}
		else if(score <=80){
		a = "不及格";
		}
		else{a = "super man";}
	System.out.println("您的评价为"+a);
	}
}