class abc
{
void show()
{
System.out.println("Show in base");
}
}

class over11 extends abc
{
int show()
{	System.out.println("Show in derived");	}
public static void main(String[] ar)
{ over11 v=new over11();
	v.show();
}
}