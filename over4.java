class abc
{
public void show()
{
System.out.println("Show in base");
}
}

class over4 extends abc
{
public void show(int a)
{	System.out.println("Show in derived");	}
public static void main(String[] ar)
{ over4 v=new over4();
	v.show();
	v.show(100);
}
}