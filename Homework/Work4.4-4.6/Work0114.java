import java.util.*;
public class Work0114{
	/*
	//√∞≈›≈≈–Ú
	public static void main(String[] args){
    int[] num = {22,33,56,76,54,2,11,99999,0,-66,-48};
	int[] num2 = bubblesort(num);
	System.out.println(Arrays.toString(num2));
	}
	public static int[] bubblesort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
			if(array[j]>array[j+1]){
			int temp = array[j];
			array[j] = array[j+1];
			array[j+1] = temp;
			}
			}
			System.out.println(Arrays.toString(array));
		}
		return array;
	}
}*/
	//—°‘Ò≈≈–Ú


public static void main(String[] args){
	int[] num = {22,33,56,76,54,2,11,99999,0,-66,-48};
	num = Xuanze(num);
	System.out.println(Arrays.toString(num));
}
	public static int[] Xuanze(int[] arr){
	for(int i=0;i<arr.length-1;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
		}
	}
	return arr;
	}
}