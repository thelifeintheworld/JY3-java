import java.util.*;
public class Work0108{
	public static void main(String[] args){
		{
			int i,j,k;
	  for(i=1;i<1000;i++)
		  {
		  int sum=0;
		  for(j=1;j<i;j++)
			  {
			  if(i%j==0){    
				  sum+=j;
				  }
				  }
				  if(sum==i){
                    System.out.println("ÍêÊýÊÇ£º"+i);
                }
}
}
}
}