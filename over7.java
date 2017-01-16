class abc
{
public void show()
{
System.out.println("Show in base");
}
}

class over7 extends abc
{
public void show()
{	System.out.println("Show in derived");	}
public static void main(String[] ar)
{ over7 v=new over7();
	v.show();
}
}