import java.util.*;
public class Work0103{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入数组的大小：");
        int a = sc.nextInt();
		int	b = sc.nextInt();
		//打印正方形边框
		String[][] arr = new String[a][b];
		int i,j;
		for(i=0;i<=a;i++){
			for(j=0;j<=b;j++){
						if(i==0||j==0){
							 arr[i][j] = ;
							}else if(j==b ||i==a){
							  arr[i][j] = ;
							}
								else{
							System.out.print(Arrays.toString(arr));
							}
			}
		System.out.println();}
	}
}