class abc
{
public void show()
{
System.out.println("Show in base");
}
}

class over6 extends abc
{
private void show(int a)
{	System.out.println("Show in derived");	}
public static void main(String[] ar)
{ over6 v=new over6();
	v.show();
	v.show(100);
}
}