import java.util.*;
public class Work0113{
	/*public static void main(String[] args){
		System.out.print("�����·�");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int i=1;
		for(i=1;i<=m;i++){
			System.out.println("���ӵ�"+i+"���µ�����Ϊ��"+f(i));
		}
		}
		public static int f(int x){
			if(x==1||x==2)
				return 1;
			else
				return f(x-1)+f(x-2);
	}*/
			public static void main(String[] args) {
		int amount; //ÿ���µ���������
		int nAmount = 1; //��һ���µ���������
		int oAmount = 1; //�ڶ����µ���������
		for(int i=1;i<=2;i++){
		amount=1;
		System.out.println("��" + i + "���µ���������Ϊ��" + amount);
		}
		for(int i=3;i<=12; i++) {
		amount = oAmount + nAmount;
		oAmount = nAmount;
		nAmount = amount;
		System.out.println("��" + i + "���µ���������Ϊ��" + amount);
		}
		}
	}