import java.util.*;
public class Test040402{
	public static void main(String[] args){
		//数组初始化
		//动态初始化
	/*	
	int arr[] = new int[8];
		arr[0] = 4;
		arr[3] = 2;
		arr[6] = 5;
		arr[7] = 6;
		*/
		/*
		静态初始化1
		
		int arr[] = new int[]{ 3,4,5,6,7,8};
		*/
		//静态初始化2
		int[] arr = {1,2,3,4,5,6,9,7,8};
		for(int i=0;i<arr.length;i++){
		System.out.println("数组元素为："+arr[i]);
		}
	}
}