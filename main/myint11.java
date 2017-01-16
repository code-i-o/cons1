interface myint8
{	int a=100;		void show();	}

interface myint11
{	void show();	}
abstract class check implements myint8,myint11
{
public void show(){	System.out.println(a);	}
}
class hello extends check
{
public static void main(String[] arg)
{
hello h=new hello();	h.show();
}
}