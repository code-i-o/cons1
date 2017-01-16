interface myint5
{
int a=100;
public void put();
}

class hello implements myint5
{
public void put()
{
System.out.println(a);
}
public static void main(String[] args)
{
new myint5().put();
}
}