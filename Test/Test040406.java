import java.util.*;
public class Test040406{
	public static void main(String[] args){
	int i = 1;
	int sum = 0;
	while(i<101){
	i++;
	int a = i%10;
	int b = a/3;
	if(b == 1){
	sum =sum;
	}
	sum += i;
	}
	System.out.println(sum);
	}
	}