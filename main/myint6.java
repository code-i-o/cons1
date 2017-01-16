interface myint6
{
int a=100;
public void put();
myint6(){ }
}

class hello implements myint6
{
public void put()
{
System.out.println(a);
}
public static void main(String[] args)
{
new myint6().put();
}
}