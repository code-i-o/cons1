interface myint7
{
int a=100;
public void put();
public static void main(String[] args)
{
new myint7().put();
}
}

class hello implements myint7
{
public void put()
{
System.out.println(a);
}
}