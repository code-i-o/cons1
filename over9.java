class abc
{
void show()
{
System.out.println("Show in base");
}
}

class over9 extends abc
{
public void show()
{	System.out.println("Show in derived");	}
public static void main(String[] ar)
{ over9 v=new over9();
	v.show();
}
}