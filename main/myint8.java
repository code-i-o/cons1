interface myint8
{
int a=100;
private void put();
}

class hello implements myint8
{
public void put()
{
System.out.println(a);
}
}