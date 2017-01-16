interface myint3
{
int a=100;
public void put();
}

class hello implements myint3
{
public static void main(String[] args)
{
System.out.println("Derived");
}
}