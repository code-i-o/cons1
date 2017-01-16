class over3
{
public void show()
{	System.out.println("Show");	}
private int show(int a)
{	System.out.println("Show"+a); return a;}

public static void main(String[] ar)
{ over3 v=new over3();
	v.show();
System.out.println(v.show(100));
}
}