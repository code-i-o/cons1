class abc
{
void show()
{
System.out.println("Show in base");
}
}

class over5 extends abc
{
public void show(int a)
{	System.out.println("Show in derived");	}
public static void main(String[] ar)
{ over5 v=new over5();
	v.show();
	v.show(100);
}
}