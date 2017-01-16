class over2
{
void show()
{	System.out.println("Show");	}
int show(int a)
{	System.out.println("Show"+a); return a;}

public static void main(String[] ar)
{ over2 v=new over2();
	v.show();
System.out.println(v.show(100));
}
}