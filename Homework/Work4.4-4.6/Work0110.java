import java.util.*;
public class Work0110{
	public static void main(String[] args){
	int sum = 0;
	for(int i = 0;i<101;i++){
		double a = i%10;
		double b = a/3;
	if(b == 1.0){
			sum = sum;
		}else{
			sum += i;
			}
			//System.out.println(a+","+b);
	}
	System.out.println("所求和为："+sum);

}
}