interface myint8
{
int a=100;
void put();
}

interface myint9
{
void show();
}

class hello implements myint8,myint9
{
public void show(){	System.out.println("Show");	}
public void put(){	System.out.println(a);	}
public static void main(String[] arg)
{
hello h=new hello();	h.show();	h.put();
}
}