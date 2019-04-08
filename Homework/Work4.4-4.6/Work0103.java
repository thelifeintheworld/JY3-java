import java.util.*;
public class Work0103{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入正方形的大小：");
        int a = sc.nextInt();
		int	b = sc.nextInt();
		//打印正方形边框
		String[][] arr = new String[a][b];
		int i,j;
		for(i=0;i<=a;i++){
			for(j=0;j<=b;j++){
						if(i==0||j==0){
							System.out.print("* ");
							}else if(j==b ||i==a){
							System.out.print("* ");
							}
								else{
							System.out.print("  ");
							}
			}
		System.out.println();}
	}
}