import java.util.*;
public class Work0203{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ַ�����");
		String a = sc.next();
		int c1 = 0;
		int c2 = 0;
		for(int i=0; i<a.length(); i++){
		int tmp = Integer.parseInt(a.charAt(i) + "");
		if(i % 2 == 0){
		c1 += tmp;
		System.out.println(i+"��ż��λ���Ϊ��c1="+a.charAt(i));
		}else{
		c2 += tmp;
		System.out.println(i+"������Ϊ���Ϊ��c2="+a.charAt(i));
		}	
		}
		System.out.println("������: " + c1);
		System.out.println("ż����: " + c2);

}
}