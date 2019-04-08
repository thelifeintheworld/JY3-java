import java.util.*;
public class Test4{
	public static void main(String[] args){
	Random r = new Random();
	int num = r.nextInt(26);
	char c = (char)('A'+num);
	System.out.println(c);
	char a = 97;
	System.out.println(a);
	char b = '0';
	System.out.println((int)b);
	}
}
