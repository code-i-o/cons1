class abc
{
private void show()
{
System.out.println("Show in base");
}
}

class over10 extends abc
{
private void show()
{	System.out.println("Show in derived");	}
public static void main(String[] ar)
{ over10 v=new over10();
	v.show();
}
}