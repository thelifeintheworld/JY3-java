import java.util.*;
public class Work0115{
	public static void main(String[] args){
	new Work0115().baoshu2();
}
List<Integer>listNum = new ArrayList<Integer>();
StringBuffer strNum = new StringBuffer();
public void baoshu(int total,int x){
for (int i=0;i<total ;i++ )
{listNum.add(i+1);
}
for (int i=0,amount=1;listNum.size()>1 ;i++,amount++ )
{if (i>=listNum.size())
{i%=listNum.size();
System.err.println("��ǰiΪ��"+i);
}
if (amount%x==0)
{strNum.append(listNum.get(i)+"");
listNum.remove(i);
amount=1;
}
}
System.out.println(strNum.toString()+listNum.get(0));
}
public void baoshu2(){
int total = 9;
for (int i=0;i<total ;i++ )
{listNum.add(i+1);
}
int i=0,amount=1,x=2;
while (listNum.size()>0)
{if (i>=listNum.size())
{i%=listNum.size();
}
if (amount %x ==0)
{strNum.append(listNum.get(i)+"");
x=listNum.get(i);
listNum.remove(i);
amount=1;
}
if (x!=1)
{amount++;
}
System.out.println(strNum.toString());
}
}
}