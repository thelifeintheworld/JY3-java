public class WhileDemo2{
	public static void main(String[] args){
		int i=0;
		int sum=0;
		do{
		i++;
		sum += i;
		}while(i>100);
		System.out.println(sum);
	}
}