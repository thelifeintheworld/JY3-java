import java.util.*;
public class Test040302
{
	public static void main(String[] args){
	int i, j, k;
    for(i=1; i<5; i++)
    {
        /* 观察每行的空格数量，补全循环条件 */
        for(  j=i ; j<5;j++ )  
        {
            System.out.print(" ");    //输出空格
        }
        /* 观察每行*号的数量，补全循环条件 */
        for( k=0 ;k<2*i-1; k++ ) 
        {
           System.out.print("*");   //每行输出的*号
        }
       System.out.print("\n");     //每次循环换行
    }
	
	}

}