interface myint4
{
int a=100;
public void put();
}

class hello implements myint4
{
public void put()
{
System.out.println(a);
}
public static void main(String[] args)
{
new hello().put();
}
}