interface myint8
{	int a=100;		void put();	}

interface myint10
{	void show();	}
abstract class check implements myint8,myint10
{
public void show(){	System.out.println("Show");	}
public void put(){	System.out.println(a);	}
}
class hello extends check
{
public static void main(String[] arg)
{
hello h=new hello();	h.show();	h.put();
}
}