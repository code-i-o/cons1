class abc
{
public void show()
{
System.out.println("Show in base");
}
}

class over8 extends abc
{
void show()
{	System.out.println("Show in derived");	}
public static void main(String[] ar)
{ over8 v=new over8();
	v.show();
}
}